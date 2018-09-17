package br.com.beautypath.teste;

import java.sql.Connection;

import javax.swing.JOptionPane;

import br.com.beautypath.dao.ConnectionFactory;

public class TestaConexao {
	public static void main(String[] args) throws Exception {
		Connection c = null;
		
		try {
			String user = JOptionPane.showInputDialog("Digite seu usu�rio");
			String pw = JOptionPane.showInputDialog("Digite sua senha");
			c = ConnectionFactory.controlarInstancia().getConnection(user, pw);
			System.out.println("Conex�o aberta");
		} catch (Exception e) {
			System.out.println("Erro de conex�o");
			e.printStackTrace();
		} finally {
			c.close();
		}
	}
}
