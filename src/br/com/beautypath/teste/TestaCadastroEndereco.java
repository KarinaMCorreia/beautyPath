package br.com.beautypath.teste;

import br.com.beautypath.dao.EnderecoDAO;
import br.com.beautypath.modelo.Endereco;

public class TestaCadastroEndereco {
	public static void main(String[] args) {
		try {
			Endereco end = new Endereco();
			EnderecoDAO dao = new EnderecoDAO();
			end.setIdEndereco(1);
			end.setLogradouro("Rua Tutoia");
			end.setEstado("SP");
			end.setCidade("São Paulo");
			end.setCep("01234");
			dao.gravar(end);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
