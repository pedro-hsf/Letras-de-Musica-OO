package models;

/**
 * Classe Dados que armazena os artistas e as músicas criadas
 * 
 * @author Nicolas Bomfim Dias Bandeira
 * @author Pedro Henrique dos Santos Ferreira
 */

public class Dados {
    private Artista[] artistas = new Artista[50];
    private int qtdArtistas = 0;
	private Musica[] musicas = new Musica[50];
	private int qtdMusicas = 0;
    
    public Artista[] getArtistas() {
        return artistas;
    }
    
    public void setArtistas(Artista[] artistas) {
        this.artistas = artistas;
    }

    /**
	 * Adicionar Artista
	 */

    public void adicionarArtista(Artista a, int pos) {
        this.artistas[pos] = a;
        if(pos == qtdArtistas) qtdArtistas++;
    }
    
    public int getQtdArtistas() {
        return qtdArtistas;
    }
    
    public void setQtdArtistas(int qtdArtistas) {
        this.qtdArtistas = qtdArtistas;
    }
    
    public Musica[] getMusicas() {
        return musicas;
    }

    public void setMusicas(Musica[] musicas) {
        this.musicas = musicas;
    }

    /**
	 * Adicionar Musica
	 */

    public void adicionarMusica(Musica m, int pos) {
        this.musicas[pos] = m;
        if(pos == qtdMusicas) qtdMusicas++;
    }
    
    public int getQtdMusicas() {
        return qtdMusicas;
    }
    
    public void setQtdMusicas(int qtdMusicas) {
        this.qtdMusicas = qtdMusicas;
    }
}