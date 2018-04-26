package br.com.beautpath.modelo;

public class Endereco {
	private String rua;
	private String numero;
	private String bairro;
	private String cep;
	private String cidade;
	private String estado;

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
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

	public Endereco(String rua, String numero, String logradouro, String cep, String cidade, String estado) {
		setRua(rua);
		setNumero(numero);
		setBairro(bairro);
		setCep(cep);
		setCidade(cidade);
		setEstado(estado);
	}

	public Endereco() {
		super();
	}

}
