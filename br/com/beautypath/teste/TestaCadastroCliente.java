package br.com.beautypath.teste;

import br.com.beautypath.dao.ClienteDAO;
import br.com.beautypath.modelo.Cliente;

public class TestaCadastroCliente {

	public static void main(String[] args) {
		
		try {
			Cliente cli = new Cliente();
			ClienteDAO dao = new ClienteDAO();
			cli.setAll(1, "Yuri Breion", "998065815", "yuribreion@br.ibm.com", "@yuribreion");
			dao.gravar(cli, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
