package Aplicacao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Statement; 

//import com.mysql.cj.xdevapi.Statement;

import Entidade.Cliente;
import Entidade.Dados_de_Rota;
import Entidade.Endereco_Cliente;
import Entidade.Usuario;

public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Cliente Cl = new Cliente(0, null, 0, 0, 0, 0);
		Usuario Us = new Usuario(0, 0, 0);
		Endereco_Cliente EC = new Endereco_Cliente(0, null, 0, null, null, null);
		Dados_de_Rota DR = new Dados_de_Rota(0, 0, 0, 0, 0);

		Connection conecta = null;

		try {
			// Indicação da conexão com o MySQL através do protocolo JDBC
			// além do IP do servidor (localhost)
			// base de dados ou schema (javamysql)
			// usuário para autenticação (root)
			// senha do usuário root

			conecta = DriverManager.getConnection("jdbc:mysql://localhost/rastreador?" + "user=root&password=posi0586");

			System.out.println("Conexão realizada com sucesso.");

			System.out.println(
					"Digite o tipo de cadastro 1 - Cliente ou 2 - Usuario ou 3 - Dados Rota - 0 Para pular a sessao");
			int opcao = new Scanner(System.in).nextInt();

			switch (opcao) {

			case 1: {
				System.out.println("Digite o codigo do cliente");
				Cl.setID_Cliente(new Scanner(System.in).nextInt());

				System.out.println("Digite o nome do cliente");
				Cl.setNome_Cliente(new Scanner(System.in).nextLine());

				System.out.println("Digite o CNPJ do cliente");
				Cl.setCNPJ_Cliente(new Scanner(System.in).nextLong());

				System.out.println("Digite o fone do cliente");
				Cl.setFone_Cliente(new Scanner(System.in).nextLong());

				System.out.println("Digite o status do cliente");
				Cl.setStatus_Cliente(new Scanner(System.in).nextInt());

				System.out.println("Digite a Rua do Cliente");
				EC.setRua_Cliente(new Scanner(System.in).nextLine());

				System.out.println("Digite o Numero do Endereco");
				EC.setNumero_Cliente(new Scanner(System.in).nextInt());

				System.out.println("Digite a Cidade do Cliente");
				EC.setCidade_Cliente(new Scanner(System.in).nextLine());

				System.out.println("Digite o Estado do Cliente");
				EC.setEstado_Cliente(new Scanner(System.in).nextLine());

				String sql = "INSERT INTO cliente(id_cliente, nome_cliente, cnpj_cliente, fone_cliente, status_cliente, endereco_cliente) VALUES(?,?, ?, ?,?,?)";

				try {
					PreparedStatement stmt = conecta.prepareStatement(sql);
					stmt.setInt(1, Cl.getID_Cliente());
					stmt.setString(2, Cl.getNome_Cliente());
					stmt.setLong(3, Cl.getCNPJ_Cliente());
					stmt.setLong(4, Cl.getFone_Cliente());
					stmt.setInt(5, Cl.getStatus_Cliente());
					stmt.setInt(6, Cl.getEndereco_Cliente());

					// stmt.setString(5, teste);

					stmt.execute();
					stmt.close();

				} catch (SQLException u) {
					throw new RuntimeException(u);
				}

				break;
			}
			case 2:

				System.out.println("Digite o sexo do Usuario");
				Us.setSexo_Usuario(new Scanner(System.in).nextInt());

				System.out.println("Digite a Data de Nascimento");
				Us.setDataNascimento_Usuario(new Scanner(System.in).nextInt());

				String sql = "INSERT INTO usuario(id_usuario, sexo_usuario,dataNascimento_usuario) VALUES(?,?, ?)";

				try {
					PreparedStatement stmt = conecta.prepareStatement(sql);
					stmt.setInt(1, Us.getID_Usuario());
					stmt.setInt(2, Us.getSexo_Usuario());
					stmt.setInt(3, Us.getDataNascimento_Usuario());

					stmt.execute();
					stmt.close();

				} catch (SQLException u) {
					throw new RuntimeException(u);
				}

				break;

			case 3:

				System.out.println("Digite a Latitude da posicao");
				DR.setLatitude(new Scanner(System.in).nextFloat());

				System.out.println("Digite a Longitude da posicao");
				DR.setLongitude(new Scanner(System.in).nextFloat());

				System.out.println("Digite a altitude da posicao");
				DR.setAltitude(new Scanner(System.in).nextFloat());

				System.out.println("Digite a data");
				DR.setData(new Scanner(System.in).nextInt());

				System.out.println("informe o usuario vigiado");
				DR.setID_Usuario(new Scanner(System.in).nextInt());

				String sql0 = "INSERT INTO dados_de_rota(id_Usuario, longitude, latitude, altitude, data) VALUES(?,?, ?, ?,?)";

				try {
					PreparedStatement stmt = conecta.prepareStatement(sql0);
					stmt.setInt(1, DR.getID_Usuario());
					stmt.setFloat(2, DR.getLongitude());
					stmt.setFloat(3, DR.getLatitude());
					stmt.setFloat(4, DR.getAltitude());
					stmt.setInt(5, DR.getData());

					stmt.execute();
					stmt.close();

				} catch (SQLException u) {
					throw new RuntimeException(u);
				}

				break;

			default:
				break;
			}

		} catch (SQLException ex) {
			// Caso ocorram erros na tentativa de conex�o com o MySQL
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}

		System.out.println(
				"Digite o tipo de consulta 1 - Cliente ou 2 - Usuario ou 3 - Dados Rota - 0 Para pular a sessao");
		int opcaoC = new Scanner(System.in).nextInt();

		switch (opcaoC) {

		case 1: {

			String sql1 = "SELECT id_cliente, nome_cliente from Cliente;";

			Statement comando = conecta.prepareStatement(sql1);

			ResultSet retorno = comando.executeQuery(sql1);


			while (retorno.next()) { 
				System.out.print(retorno.getString("id_cliente"));
				System.out.print(" - ");
				System.out.println(retorno.getString("nome_cliente"));

			}

			break;
		}
		case 2:{

			String sql2 = "SELECT sexo_usuario from Usuario;";

			Statement comando = conecta.prepareStatement(sql2);

			ResultSet retorno = comando.executeQuery(sql2);

			System.out.println("Sexo do Usuario: ");

			while (retorno.next()) { 

				System.out.println(retorno.getString("sexo_usuario"));

			}

			break;
		}

		case 3:
		{

			int cliente;
			System.out.println("Informe o cliente que querews consulta");
			cliente = new Scanner(System.in).nextInt();
			
			String sql3 = "SELECT id_usuario, latitude, longitude, altitude from dados_de_rota where id_Usuario=?;";
			
			try {
				PreparedStatement stmt = conecta.prepareStatement(sql3);
				stmt.setInt(1, cliente);
				stmt.execute();
			
		
							
				Statement comando = stmt;
				System.out.println(comando); // correto
				ResultSet retorno = stmt.executeQuery(sql3);
				
				
				
				System.out.println(retorno);
				System.out.println("Latitudes do usuario: ");

				while (retorno.next()) { 

					System.out.println(retorno.getString("latitude")+" - "+retorno.getString("longitude")+" - "+ retorno.getString("altitude"));

				}

			} catch (SQLException u) {
				throw new RuntimeException(u);
			}
		

		

			break;
		}

		default:
			break;
		}

		System.out.println(	"Digite o tipo de Alteracao 1 - Atualizacao do cadastro de clientes ou 2 - Apagar Registro de Cliente ou 0 - Para pular a sessao");
		int opcaoUp = new Scanner(System.in).nextInt();

		switch (opcaoUp) {

		case 1: {

			String sql1 = "SELECT id_cliente, nome_cliente from Cliente;";

			Statement comando = conecta.prepareStatement(sql1);

			ResultSet retorno = comando.executeQuery(sql1);


			while (retorno.next()) { 
				System.out.print(retorno.getString("id_cliente"));
				System.out.print(" - ");
				System.out.print("Nome do Cliente: ");
				System.out.println(retorno.getString("nome_cliente"));


			}
			

			try
		    {
		    
		      String query = "update cliente set nome_Cliente = ? where id_cliente = ?";


			PreparedStatement preparedStmt = conecta.prepareStatement(query);
				System.out.println("Informe o id_cliente que queres alterar");
				int cliente = new Scanner(System.in).nextInt();
		      
				preparedStmt.setInt   (2, cliente);
				System.out.println(cliente);
				
				System.out.println("Digite o novo nome do cliente");
				String newNome = new Scanner(System.in).nextLine();
		      
				preparedStmt.setString(1, newNome);
				System.out.println(newNome);
				preparedStmt.executeUpdate();
		      
				conecta.close();
		    }
		    catch (Exception e)
		    {
		      System.err.println("Got an exception! ");
		      System.err.println(e.getMessage());
		    }
			break;
		  }

				
		case 2:{

			String sql2 = "SELECT sexo_usuario from Usuario;";

			Statement comando = conecta.prepareStatement(sql2);

			ResultSet retorno = comando.executeQuery(sql2);

			System.out.println("Sexo do Usuario: ");

			while (retorno.next()) { 

				System.out.println(retorno.getString("sexo_usuario"));

			}
			break;
		}

		default:{
			break;	
		}
		}
	}
	
}
	
	
	
