package models;

public class Playlist {
	
	private String nomePLaylist;
	private int qtdMusicas;
	private String MusicasFav;
	
	public Playlist(String nomePLaylist, int qtdMusicas, String musicasFav) {
		this.nomePLaylist = nomePLaylist;
		this.qtdMusicas = qtdMusicas;
		MusicasFav = musicasFav;
	}
	
	public Playlist() {		
	}

	public String getNomePLaylist() {
		return nomePLaylist;
	}

	public void setNomePLaylist(String nomePLaylist) {
		this.nomePLaylist = nomePLaylist;
	}

	public int getQtdMusicas() {
		return qtdMusicas;
	}

	public void setQtdMusicas(int qtdMusicas) {
		this.qtdMusicas = qtdMusicas;
	}

	public String getMusicasFav() {
		return MusicasFav;
	}

	public void setMusicasFav(String musicasFav) {
		MusicasFav = musicasFav;
	}

	public String toString() {
		return "\n\nNOME DA PLAYLIST : " + nomePLaylist 
				+ "\n\nQUANTIDADE DE MUSICAS NA PLAYLIST : " 
				+ qtdMusicas 
				+ "\n\nMUSICAS FAVORITADAS : "
				+ MusicasFav;
	}

}

