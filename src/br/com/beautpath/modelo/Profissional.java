package br.com.beautpath.modelo;

public class Profissional {
	private int cod_prof;
	private String nome_prof;
	private String tel_prof;
	private String reg_prof;
	private String social_url_1_prof;
	private String social_url_2_prof;

	public int getCod_prof() {
		return cod_prof;
	}

	public void setCod_prof(int cod_prof) {
		this.cod_prof = cod_prof;
	}

	public String getNome_prof() {
		return nome_prof;
	}

	public void setNome_prof(String nome_prof) {
		this.nome_prof = nome_prof;
	}

	public String getTel_prof() {
		return tel_prof;
	}

	public void setTel_prof(String tel_prof) {
		this.tel_prof = tel_prof;
	}

	public String getReg_prof() {
		return reg_prof;
	}

	public void setReg_prof(String reg_prof) {
		this.reg_prof = reg_prof;
	}

	public String getSocial_url_1_prof() {
		return social_url_1_prof;
	}

	public void setSocial_url_1_prof(String social_url_1_prof) {
		this.social_url_1_prof = social_url_1_prof;
	}

	public String getSocial_url_2_prof() {
		return social_url_2_prof;
	}

	public void setSocial_url_2_prof(String social_url_2_prof) {
		this.social_url_2_prof = social_url_2_prof;
	}

	public Profissional(int cod_prof, String nome_prof, String tel_prof, String reg_prof, String social_url_1_prof,
			String social_url_2_prof) {
		super();
		setCod_prof(cod_prof);
		;
		setNome_prof(nome_prof);
		setTel_prof(tel_prof);
		setReg_prof(reg_prof);
		setSocial_url_1_prof(social_url_1_prof);
		setSocial_url_2_prof(social_url_2_prof);
	}

	public Profissional() {

	}

}
