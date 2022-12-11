package entities;

public enum Genero {
	rock(0), pop(1), rap(2), trap(3), funk(4), jazz(5), MPB(6), Forro(7);
	
	private final int valor;
	
	Genero(int opcao){
		valor = opcao;
	}
   public int getValor() {
	   return valor;
   }
}

