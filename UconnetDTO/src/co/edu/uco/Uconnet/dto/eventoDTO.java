package co.edu.uco.Uconnet.dto;

import java.sql.Time;
import java.util.UUID;

public class eventoDTO {
	private UUID identificador;
	private String nombre;
	private estructuraAdministradorEstructuraDTO organizador;
	private tipoEventoDTO tipoevento;
	private String descripcion;
	private Time fecha;
	private agendaDTO agenda;
	private String lugar;
	private estadoDTO estado;
	
	
	
	
	
	public eventoDTO() {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setOrganizador(organizador);
		setTipoevento(tipoevento);
		setDescripcion(descripcion);
		setFecha(fecha);
		setAgenda(agenda);
		setLugar(lugar);
		setEstado(estado);
	}
	
	
	
	public eventoDTO(UUID identificador, String nombre, estructuraAdministradorEstructuraDTO organizador,
			tipoEventoDTO tipoevento, String descripcion, Time fecha, agendaDTO agenda, String lugar,
			estadoDTO estado) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setOrganizador(organizador);
		setTipoevento(tipoevento);
		setDescripcion(descripcion);
		setFecha(fecha);
		setAgenda(agenda);
		setLugar(lugar);
		setEstado(estado);
	}
	public UUID getIdentificador() {
		return identificador;
	}
	public void setIdentificador(UUID identificador) {
		this.identificador = identificador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public estructuraAdministradorEstructuraDTO getOrganizador() {
		return organizador;
	}
	public void setOrganizador(estructuraAdministradorEstructuraDTO organizador) {
		this.organizador = organizador;
	}
	public tipoEventoDTO getTipoevento() {
		return tipoevento;
	}
	public void setTipoevento(tipoEventoDTO tipoevento) {
		this.tipoevento = tipoevento;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Time getFecha() {
		return fecha;
	}
	public void setFecha(Time fecha) {
		this.fecha = fecha;
	}
	public agendaDTO getAgenda() {
		return agenda;
	}
	public void setAgenda(agendaDTO agenda) {
		this.agenda = agenda;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public estadoDTO getEstado() {
		return estado;
	}
	public void setEstado(estadoDTO estado) {
		this.estado = estado;
	}
	
	
	
	

}
