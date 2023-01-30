package models;

/**
 * Classe Música
 * Armazena nome, ano de lançamento e duração da música
 * 
 * @author Nicolas Bomfim Dias Bandeira
 * @author Pedro Henrique dos Santos Ferreira
 */

public class Musica {
	
	private String nomeMusica;
	private int ano;
	private String duracao;

	/**
	 * Construtor de música
	 * 
	 * @param nomeMusica Nome da Música
	 * @param ano Ano da Música
	 * @param duracao Duração da Música
	 */
	
	public Musica(String nomeMusica, int ano, String duracao) {
		this.nomeMusica = nomeMusica;
		this.ano = ano;
		this.duracao = duracao;
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

