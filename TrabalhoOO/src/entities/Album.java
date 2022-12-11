package entities;

public class Album {
	
	private String nomeAlbum;
	private int anoLancamento;
	private Genero genero;
	private int qtdMusicas;
	public Album(String nomeAlbum, int anoLancamento, Genero genero, int qtdMusicas) {
		this.nomeAlbum = nomeAlbum;
		this.anoLancamento = anoLancamento;
		this.genero = genero;
		this.qtdMusicas = qtdMusicas;
	}
	
	public Album() {
		}

	public String getNomeAlbum() {
		return nomeAlbum;
	}

	public void setNomeAlbum(String nomeAlbum) {
		this.nomeAlbum = nomeAlbum;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public int getQtdMusicas() {
		return qtdMusicas;
	}

	public void setQtdMusicas(int qtdMusicas) {
		this.qtdMusicas = qtdMusicas;
	}


	public String toString() {
		return "\n\nALBUM : " + nomeAlbum + "\n\nANO DE LANCAMENTO : " + anoLancamento + "\n\nQUANTIDADE DE MUSICAS : " + qtdMusicas;
	}
	
	
}

