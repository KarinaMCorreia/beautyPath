package br.com.beautypath.modelo;

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
		if (data.length() > 10) {
			
			this.data = data.substring(0, 10);
		} else {
			this.data = data;
		}
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		if (hora.length() > 10) {
			
			this.hora = hora.substring(0, 10);
		} else {
			this.hora = hora;
		}
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		if (obs.length() > 200) {
			
			this.obs = obs.substring(0, 200);
		} else {
			this.obs = obs;
		}
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
		setData(data);
		setHora(hora);
		setObs(obs);
		setIdAgendamento(idAgendamento);
		setIdProfissional(idProfissional);
		setIdCatalogo(idCatalogo);
		setIdCliente(idCliente);
	}

	public Agendamento() {

	}

	public String getAll() {
		return "Hora: " + hora + "\nData: " + data + "\nObs: " + obs + "\nCod. agendamento: " + idAgendamento
				+ "\nCod. Cliente: " + idCliente + "\nCod. Catalogo: " + idCatalogo + "\nCod. Profissional: "
				+ idProfissional;
	}

	public void setAll(String data, String hora, String obs, int idAgendamento, Profissional idProfissional,
			Catalogo idCatalogo, Cliente idCliente) {
		setData(data);
		setHora(hora);
		setObs(obs);
		setIdAgendamento(idAgendamento);
		setIdProfissional(idProfissional);
		setIdCatalogo(idCatalogo);
		setIdCliente(idCliente);
	}
}
