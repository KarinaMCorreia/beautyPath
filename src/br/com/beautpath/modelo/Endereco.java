package br.com.beautpath.modelo;

public class Endereco {
	private String rua;
	private int numero;
	private String logradouro;
	private String cep;
	private String cidade;
	private String estado;

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Endereco(String rua, int numero, String logradouro, String cep, String cidade, String estado) {
		setRua(rua);
		setNumero(numero);
		setLogradouro(logradouro);
		setCep(cep);
		setCidade(cidade);
		setEstado(estado);
	}

	public Endereco() {
		super();
	}

}
