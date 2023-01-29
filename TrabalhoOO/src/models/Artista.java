package models;

//import java.util.*;

public class Artista extends Pessoa {
	
	//private ArrayList<String> ListaMusicas;
	private String genero;

	public Artista(){
		super();
	}

	public Artista(String n, int ida, String nac, String gen) {
		this.nome = n;
		this.idade = ida;
		this.nacionalidade = nac;
		this.genero = gen;
		//ListaMusicas = listaMusicas;
	}	

	/*public ArrayList<String> getListaMusicas() {
		return ListaMusicas;
	}

	public void setListaMusicas(ArrayList<String> listaMusicas) {
		ListaMusicas = listaMusicas;
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
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
		public String toString() {
			return "\n\nNOME ARTISTA OU BANDA : " + getNome() + "\n\nIdade ARTISTA OU BANDA : " + getIdade() + 
					"\n\nNacionalidade ARTISTA(S) : " + getNacionalidade();
		}
}

	
