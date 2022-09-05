package Entidade;

public class Usuario {
	
	private int ID_Usuario;
	private int sexo_Usuario;
	private int dataNascimento_Usuario;
	
	
	public int getID_Usuario() {
		return ID_Usuario;
	}
	public void setID_Usuario(int iD_Usuario) {
		ID_Usuario = iD_Usuario;
	}
	public int getSexo_Usuario() {
		return sexo_Usuario;
	}
	public void setSexo_Usuario(int sexo_Usuario) {
		this.sexo_Usuario = sexo_Usuario;
	}
	public int getDataNascimento_Usuario() {
		return dataNascimento_Usuario;
	}
	public void setDataNascimento_Usuario(int dataNascimento_Usuario) {
		this.dataNascimento_Usuario = dataNascimento_Usuario;
	}
	
	
	public Usuario(int iD_Usuario, int sexo_Usuario, int dataNascimento_Usuario) {
		super();
		ID_Usuario = iD_Usuario;
		this.sexo_Usuario = sexo_Usuario;
		this.dataNascimento_Usuario = dataNascimento_Usuario;
	}
	
	
	
	
}
