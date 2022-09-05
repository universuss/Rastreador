package Entidade;

public class Endereco_Cliente {

	private int ID_Cliente;
	private String rua_Cliente;
	private int numero_Cliente;
	private String bairro_Cliente;
	private String estado_Cliente;
	private String cidade_Cliente;
	
	
	public int getID_Cliente() {
		return ID_Cliente;
	}
	public void setID_Cliente(int iD_Cliente) {
		ID_Cliente = iD_Cliente;
	}
	public String getRua_Cliente() {
		return rua_Cliente;
	}
	public void setRua_Cliente(String rua_Cliente) {
		this.rua_Cliente = rua_Cliente;
	}
	public int getNumero_Cliente() {
		return numero_Cliente;
	}
	public void setNumero_Cliente(int numero_Cliente) {
		this.numero_Cliente = numero_Cliente;
	}
	public String getBairro_Cliente() {
		return bairro_Cliente;
	}
	public void setBairro_Cliente(String bairro_Cliente) {
		this.bairro_Cliente = bairro_Cliente;
	}
	public String getEstado_Cliente() {
		return estado_Cliente;
	}
	public void setEstado_Cliente(String estado_Cliente) {
		this.estado_Cliente = estado_Cliente;
	}
	public String getCidade_Cliente() {
		return cidade_Cliente;
	}
	public void setCidade_Cliente(String cidade_Cliente) {
		this.cidade_Cliente = cidade_Cliente;
	}
	public Endereco_Cliente(int iD_Cliente, String rua_Cliente, int numero_Cliente, String bairro_Cliente,
			String estado_Cliente, String cidade_Cliente) {
		super();
		ID_Cliente = iD_Cliente;
		this.rua_Cliente = rua_Cliente;
		this.numero_Cliente = numero_Cliente;
		this.bairro_Cliente = bairro_Cliente;
		this.estado_Cliente = estado_Cliente;
		this.cidade_Cliente = cidade_Cliente;
	}
	
	
	
}
