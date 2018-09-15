package br.com.beautypath.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.beautypath.modelo.Catalogo;

public class CatalogoDAO {

	private Connection conexao;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public CatalogoDAO() throws SQLException {
		this.conexao = new ConnectionFactory().getConnection();
	}
	
	public String gravar(Catalogo cat) throws SQLException {
		String sql = "insert into rm79935.catalogo(COD_CAT, DESC_CAT) values (?, ?)";
		ps = conexao.prepareStatement(sql);
		ps.setInt(1, cat.getIdCatelogo());
		ps.setString(2, cat.getDescricao());
		ps.execute();
		ps.close();
		return "Catalogo gravado com sucesso";
	}
	
	public int apagar(int numero) throws SQLException {
		String sql = "delete from rm79935.catalogo where COD_CAT = ?";
		ps = conexao.prepareStatement(sql);
		ps.setInt(1, numero);
		return ps.executeUpdate();
	}

}
