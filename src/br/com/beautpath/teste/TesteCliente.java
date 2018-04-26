package br.com.beautpath.teste;

import br.com.beautpath.modelo.Cliente;
import br.com.beautpath.modelo.Endereco;

public class TesteCliente {

	public static void main(String[] args) {
			Cliente cliente = new Cliente();
			cliente.setNome("Gaga Carolina");
			cliente.setCpf("34006467842");
			
			Endereco endereco = new Endereco();
			endereco.setCep("05584000");
			endereco.setCidade("São Paulo");
			endereco.setEstado("São Paulo");
			endereco.setBairro("Alto do Pari");
			endereco.setNumero("85");
			endereco.setRua("Rua Antonio Martins Costa");
			
			
			
					
	}

}
