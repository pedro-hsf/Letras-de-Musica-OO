package controller;

import models.*;

public class ControleMusica {
	private Musica[] m;
	private int qtdMusicas;
	
	public ControleMusica(ControleDados d) {
		this.m = d.getMusicas();
		this.qtdMusicas = d.getQtdMusicas();
	}
	
	public String[] getNomM() {
		String[] s = new String[qtdMusicas];
		for(int i = 0; i < qtdMusicas; i++) {
			s[i] = m[i].getNomM();
		}
		
		return s;
	}
	
	public int getQtd() {
		return qtdMusicas;
	}

	public void setQtd(int qtd) {
		this.qtdMusicas = qtd;
	}
	
	public String getNomM(int i) {		
		return m[i].getNomM();
	}
	
	public String getAno(int i) {
		String ano = String.valueOf(m[i].getAno());
		return ano;
	}
	
	public String getDuracao(int i) {		
		return m[i].getDuracao();
	}
	
	/*public Genero getGenero(int i) {
		return p[i].getGenero();
	}*/

	public void setQtdMusicas(int qtdMusicas) {
		this.qtdMusicas = qtdMusicas;
	}
}