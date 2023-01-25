package models;

import java.util.*;

public class Playlist {

	private ArrayList<String> listaMusicas;
	
	private String nomePlaylist;
	private int ano;
	
	public Playlist(String nomePLaylist, int ano, ArrayList<String> listaMusicas) {
		this.nomePlaylist = nomePLaylist;
		this.ano = ano;
		this.listaMusicas = listaMusicas;
	}
	
	public Playlist() {
	}

	public String getNomePlaylist() {
		return nomePlaylist;
	}

	public void setNomePLaylist(String nomePLaylist) {
		this.nomePlaylist = nomePLaylist;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public ArrayList<String> getListaMusicas() {
		return listaMusicas;
	}

	public void setListaMusicas(ArrayList<String> listaMusicas) {
		this.listaMusicas = listaMusicas;
	}
}