package br.com.beautpath.modelo;

public class Cliente {
	private int cod_cli;
	private String nome_cli;
	private String tel_cli;
	private String email_cli;
	private String social_url_cli;

	public int getCod_cli() {
		return cod_cli;
	}

	public void setCod_cli(int cod_cli) {
		this.cod_cli = cod_cli;
	}

	public String getNome_cli() {
		return nome_cli;
	}

	public void setNome_cli(String nome_cli) {
		if (nome_cli.length() > 30) {
			nome_cli = "Nome maior que 30";
		}
		this.nome_cli = nome_cli;
	}

	public String getTel_cli() {
		return tel_cli;
	}

	public void setTel_cli(String tel_cli) {
		if (tel_cli.length() > 16) {
			tel_cli = "Telefone errado";
		}
		this.tel_cli = tel_cli;
	}

	public String getEmail_cli() {
		return email_cli;
	}

	public void setEmail_cli(String email_cli) {
		if (email_cli.length() > 50) {
			email_cli = "E-mail maior que 50";
		}
		this.email_cli = email_cli;
	}

	public String getSocial_url_cli() {
		return social_url_cli;
	}

	public void setSocial_url_cli(String social_url_cli) {
		if (social_url_cli.length() > 80) {
			social_url_cli = "Campo preenchido incorretamente";
		}
		this.social_url_cli = social_url_cli;
	}

	public Cliente(int cod_cli, String nome_cli, String tel_cli, String email_cli, String social_url_cli) {
		super();
		setCod_cli(cod_cli);
		setNome_cli(nome_cli);
		setTel_cli(tel_cli);
		setEmail_cli(email_cli);
		setSocial_url_cli(social_url_cli);
	}

	public Cliente() {
		
	}

}