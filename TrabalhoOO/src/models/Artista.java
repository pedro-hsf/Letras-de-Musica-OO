package models;

import java.util.*;

public class Artista extends Pessoa {
	
	private ArrayList<String> ListaMusicas;

	public Artista(){
		super();
	}

	public Artista(String n, int ida, String nac, ArrayList<String> listaMusicas) {
		nome = n;
		this.idade = ida;
		nacionalidade = nac;
		ListaMusicas = listaMusicas;
	}	

	public ArrayList<String> getListaMusicas() {
		return ListaMusicas;
	}

	public void setListaMusicas(ArrayList<String> listaMusicas) {
		ListaMusicas = listaMusicas;
	}

	/*public String toString() {
		return "LISTA DE MUSICAS ADICIONADAS : " + ListaMusicas + "\n\nNOME ARTISTA OU BANDA : " 
				+ getNome() + "\n\nNacionalidade ARTISTA(S) : " + getNacionalidade() + "\n\nNACIONALNacionalidade ARTISTA OU BANDA : " 
				+ getNacionalNacionalidade();
	}*/

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}

	
