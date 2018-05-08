package br.com.beautpath.modelo;

/**
 * 
 * @author YURIBreion
 * @version 1.0 Classe de agendamento de serviços
 */

public class Agendamento {

	private String data;
	private String hora;
	private String obs;
	private int idAgendamento;
	private Profissional idProfissional;
	private Catalogo idCatalogo;
	private Cliente idCliente;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public int getIdAgendamento() {
		return idAgendamento;
	}

	public void setIdAgendamento(int idAgendamento) {
		this.idAgendamento = idAgendamento;
	}

	public Profissional getIdProfissional() {
		return idProfissional;
	}

	public void setIdProfissional(Profissional idProfissional) {
		this.idProfissional = idProfissional;
	}

	public Catalogo getIdCatalogo() {
		return idCatalogo;
	}

	public void setIdCatalogo(Catalogo idCatalogo) {
		this.idCatalogo = idCatalogo;
	}

	public Cliente getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Cliente idCliente) {
		this.idCliente = idCliente;
	}

	public Agendamento(String data, String hora, String obs, int idAgendamento, Profissional idProfissional,
			Catalogo idCatalogo, Cliente idCliente) {
		super();
		setData(data);;
		setHora(hora);
		setObs(obs);
		setIdAgendamento(idAgendamento);
		setIdProfissional(idProfissional);
		setIdCatalogo(idCatalogo);
		setIdCliente(idCliente);
	}

	public Agendamento() {
		
	}
	
	
	

}
