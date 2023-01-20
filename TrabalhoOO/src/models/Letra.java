package models;

public class Letra {
	
	private String idioma;
	private String letraCompleta;
	
	public Letra(String idioma, String letraCompleta) {
		this.idioma = idioma;
		this.letraCompleta = letraCompleta;
	}
	
	public Letra() { 
		
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getLetraCompleta() {
		return letraCompleta;
	}

	public void setLetraCompleta(String letraCompleta) {
		this.letraCompleta = letraCompleta;
	}

	
	public String toString() {
		return "\n\nIDIOMA : " + idioma + "\n\nLETRA COMPLETA :\n\n" + letraCompleta;     
	}

	
}


