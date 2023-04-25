package co.edu.uco.Uconnet.dto;

import java.sql.Time;
import java.util.UUID;

public class historialLecturaDTO {
	private UUID identificador;
	private grupoDTO grupo;
	private participanteGrupoDTO participante;
	private mensajeDTO mensaje;
	private Time fecha;
	private estadoDTO estado;
	
	
	
	public historialLecturaDTO() {
		super();
		setIdentificador(identificador);
		setGrupo(grupo);
		setParticipante(participante);
		setMensaje(mensaje);
		setFecha(fecha);
		setEstado(estado);
	}
	
	
	public historialLecturaDTO(UUID identificador, grupoDTO grupo, participanteGrupoDTO participante,
			mensajeDTO mensaje, Time fecha, estadoDTO estado) {
		super();
		setIdentificador(identificador);
		setGrupo(grupo);
		setParticipante(participante);
		setMensaje(mensaje);
		setFecha(fecha);
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
	public participanteGrupoDTO getParticipante() {
		return participante;
	}
	public void setParticipante(participanteGrupoDTO participante) {
		this.participante = participante;
	}
	public mensajeDTO getMensaje() {
		return mensaje;
	}
	public void setMensaje(mensajeDTO mensaje) {
		this.mensaje = mensaje;
	}
	public Time getFecha() {
		return fecha;
	}
	public void setFecha(Time fecha) {
		this.fecha = fecha;
	}
	public estadoDTO getEstado() {
		return estado;
	}
	public void setEstado(estadoDTO estado) {
		this.estado = estado;
	}
	
	
	
		

}
