package br.com.beautpath.modelo;

public class Endereco {

	private int idEndereco;
	private String logradouro;
	private String cidade;
	private String cep;
	private String estado;

	public int getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Endereco(int idEndereco, String logradouro, String cidade, String cep, String estado) {
		super();
		setIdEndereco(idEndereco);
		setLogradouro(logradouro);
		setCidade(cidade);
		setCep(cep);
		setEstado(estado);
	}

	public Endereco() {
		
	}
	
	
}
