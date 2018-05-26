package br.com.db1start.classe.string;

public class Portugues {
	
	private String texto;
	
	public Portugues() {
		
	}
	
	public Portugues(String texo) {
		super();
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public String letrasMaiusculas() {
		String letras;
		letras = texto.toLowerCase();
		return letras;
	}
	
	public String letrasMinusculas() {
		String palavra;
		palavra = texto.toLowerCase();
		return palavra;
	}
	
	
	public int quantidadeDeCaracteres() {
		int quantidade = 0;
		quantidade = texto.length();
		return quantidade;
	}
	
	public int quantidadeDeEspacos() {
		int quantidadeDeEspacos = 0;
		for(int i = 0; i < texto.length(); i++) {
			if(texto.charAt(i) == ' ') {
				quantidadeDeEspacos++;
			}
		}
		return quantidadeDeEspacos;
	}
	
	
}
