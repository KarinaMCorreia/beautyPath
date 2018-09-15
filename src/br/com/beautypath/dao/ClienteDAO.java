package br.com.beautypath.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.beautypath.modelo.Cliente;

public class ClienteDAO {

	private Connection conexao;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public ClienteDAO() throws SQLException {
		this.conexao = new ConnectionFactory().getConnection();
	}
	

	public String gravar(Cliente cli) throws SQLException {
		String sql = "insert into rm79935.cliente(COD_CLI, NOME_CLI, TEL_CLI, EMAIL_CLI, SOCIAL_URL_CLI) values (?, ?, ?, ?, ?)";
		ps = conexao.prepareStatement(sql);
		ps.setInt(1, cli.getIdCliente());
		ps.setString(2, cli.getNome());
		ps.setString(3, cli.getTelefone());
		ps.setString(4, cli.getEmail());
		ps.setString(5, cli.getSocialUrl());
		ps.execute();
		ps.close();
		return "Cliente gravado com sucesso";
	}
	
	public int apagar(int numero) throws SQLException {
		String sql = "delete from rm79935.cliente where COD_CLI = ?";
		ps = conexao.prepareStatement(sql);
		ps.setInt(1, numero);
		return ps.executeUpdate();
	}
}
