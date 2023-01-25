package controller;

import models.*;

public class ControlePlaylist {
	private Playlist[] a;
	private int qtdPlaylists;
	
	public ControlePlaylist(ControleDados d) {
		a = d.getPlaylists();
		qtdPlaylists = d.getQtdPlaylists();
	}
	
	public String[] getNomePlaylist() {
		String[] s = new String[qtdPlaylists];
		for(int i = 0; i < qtdPlaylists; i++) {
			s[i] = a[i].getNomePlaylist();
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
		return a[i].getNomePlaylist();
	}
	
	public String getAno(int i) {
		String ano = String.valueOf(a[i].getAno());
		return ano;
	}
	
	public void setQtdPlaylists(int qtdPlaylists) {
		this.qtdPlaylists = qtdPlaylists;
	}
}