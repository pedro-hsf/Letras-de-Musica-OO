package models;

public enum Genero {
	Rock(0), Pop(1), Rap(2), Trap(3), Funk(4), Jazz(5), 
	MPB(6), Forro(7);
	
	private final int valor;
	
	Genero(int opcao){
		valor = opcao;
	}

   	public int getValor() {
	   return valor;
   	}
}

