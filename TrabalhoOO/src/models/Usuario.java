package models;

public class Usuario extends Pessoa {

	public Usuario() {
		super();
	}

	public Usuario(String nomeUsuario, int idadeUsuario, String nacionalidadeUsuario) {
		this.nome = nomeUsuario;
		this.idade = idadeUsuario;
		this.nacionalidade = nacionalidadeUsuario;
	}

	/*public String getNomeUsuario() {
		return nomeUsuario;
	}
	
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	
	public int getIdadeUsuario() {
		return idadeUsuario;
	}
	
	public void setIdadeUsuario(int idadeUsuario) {
		this.idadeUsuario = idadeUsuario;
	}
	
	public String getNacionalidadeUsuario() {
		return nacionalidadeUsuario;
	}
	
	public void setNacionalidadeUsuario(String nacionalidadeUsuario) {
		this.nacionalidadeUsuario = nacionalidadeUsuario;
	}*/

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getNacionalidade() {
		return nacionalidade;
	}
	
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String toString() {
		return "\n\nNOME USUARIO : " + getNome() 
		+ "\n\nIDADE USUARIO : "  + getIdade()
		+ "\n\nNACIONALIDADE USUARIO : " + getNacionalidade();
	}
}