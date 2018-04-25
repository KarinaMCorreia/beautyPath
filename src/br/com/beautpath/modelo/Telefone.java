package br.com.beautpath.modelo;

public class Telefone {
	private int codigoPais;
	private int ddd;
	private int ramal;

	public int getCodigoPais() {
		return codigoPais;
	}

	public void setCodigoPais(int codigoPais) {
		this.codigoPais = codigoPais;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}

	public Telefone(int codigoPais, int ddd, int ramal) {
		setCodigoPais(codigoPais);
		setDdd(ddd);
		setRamal(ramal);
	}

	public Telefone() {
		super();
	}

}
