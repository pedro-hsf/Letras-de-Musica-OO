package controller;

import java.util.*;
import models.*;

public class ControleDados {
	private Dados d = new Dados();
	
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

	public Genero[] getGenero() {
		return this.d.getGenero();
	}
	
	// a posicao 0 do vetor dadosArtistas indica onde os dados devem ser inseridos
	public boolean inserirEditarArtista(String[] dadosArtistas) {
		if(!dadosArtistas[3].matches("[0-9]+") || !dadosArtistas[4].matches("[0-9]+") || 
				!dadosArtistas[5].matches("[0-9]+") || !dadosArtistas[6].matches("[0-9]+")) {
			return false;
		} else {
				Artista a = new Artista(dadosArtistas[1], Integer.parseInt(dadosArtistas[2]), dadosArtistas[3], 
				//dadosArtistas[4]));
				ArrayList(dadosArtistas[4]));
				d.inserirEditarArtista(a, Integer.parseInt(dadosArtistas[0]));
				return true;
		}
	}

	public boolean inserirEditarMusica(String[] dadosMusicas) {
		if(!dadosMusicas[3].matches("[0-9]+") || !dadosMusicas[4].matches("[0-9]+") || 
				!dadosMusicas[5].matches("[0-9]+") || !dadosMusicas[6].matches("[0-9]+")) {
			return false;
		} else {
				Musica m = new Musica(dadosMusicas[1], Integer.parseInt(dadosMusicas[2]), 
						dadosMusicas[3], Genero(Integer.parseInt(dadosMusicas[4])));
				d.inserirEditaMusica(m, Integer.parseInt(dadosMusicas[0]));
				return true;
		}
	}
	
	private ArrayList<String> ArrayList(String string) {
		return null;
	}
	
	public boolean removerArtista(int i) {
		String ArtistaRemovido = d.getArtistas()[i].getNome();
		
		if(i == (d.getQtdArtistas() - 1)) { // O Artista a ser removido está no final do array
			d.setQtdArtistas(d.getQtdArtistas() - 1);
			d.getArtistas()[d.getQtdArtistas()] = null;
			return true;
		} else { // o Artista a ser removido está no meio do array
			int cont = 0;
			while(d.getArtistas()[cont].getNome().compareTo(ArtistaRemovido) != 0) {
				cont++;
			}
			//Rotina swap
			for(int j = cont; j < d.getQtdArtistas() - 1; j++) {
				d.getArtistas()[j] = null;
				d.getArtistas()[j] = d.getArtistas()[j+1];
			}
			d.getArtistas()[d.getQtdArtistas()] = null;
			d.setQtdArtistas(d.getQtdArtistas() - 1);
			return true;
		}
	}

	public boolean removerMusica(int i) {
		String MusicaRemovido = d.getMusicas()[i].getNomeMusica();

		if(i == (d.getQtdMusicas() - 1)) { // O Musica a ser removido est� no final do array
			d.setQtdMusicas(d.getQtdMusicas() - 1);
			d.getMusicas()[d.getQtdMusicas()] = null;
			return true;
		} else { // o Musica a ser removido est� no meio do array
			int cont = 0;
			while(d.getMusicas()[cont].getNomeMusica().compareTo(MusicaRemovido) != 0)
				cont++;
			//Rotina swap
			for(int j = cont; j < d.getQtdMusicas() - 1; j++) {
				d.getMusicas()[j] = null;
				d.getMusicas()[j] = d.getMusicas()[j+1];
			}
			d.getMusicas()[d.getQtdMusicas()] = null;
			d.setQtdMusicas(d.getQtdMusicas() - 1);
			return true;
		}
	}
}