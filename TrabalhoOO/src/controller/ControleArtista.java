package controller;

import models.*;

/**
 * Classe ControleArtista controla as informações da classe Artista
 * 
 * @author Nicolas Bomfim Dias Bandeira
 * @author Pedro Henrique dos Santos Ferreira
 */

public class ControleArtista {
	private Artista[] a;
	private int qtdArtistas;

	/**
     * Construtor de ControleArtista
     * 
     * @param d ControleDados
     */
	
	public ControleArtista(ControleDados d) {
		a = d.getArtistas();
		qtdArtistas = d.getQtdArtistas();
	}
	
	public String[] getNomeArtista() {
		String[] s = new String[qtdArtistas];
		for(int i = 0; i < qtdArtistas; i++) {
			s[i] = a[i].getNome();
		}
		
		return s;
	}
	
	public int getQtd() {
		return qtdArtistas;
	}

	public void setQtd(int qtd) {
		this.qtdArtistas = qtd;
	}
	
	public String getNome(int i) {		
		return a[i].getNome();
	}
	
	public String getIdade(int i) {
		String idade = String.valueOf(a[i].getIdade());
		return idade;
	}

    public String getNacionalidade(int i) {		
		return a[i].getNacionalidade();
	}
	
	public void setQtdArtistas(int qtdArtistas) {
		this.qtdArtistas = qtdArtistas;
	}
}