package br.com.beautypath.teste;

import br.com.beautypath.dao.ProfissionalDAO;
import br.com.beautypath.modelo.Profissional;

public class TestaCadastroProfissional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Profissional prof = new Profissional();
			ProfissionalDAO dao = new ProfissionalDAO();
			prof.setAll(10, "Renata Paes", "47422526", "01234234",  "@renatap", "renatada_paes");
			dao.gravar(prof);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
