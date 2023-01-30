package models;

/**
 * Classe Artista herda da classe abstrata Pessoa
 * Armazena nome, idade, nacionalidade e genero musical do artista
 * 
 * @author Nicolas Bomfim Dias Bandeira
 * @author Pedro Henrique dos Santos Ferreira
 */

public class Artista extends Pessoa {
	
	private String genero;

	public Artista(){
		super();
	}

	/**
	 * Construtor de artista
	 * 
	 * @param n Nome do Artista
	 * @param ida Idade do Artista
	 * @param nac Nacionalidade do Artista
	 * @param gen Genero musical do Artista
	 */

	public Artista(String n, int ida, String nac, String gen) {
		this.nome = n;
		this.idade = ida;
		this.nacionalidade = nac;
		this.genero = gen;
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
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
		public String toString() {
			return "\n\nNOME ARTISTA OU BANDA : " + getNome() + "\n\nIDADE ARTISTA OU BANDA : " + getIdade() + 
					"\n\nNACIONALIDADE ARTISTA(S) : " + getNacionalidade() + "\n\nGENERO MUSICAL ARTISTA OU BANDA : " + getGenero();
		}
}

	
