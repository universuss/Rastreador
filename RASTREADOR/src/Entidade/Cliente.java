package Entidade;

public class Cliente {

	

	private int ID_Cliente;
	private String nome_Cliente;
	private long CNPJ_Cliente;
	private long fone_Cliente;
	private int status_Cliente;
	private int endereco_Cliente;
	
	public String getNome_Cliente() {
		return nome_Cliente;
	}
	public void setNome_Cliente(String nome_Cliente) {
		this.nome_Cliente = nome_Cliente;
	}	
		
	public int getID_Cliente() {
		return ID_Cliente;
	}
	public void setID_Cliente(int iD_Cliente) {
		ID_Cliente = iD_Cliente;
	}
	public long getCNPJ_Cliente() {
		return CNPJ_Cliente;
	}
	public void setCNPJ_Cliente(long cNPJ_Cliente) {
		CNPJ_Cliente = cNPJ_Cliente;
	}
	public long getFone_Cliente() {
		return fone_Cliente;
	}
	public void setFone_Cliente(long fone_Cliente) {
		this.fone_Cliente = fone_Cliente;
	}
	public int getStatus_Cliente() {
		return status_Cliente;
	}
	public void setStatus_Cliente(int status_Cliente) {
		this.status_Cliente = status_Cliente;
	}
	public int getEndereco_Cliente() {
		return endereco_Cliente;
	}
	public void setEndereco_Cliente(int endereco_Cliente) {
		this.endereco_Cliente = endereco_Cliente;
	}
	
	public Cliente(int iD_Cliente, String nome_Cliente, long cNPJ_Cliente, long fone_Cliente, int status_Cliente,
			int endereco_Cliente) {
		super();
		ID_Cliente = iD_Cliente;
		this.nome_Cliente = nome_Cliente;
		CNPJ_Cliente = cNPJ_Cliente;
		this.fone_Cliente = fone_Cliente;
		this.status_Cliente = status_Cliente;
		this.endereco_Cliente = endereco_Cliente;
	}
			
}
