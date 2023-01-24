package controller;

import models.*;

public class ControleMusica {
	private Musica[] p;
	private int qtdMusicas;
	
	public ControleMusica(ControleDados d) {
		this.p = d.getMusicas();
		this.qtdMusicas = d.getQtdMusicas();
	}
	
	public String[] getNomeMusica() {
		String[] s = new String[qtdMusicas];
		for(int i = 0; i < qtdMusicas; i++) {
			s[i] = p[i].getNomeMusica();
		}
		
		return s;
	}
	
	public int getQtd() {
		return qtdMusicas;
	}

	public void setQtd(int qtd) {
		this.qtdMusicas = qtd;
	}
	
	public String getNome(int i) {		
		return p[i].getNomeMusica();
	}
	
	public String getAno(int i) {
		String ano = String.valueOf(p[i].getAno());
		return ano;
	}
	
	public String getDuracao(int i) {		
		return p[i].getDuracao();
	}
	
	public Genero getGenero(int i) {
		return p[i].getGenero();
	}

	public void setQtdMusicas(int qtdMusicas) {
		this.qtdMusicas = qtdMusicas;
	}
}