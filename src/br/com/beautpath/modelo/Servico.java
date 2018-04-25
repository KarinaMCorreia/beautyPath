package br.com.beautpath.modelo;

public class Servico {
	private String descricao;
	private double valor;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Servico(String descricao, double valor) {
		setDescricao(descricao);
		setValor(valor);
	}

	public Servico() {
		super();
	}

}
