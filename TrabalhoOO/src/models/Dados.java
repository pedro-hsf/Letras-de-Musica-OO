package models;

public class Dados {
	private Musica[] musica = new Musica[10];
	private int qtdMusica = 0;
	private Artista[] artista = new Artista[10];
	private int qtdArtista = 0;
	private Playlist[] playlist = new Playlist[10];
	private int qtdPlaylist = 0;
	private Usuario[] usuario = new Usuario[10];
	private int qtdUsuario = 0;
	
	public void preencher() {
		for(int i = 0; i < 5; i++) {
			musica[i] = new Musica("Música"+i);
			artista[i] = new Artista("Artista"+i);
			playlist[i] = new Playlist("Playlist"+i);
			usuario[i] = new Usuario("Usúario"+i);
		}
		
		qtdMusica = 5;
		qtdArtista = 5;
		qtdPlaylist = 5;
		qtdUsuario = 5;
	}

	public Musica[] getMusica() {
		return musica;
	}

	public void setMusica(Musica[] musica) {
		this.musica = musica;
	}
	
	public void inserirEditarMusica(Musica m, int pos) {
		this.musica[pos] = m;
		if(pos == qtdMusica) qtdMusica++;
	}

	public int getQtdMusica() {
		return qtdMusica;
	}

	public void setQtdMusica(int qtdMusica) {
		this.qtdMusica = qtdMusica;
	}

	public Artista[] getArtista() {
		return artista;
	}

	public void setArtista(Artista[] artista) {
		this.artista = artista;
	}
	
	public void inserirEditarArtista(Artista a, int pos) {
		this.artista[pos] = a;
		if(pos == qtdArtista) qtdArtista++;
	}

	public int getQtdArtista() {
		return qtdArtista;
	}

	public void setQtdArtista(int qtdArtista) {
		this.qtdArtista = qtdArtista;
	}

	public Playlist[] getPlaylist() {
		return playlist;
	}

	public void setPlaylist(Playlist[] playlist) {
		this.playlist = playlist;
	}

	public int getQtdPlaylist() {
		return qtdPlaylist;
	}

	public void setQtdPlaylist(int qtdPlaylist) {
		this.qtdPlaylist = qtdPlaylist;
	}

	public Usuario[] getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario[] usuario) {
		this.usuario = usuario;
	}

	public int getQtdUsuario() {
		return qtdUsuario;
	}
	
	public void inserirEditarUsuario(Usuario u, int pos) {
		this.usuario[pos] = u;
		if(pos == qtdUsuario) qtdUsuario++;
	}

	public void setQtdUsuario(int qtdUsuario) {
		this.qtdUsuario = qtdUsuario;
	}
	
	
}
