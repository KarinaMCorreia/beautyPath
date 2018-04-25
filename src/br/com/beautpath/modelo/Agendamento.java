package br.com.beautpath.modelo;

import java.util.Calendar;

public class Agendamento {
	private Calendar dataagendamento;
	private Calendar horaagendamento;

	public Calendar getDataagendamento() {
		return dataagendamento;
	}

	public void setDataagendamento(Calendar dataagendamento) {
		this.dataagendamento = dataagendamento;
	}

	public Calendar getHoraagendamento() {
		return horaagendamento;
	}

	public void setHoraagendamento(Calendar horaagendamento) {
		this.horaagendamento = horaagendamento;
	}

	public Agendamento(Calendar dataagendamento, Calendar horaagendamento) {
		setDataagendamento(dataagendamento);
		setHoraagendamento(horaagendamento);
	}

	public Agendamento() {
		super();
	}

}
