package entities;

import java.util.ArrayList;
import java.util.Arrays;

public class Usuario extends Pessoa {
	
	private  ArrayList<String> favoritos;

	public Usuario(String nome, int idade, String nacionalidade, ArrayList<String> favoritos) {
		super(nome, idade, nacionalidade);
		this.favoritos = favoritos;
	}

	public Usuario() {
		
	}

	public ArrayList<String> getFavoritos() {
		return favoritos;
	}

	public void setFavoritos(ArrayList<String> favoritos) {
		this.favoritos = favoritos;
	}

	public String toString() {
		return "\n\nFAVORITAS : "  + favoritos + "\n\nNOME USUARIO : " + getNome() + "\n\nIDADE USUARIO : "  + getIdade()
		+ "\n\nNACIONALIDADE USUARIO : " + getNacionalidade();
	}
	
	
}
