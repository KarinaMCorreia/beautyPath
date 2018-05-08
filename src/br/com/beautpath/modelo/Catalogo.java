package br.com.beautpath.modelo;

public class Catalogo {
	private int idCatelogo;
	private String descricao;

	public int getIdCatelogo() {
		return idCatelogo;
	}

	public void setIdCatelogo(int idCatelogo) {
		this.idCatelogo = idCatelogo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Catalogo(int idCatelogo, String descricao) {
		super();
		setIdCatelogo(idCatelogo);
		setDescricao(descricao);
	}

	public Catalogo() {

	}

}
