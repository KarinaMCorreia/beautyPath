package br.com.beautypath.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.beautypath.modelo.Endereco;

public class EnderecoDAO {

	private PreparedStatement ps;
	
	public String gravar(Endereco end, Connection conexao) throws SQLException {
		String sql = "insert into rm79935.endereco(COD_END, LOGRADOURO, CIDADE, CEP, ESTADO) values (?, ?, ?, ?, ?)";
		ps = conexao.prepareStatement(sql);
		ps.setInt(1, end.getIdEndereco());
		ps.setString(2, end.getLogradouro());
		ps.setString(3, end.getCidade());
		ps.setString(4, end.getCep());
		ps.setString(5, end.getEstado());
		ps.execute();
		ps.close();
		return "Endereço gravado com sucesso";
	}
	
	public int apagar(int numero, Connection conexao) throws SQLException {
		String sql = "delete from rm79935.endereco where COD_END = ?";
		ps = conexao.prepareStatement(sql);
		ps.setInt(1, numero);
		return ps.executeUpdate();
	}

}
