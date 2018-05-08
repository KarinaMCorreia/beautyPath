package br.com.beautpath.modelo;

import java.util.Calendar;

/**
 * 
 * @author YURIBreion
 * @version 1.0
 * Classe de agendamento de serviços
 */

public class Agendamento {
	private int cod_agd;
	private Calendar data_agd;
	private Calendar hora_agd;
	private Cliente cod_cli;
	private Profissional cod_prof;
	private String obs;
	private Endereco cod_end;
	private Servico cod_serv;
	private Catalogo cod_cat;

	public int getCod_agd() {
		return cod_agd;
	}

	public void setCod_agd(int cod_agd) {
		this.cod_agd = cod_agd;
	}

	public Calendar getData_agd() {
		return data_agd;
	}

	public void setData_agd(Calendar data_agd) {
		this.data_agd = data_agd;
	}

	public Calendar getHora_agd() {
		return hora_agd;
	}

	public void setHora_agd(Calendar hora_agd) {
		this.hora_agd = hora_agd;
	}

	public Cliente getCod_cli() {
		return cod_cli;
	}

	public void setCod_cli(Cliente cod_cli) {
		this.cod_cli = cod_cli;
	}

	public Profissional getCod_prof() {
		return cod_prof;
	}

	public void setCod_prof(Profissional cod_prof) {
		this.cod_prof = cod_prof;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		if (obs.length() > 200) {
			obs = "Preenchimento maior que o campo";
		}
		this.obs = obs;
	}

	public Endereco getCod_end() {
		return cod_end;
	}

	public void setCod_end(Endereco cod_end) {
		this.cod_end = cod_end;
	}

	public Servico getCod_serv() {
		return cod_serv;
	}

	public void setCod_serv(Servico cod_serv) {
		this.cod_serv = cod_serv;
	}

	public Catalogo getCod_cat() {
		return cod_cat;
	}

	public void setCod_cat(Catalogo cod_cat) {
		this.cod_cat = cod_cat;
	}

	public Agendamento(int cod_agd, Calendar data_agd, Calendar hora_agd, Cliente cod_cli, Profissional cod_prof,
			String obs, Endereco cod_end, Servico cod_serv, Catalogo cod_cat) {
		super();
		setCod_agd(cod_agd);;
		setData_agd(data_agd);
		setHora_agd(hora_agd);
		setCod_cli(cod_cli);
		setCod_prof(cod_prof);
		setObs(obs);
		setCod_end(cod_end);
		setCod_serv(cod_serv);
		setCod_cat(cod_cat);
	}

	public Agendamento() {
	
	}
	
	

}
