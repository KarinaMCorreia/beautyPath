package br.com.beautpath.modelo;

public class Profissionais {
	private String nomeProfissional;
	private String cpfProfissional;
	private Endereco endereco;
	private Telefone celular;
	private Telefone telefone;

	public String getNomeProfissional() {
		return nomeProfissional;
	}

	public void setNomeProfissional(String nomeProfissional) {
		this.nomeProfissional = nomeProfissional;
	}

	public String getCpfProfissional() {
		return cpfProfissional;
	}

	public void setCpfProfissional(String cpfProfissional) {
		this.cpfProfissional = cpfProfissional;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone getCelular() {
		return celular;
	}

	public void setCelular(Telefone celular) {
		this.celular = celular;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public Profissionais(String nomeProfissional, String cpfProfissional, Endereco endereco, Telefone celular,
			Telefone telefone) {
		setNomeProfissional(nomeProfissional);
		setCpfProfissional(cpfProfissional);
		setEndereco(endereco);
		setCelular(celular);
		setTelefone(telefone);
	}

	public Profissionais() {
		super();
	}

}
