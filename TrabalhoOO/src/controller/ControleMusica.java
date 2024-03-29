package controller;

import models.*;

/**
 * Classe ControleMusica controla os dados das músicas criadas
 * 
 * @author Nicolas Bomfim Dias Bandeira
 * @author Pedro Henrique dos Santos Ferreira
 */

public class ControleMusica {
	private Musica[] m;
	private int qtdMusicas;

	/**
     * Construtor de ControleMusica
     * 
     * @param d ControleDados
     */
	
	public ControleMusica(ControleDados d) {
		this.m = d.getMusicas();
		this.qtdMusicas = d.getQtdMusicas();
	}
	
	public String[] getNomeMusica() {
		String[] s = new String[qtdMusicas];
		for(int i = 0; i < qtdMusicas; i++) {
			s[i] = m[i].getNomeMusica();
		}
		
		return s;
	}
	
	public int getQtd() {
		return qtdMusicas;
	}

	public void setQtd(int qtd) {
		this.qtdMusicas = qtd;
	}
	
	public String getNomeMusica(int i) {		
		return m[i].getNomeMusica();
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