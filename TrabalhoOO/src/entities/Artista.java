package entities;

import java.util.*;

public class Artista extends Pessoa {
	
	private ArrayList<String> ListaMusicas ;


	public Artista(String nome, int idade, String nacionalidade, ArrayList<String> listaMusicas) {
		super(nome, idade, nacionalidade);
		ListaMusicas = listaMusicas;
	}



	public Artista() {
	}

	public ArrayList<String> getListaMusicas() {
		return ListaMusicas;
	}

	public void setListaMusicas(ArrayList<String> listaMusicas) {
		ListaMusicas = listaMusicas;
	}

	public String toString() {
		return "LISTA DE MUSICAS ADICIONADAS : " + ListaMusicas + "\n\nNOME ARTISTA OU BANDA : " + getNome() + "\n\nIDADE ARTISTA(S) : " + getIdade() + "\n\nNACIONALIDADE ARTISTA OU BANDA : " + getNacionalidade();
	 }
	}

	
