package br.com.beautpath.modelo;

public class Servico {
	private int cod_serv;
	private int qnt_serv;
	private double valor_srv;
	private String desc_srv;

	public int getCod_serv() {
		return cod_serv;
	}

	public void setCod_serv(int cod_serv) {
		this.cod_serv = cod_serv;
	}

	public int getQnt_serv() {
		return qnt_serv;
	}

	public void setQnt_serv(int qnt_serv) {
		this.qnt_serv = qnt_serv;
	}

	public double getValor_srv() {
		return valor_srv;
	}

	public void setValor_srv(double valor_srv) {
		this.valor_srv = valor_srv;
	}

	public String getDesc_srv() {
		return desc_srv;
	}

	public void setDesc_srv(String desc_srv) {
		this.desc_srv = desc_srv;
	}

	public Servico(int cod_serv, int qnt_serv, double valor_srv, String desc_srv) {
		super();
		setCod_serv(cod_serv);;
		setQnt_serv(qnt_serv);
		setValor_srv(valor_srv);
		setDesc_srv(desc_srv);
	}

	public Servico() {
	}

}
