package br.com.beautypath.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.beautypath.modelo.Agendamento;
import br.com.beautypath.modelo.Cliente;
import br.com.beautypath.modelo.Endereco;
import br.com.beautypath.modelo.Profissional;

public class AgendamentoDAO {
	private Connection conexao;
	private PreparedStatement ps;
	private ResultSet rs;
	
	Cliente cli = new Cliente();
	Profissional prof = new Profissional();
	Endereco end = new Endereco();

	public AgendamentoDAO() throws SQLException {
		this.conexao = new ConnectionFactory().getConnection();
	}
	
	public String gravar(Agendamento agd) throws SQLException {
		String sql = "insert into rm79935.agendamento(COD_AGD, DATA_AGD, HORA_AGD, COD_CLI, COD_PROF, OBS, COD_END) values (?, ?, ?, ?, ?, ?, ? )";
		ps = conexao.prepareStatement(sql);
		ps.setInt(1, agd.getIdAgendamento());
		ps.setString(2, agd.getData());
		ps.setString(3, agd.getHora());
		ps.setInt(4, cli.getIdCliente());
		ps.setInt(5, prof.getIdProfissional());
		ps.setString(6, agd.getObs());
		ps.setInt(7, end.getIdEndereco());
		ps.execute();
		ps.close();
		return "Agendamento gravado com sucesso";
	}
}
