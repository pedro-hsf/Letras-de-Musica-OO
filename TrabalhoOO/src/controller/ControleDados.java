package controller;

import models.*;

/**
 * Classe ControleDados controla os dados de outras classes 
 * e contém os métodos necessários para o CRUD
 * 
 * @author Nicolas Bomfim Dias Bandeira
 * @author Pedro Henrique dos Santos Ferreira
 */

public class ControleDados {
	private Dados d = new Dados();
	
	/**
     * Construtor de ControleDados
     */

    public ControleDados() {
        // vazio
    }

	public Dados getDados() {
		return d;
	}
	public void setDados(Dados d) {
		this.d = d;
	}

	public Artista[] getArtistas() {
		return this.d.getArtistas();
	}
	
	public int getQtdArtistas() {
		return this.d.getQtdArtistas();
	}

	public int getQtdMusicas() {
		return this.d.getQtdMusicas();
	}
	
	public Musica[] getMusicas() {
		return this.d.getMusicas();
	}

	/**
     * Método capaz de criar um novo artista e armazena ele na classe Dados em uma ArrayList
     * 
     * @param dadosArtista
     */
	
	public boolean adicionarArtista(String[] dadosArtista) {
		Artista a = new Artista(dadosArtista[1], Integer.parseInt(dadosArtista[2]), dadosArtista[3]
		, dadosArtista[4]);
		d.adicionarArtista(a, Integer.parseInt(dadosArtista[0]));
		return true;
	}
	
	/**
	 * Método capaz de remover o artista que estava armazenado anteriormente
     *
     * @param i Index do artista na JList
     */
	
	public boolean removerArtista(int i) {
		String ArtistaRemovido = d.getArtistas()[i].getNome();
		
		if(i == (d.getQtdArtistas() - 1)) { // Verifica se o artista está no final da JList
			d.setQtdArtistas(d.getQtdArtistas() - 1);
			d.getArtistas()[d.getQtdArtistas()] = null;
			return true;
		} else { // Verifica se o artista está no meio da JList
			int cont = 0;
			while(d.getArtistas()[cont].getNome().compareTo(ArtistaRemovido) != 0) {
				cont++;
			}
			for(int j = cont; j < d.getQtdArtistas() - 1; j++) {
				d.getArtistas()[j] = null;
				d.getArtistas()[j] = d.getArtistas()[j+1];
			}
			d.getArtistas()[d.getQtdArtistas()] = null;
			d.setQtdArtistas(d.getQtdArtistas() - 1);
			return true;
		}
	}

	/**
     * Método capaz de criar uma nova música e armazena ela na classe Dados
     * 
     * @param dadosMusica
     */
	
	public boolean adicionarMusica(String[] dadosMusicas) {
		Musica m = new Musica(dadosMusicas[1], Integer.parseInt(dadosMusicas[2]),
		dadosMusicas[3]);
		d.adicionarMusica(m, Integer.parseInt(dadosMusicas[0]));
		return true;
	}

	/**
	 * Método capaz de remover a música que estava armazenada anteriormente
     *
     * @param i Index da música na JList
     */
	
	public boolean removerMusica(int i) {
		String MusicaRemovido = d.getMusicas()[i].getNomeMusica();

		if(i == (d.getQtdMusicas() - 1)) { // Verifica se a música está no final da JList
			d.setQtdMusicas(d.getQtdMusicas() - 1);
			d.getMusicas()[d.getQtdMusicas()] = null;
			return true;
		} else { // Verifica se a música está no meio da JList
			int cont = 0;
			while(d.getMusicas()[cont].getNomeMusica().compareTo(MusicaRemovido) != 0)
				cont++;
			for(int j = cont; j < d.getQtdMusicas() - 1; j++) {
				d.getMusicas()[j] = null;
				d.getMusicas()[j] = d.getMusicas()[j+1];
			}
			d.getMusicas()[d.getQtdMusicas()] = null;
			d.setQtdMusicas(d.getQtdMusicas() - 1);
			return true;
		}
	}

	/**
     * Método que busca uma música na ArrayList pelo seu nome
     *
     * @param nomeMusica Nome da música
     */

	public int buscarMusica(String nomeMusica) {
        for(int i = 0; i < d.getQtdMusicas(); i++) {
            if(d.getMusicas()[i].getNomeMusica().equals(nomeMusica)) {
                return i;
            }
        }
        return -1;
	}
}