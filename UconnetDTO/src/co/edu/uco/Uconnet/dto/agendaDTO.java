package co.edu.uco.Uconnet.dto;

import java.sql.Time;
import java.util.UUID;

public class agendaDTO {
	private UUID identificador;
	private grupoDTO grupo;
	private Time fechaInicio;
	private Time fechaFin;
	private estadoDTO estado;
	
	
	
	public agendaDTO() {
		super();
		setIdentificador(identificador);
		setGrupo(grupo);
		setFechaInicio(fechaInicio);
		setFechaFin(fechaFin);
		setEstado(estado);
	}
	
	
	public agendaDTO(UUID identificador, grupoDTO grupo, Time fechaInicio, Time fechaFin, estadoDTO estado) {
		super();
		setIdentificador(identificador);
		setGrupo(grupo);
		setFechaInicio(fechaInicio);
		setFechaFin(fechaFin);
		setEstado(estado);
	}
	public UUID getIdentificador() {
		return identificador;
	}
	public void setIdentificador(UUID identificador) {
		this.identificador = identificador;
	}
	public grupoDTO getGrupo() {
		return grupo;
	}
	public void setGrupo(grupoDTO grupo) {
		this.grupo = grupo;
	}
	public Time getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Time fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Time getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Time fechaFin) {
		this.fechaFin = fechaFin;
	}
	public estadoDTO getEstado() {
		return estado;
	}
	public void setEstado(estadoDTO estado) {
		this.estado = estado;
	}
	
	
	
	

}
