package br.com.beautypath.excecao;

public class Excecao {
	
	public Excecao(Exception e) {
		if (e.getClass().getName().equals("java.lang.NumberFormatException")) {
			System.out.println("Erro de preenchimento\n");
		}
	}
	
	public static String getErro(Exception e) {
		if (e.getClass().getName().equals("java.lang.NumberFormatException")) {
			return "Erro de preenchimento\n";
		} else {
			return "Erro ainda não mapeado";
		}
	}
}
