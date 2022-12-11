package entities;

public class Musica {
	
	private String nomeMusica;
	private int ano;
	private String duracao;
	private String album;
	private Genero genero;
	
	public Musica(String nomeMusica, int ano, String duracao, String album, Genero genero) {
		this.nomeMusica = nomeMusica;
		this.ano = ano;
		this.duracao = duracao;
		this.album = album;
		this.genero = genero;
	}
	
	public Musica() {
		
	}

	public String getNomeMusica() {
		return nomeMusica;
	}

	public void setNomeMusica(String nomeMusica) {
		this.nomeMusica = nomeMusica;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	
	public String toString() {
		return "\n\nNOME : " + nomeMusica + "\n\nANO DE LANCAMENTO DA MUSICA : " + ano + "\n\nTEMPO DE DURACAO : " + duracao + "\n\nALBUM : " + album
				+ "\n\nGENERO : " + genero;
	}
	
	
}

