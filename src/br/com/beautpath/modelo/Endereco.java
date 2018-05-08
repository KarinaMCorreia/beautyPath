package br.com.beautpath.modelo;

public class Endereco {
	private int cod_end;
	private String logradouro;
	private String cidade;
	private String cep;
	private String estado;

	public int getCod_end() {
		return cod_end;
	}

	public void setCod_end(int cod_end) {
		this.cod_end = cod_end;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		if (logradouro.length() > 30) {
			logradouro = "Endereço maior que 30";
		}
		this.logradouro = logradouro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		if (cidade.length() > 22) {
			cidade = "Cidade maior que 22";
		}
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		if (cep.length() > 9) {
			cep = "Erro!";
		}
		this.cep = cep;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		if (estado.length() > 30) {
			estado = "Estado com erro";
		}
		this.estado = estado;
	}

	public Endereco(int cod_end, String logradouro, String cidade, String cep, String estado) {
		super();
		setCod_end(cod_end);
		setLogradouro(logradouro);
		setCidade(cidade);
		setCep(cep);
		setEstado(estado);
	}

	public Endereco() {

	}

}
