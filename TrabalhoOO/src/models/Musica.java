package models;

public class Musica {
	
	private String nomeMusica;
	private int ano;
	private String duracao;
	
	public Musica(String nomeMusica, int ano, String duracao) {
		this.nomeMusica = nomeMusica;
		this.ano = ano;
		this.duracao = duracao;
		//this.genero = genero;
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
	
	public String toString() {
		return "\n\nNOME : " + nomeMusica + "\n\nANO DE LANCAMENTO DA MUSICA : " + ano 
				+ "\n\nTEMPO DE DURACAO : " + duracao;
	}
}

