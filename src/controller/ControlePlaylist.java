package controller;

import models.*;

public class ControlePlaylist {
	private Playlist[] p;
	private int qtdPlaylists;
	
	public ControlePlaylist(ControleDados d) {
		p = d.getPlaylists();
		qtdPlaylists = d.getQtdPlaylists();
	}
	
	public String[] getNomePlaylist() {
		String[] s = new String[qtdPlaylists];
		for(int i = 0; i < qtdPlaylists; i++) {
			s[i] = p[i].getNomePlaylist();
		}
		
		return s;
	}
	
	public int getQtd() {
		return qtdPlaylists;
	}

	public void setQtd(int qtd) {
		this.qtdPlaylists = qtd;
	}
	
	public String getNomePlaylist(int i) {		
		return p[i].getNomePlaylist();
	}
	
	public String getAnoPlaylist(int i) {
		String anoPlaylist = String.valueOf(p[i].getAnoPlaylist());
		return anoPlaylist;
	}
	
	public void setQtdPlaylists(int qtdPlaylists) {
		this.qtdPlaylists = qtdPlaylists;
	}
}