package models;

public class Musica {
	
	private String nomM;
	private int ano;
	private String duracao;
	//private Genero genero;
	
	public Musica(String nomM, int ano, String duracao) {
		this.nomM = nomM;
		this.ano = ano;
		this.duracao = duracao;
		//this.genero = genero;
	}
	
	public Musica() {
		
	}

	public String getNomM() {
		return nomM;
	}

	public void setNomM(String nomM) {
		this.nomM = nomM;
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

	/*public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	/*public String toString() {
		return "\n\nNOME : " + nomM + "\n\nANO DE LANCAMENTO DA MUSICA : " + ano 
				+ "\n\nTEMPO DE DURACAO : " + duracao + "\n\nALBUM : " + album
				+ "\n\nGENERO : " + genero;
	}*/
}

