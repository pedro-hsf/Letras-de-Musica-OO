package models;

import java.util.*;

public class Playlist {

	private ArrayList<String> ListaMusicas;
	
	private String nomePLaylist;
	private int ano;
	
	public Playlist(String nomePLaylist, int ano, ArrayList<String> listaMusicas) {
		this.nomePLaylist = nomePLaylist;
		this.ano = ano;
		ListaMusicas = listaMusicas;
	}
	
	public Playlist() {		
	}

	public String getNomePLaylist() {
		return nomePLaylist;
	}

	public void setNomePLaylist(String nomePLaylist) {
		this.nomePLaylist = nomePLaylist;
	}

	public int getano() {
		return ano;
	}

	public void setano(int ano) {
		this.ano = ano;
	}

	/*public String toString() {
		return "\n\nNOME DA PLAYLIST : " + nomePLaylist 
				+ "\n\nQUANTIDADE DE MUSICAS NA PLAYLIST : " 
				+ ano 
				+ "\n\nMUSICAS FAVORITADAS : "
				+ MusicasFav;
	}*/
}