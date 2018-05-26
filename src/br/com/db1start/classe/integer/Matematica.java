package br.com.db1start.classe.integer;

public class Matematica {

	private Integer valor1;
	private Integer valor2;
	private String par;
	private String impar;

	public Matematica(Integer valor1) {

	}

	public Matematica() {
		
	}

	public Integer getValor1() {
		return valor1;
	}

	public void setValor1(Integer valor1) {
		this.valor1 = valor1;
	}

	public Integer getValor2() {
		return valor2;
	}

	public void setValor2(Integer valor2) {
		this.valor2 = valor2;
	}

	public String getPar() {
		return par;
	}

	public void setPar(String par) {
		this.par = par;
	}

	public String getImpar() {
		return impar;
	}

	public void setImpar(String impar) {
		this.impar = impar;
	}

	public Integer Somar(Integer valor1, Integer valor2) {
		return valor1 + valor2;
	}

	public Integer Subtrair(Integer valor1, Integer valor2) {
		return valor1 - valor2;
	}

	public Integer Multiplicar(Integer valor1, Integer valor2) {
		return valor1 * valor2;
	}

	public Integer Dividir(Integer valor1, Integer valor2) {
		return valor1 / valor2;
	}

	public Matematica parOuImpar() {
		Matematica verificador = new Matematica(valor1);
		if (valor1 % 2 == 0) {
			verificador.setPar("é par");
			return verificador;
		} else {
			verificador.setImpar("é impar");
			return verificador;
		}

	}

	public String compararValor() {
		int maior;
		if (valor1 > valor2) {
			maior = valor1;
			return "é maior que o segundo valor.";
		} else {
			maior = valor2;
			return "é maior que o primeiro valor.";
		}
	}

}