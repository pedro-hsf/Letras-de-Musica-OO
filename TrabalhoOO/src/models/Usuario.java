package models;

/**
 * Classe Usuario herda da classe abstrata Pessoa
 * 
 * @author Nicolas Bomfim Dias Bandeira
 * @author Pedro Henrique dos Santos Ferreira
 */

public class Usuario extends Pessoa {

	public Usuario() {
		super();
	}

	/**
	 * Construtor de Usuario
	 * 
	 * @param nomeUsuario Nome do Usuario
	 * @param idadeUsuario Idade do Usuario
	 * @param nacionalidadeUsuario Nacionalidade do Usuario
	 */

	public Usuario(String nomeUsuario, int idadeUsuario, String nacionalidadeUsuario) {
		this.nome = nomeUsuario;
		this.idade = idadeUsuario;
		this.nacionalidade = nacionalidadeUsuario;
	}

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