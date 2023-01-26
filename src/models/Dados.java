package models;

import java.util.*;

public class Dados {
	//private Usuario[] usuarios = new Usuario[10];
	private int qtdUsuarios = 0;
	private Musica[] musicas = new Musica[10];
	private int qtdMusicas = 0;
	private Letra[] letras = new Letra[10];
	private int qtdLetras = 0;
    private Artista[] artistas = new Artista[10];
    private int qtdArtistas = 0;
    private Playlist[] playlist = new Playlist[10];
    private int qtdPlaylists = 0;
    private Genero[] genero = new Genero[10];

    /*public Usuario[] getUsuarios() {
    	return usuarios;
    }
    
    public void setUsuarios(Usuario[] usuarios) {
    	this.usuarios = usuarios;
    }*/
    
    public int getQtdUsuarios() {
    	return qtdUsuarios;
    }
    
    public void setQtdUsuarios(int qtdUsuarios) {
    	this.qtdUsuarios = qtdUsuarios;
    }

    public Genero[] getGenero() {
        return genero;
    }

    //public void setGenero(Genero[] Genero) {
    //    this.Genero = Genero;
    //}
    
    public Musica[] getMusicas() {
        return musicas;
    }

    public void setMusicas(Musica[] musicas) {
        this.musicas = musicas;
    }

    public void inserirEditaMusica(Musica m, int pos) {
		this.musicas[pos] = m;
		if(pos == qtdMusicas) qtdMusicas++;
	}

    public int getQtdMusicas() {
        return qtdMusicas;
    }

    public void setQtdMusicas(int qtdMusicas) {
        this.qtdMusicas = qtdMusicas;
    }

    public Letra[] getLetras() {
        return letras;
    }

    public void setLetras(Letra[] letras) {
        this.letras = letras;
    }

    public int getQtdLetras() {
        return qtdLetras;
    }

    public void setQtdLetras(int qtdLetras) {
        this.qtdLetras = qtdLetras;
    }
    
    public Artista[] getArtistas() {
    	return artistas;
    }
    
    public void setArtistas(Artista[] artistas) {
    	this.artistas = artistas;
    }

    public void inserirEditarArtista(Artista a, int pos) {
		this.artistas[pos] = a;
		if(pos == qtdArtistas) qtdArtistas++;
	}
    
    public int getQtdArtistas() {
    	return qtdArtistas;
    }
    
    public void setQtdArtistas(int qtdArtistas) {
    	this.qtdArtistas = qtdArtistas;
    }

    public Playlist[] getPlaylists() {
        return playlist;
    }

    public void setPlaylists(Playlist[] playlists) {
        this.playlist = playlists;
    }

    public int getQtdPlaylists() {
        return qtdPlaylists;
    }

    public void inserirEditarPlaylist(Playlist p, int pos) {
		this.playlist[pos] = p;
		if(pos == qtdPlaylists) qtdPlaylists++;
	}

    public void setQtdPlaylists(int qtdPlaylists) {
        this.qtdPlaylists = qtdPlaylists;
    }
}