package br.com.beautpath.modelo;

public class Catalogo {
	private int cod_cat;
	private String desc_cat;

	public int getCod_cat() {
		return cod_cat;
	}

	public void setCod_cat(int cod_cat) {
		this.cod_cat = cod_cat;
	}

	public String getDesc_cat() {
		return desc_cat;
	}

	public void setDesc_cat(String desc_cat) {
		if (desc_cat.length() > 100) {
			desc_cat = "Preenchimento maior que o campo";
		}
		this.desc_cat = desc_cat;
	}

	public Catalogo(int cod_cat, String desc_cat) {
		super();
		setCod_cat(cod_cat);;
		setDesc_cat(desc_cat);
	}

	public Catalogo() {

	}

}
