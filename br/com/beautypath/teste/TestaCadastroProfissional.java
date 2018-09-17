package br.com.beautypath.teste;

import java.sql.Connection;

import javax.swing.JOptionPane;

import br.com.beautypath.dao.ConnectionFactory;
import br.com.beautypath.dao.ProfissionalDAO;
import br.com.beautypath.excecao.Excecao;
import br.com.beautypath.modelo.Profissional;

public class TestaCadastroProfissional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String user = JOptionPane.showInputDialog("Digite seu usu�rio");
			String pw = JOptionPane.showInputDialog("Digite a sua senha");
			Connection c = ConnectionFactory.controlarInstancia().getConnection(user, pw);
			
			Profissional prof = new Profissional();
			ProfissionalDAO dao = new ProfissionalDAO();
			
			prof.setNome(JOptionPane.showInputDialog("Digite o nome do profissional"));
			prof.setTelefone(JOptionPane.showInputDialog("Entre com o telefone:"));
			prof.setRegistro(JOptionPane.showInputDialog("Digite o registro o registro:"));
			prof.setSocialUrl(JOptionPane.showInputDialog("Digite sua primeira rede social:"));
			prof.setSocialUrl1(JOptionPane.showInputDialog("Digite sua segunda rede social"));
			
			dao.gravar(prof, c);
		} catch (Exception e) {
			Excecao.getErro(e);
			e.printStackTrace();
		}
	}

}
