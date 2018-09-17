package br.com.beautypath.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;

public final class ConnectionFactory {

	private static ConnectionFactory conexao = null;

	public static ConnectionFactory controlarInstancia() {
		if (conexao == null) {
			conexao = new ConnectionFactory();
		}
		return conexao;
	}

	public Connection getConnection(String user, String pw) throws Exception {
		FileReader arquivo = new FileReader(System.getProperty("user.dir") + ("/conexao/banco.txt"));
		BufferedReader dados = new BufferedReader(arquivo);
		String url = dados.readLine();
		if (url.indexOf("oracle") > 0) {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} else {
			System.out.println("Erro ao achar o driver");
		}
		dados.close();
		return DriverManager.getConnection(url, user, pw);
	}
}
