package models;

//import java.util.*;

public class Playlist {

	//private ArrayList<String> listaMusicas;
	
	private String nomePlaylist;
	private int anoPlaylist;
	
	public Playlist(String nomePLaylist, int anoPlaylist) {
		this.nomePlaylist = nomePLaylist;
		this.anoPlaylist = anoPlaylist;
		//this.listaMusicas = listaMusicas;
	}
	
	public Playlist() {
	}

	public String getNomePlaylist() {
		return nomePlaylist;
	}

	public void setNomePLaylist(String nomePLaylist) {
		this.nomePlaylist = nomePLaylist;
	}

	public int getAnoPlaylist() {
		return anoPlaylist;
	}

	public void setAnoPlaylist(int anoPlaylist) {
		this.anoPlaylist = anoPlaylist;
	}

	/*public ArrayList<String> getListaMusicas() {
		return listaMusicas;
	}

	public void setListaMusicas(ArrayList<String> listaMusicas) {
		this.listaMusicas = listaMusicas;
	}*/
}