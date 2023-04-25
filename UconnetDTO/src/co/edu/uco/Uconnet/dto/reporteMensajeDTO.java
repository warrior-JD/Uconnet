package co.edu.uco.Uconnet.dto;

import java.sql.Time;
import java.util.UUID;

public class reporteMensajeDTO {
	
	private UUID identificador;
	private mensajeDTO mensaje;
	private Time fechaCreacion;
	private participanteGrupoDTO autor;
	private causaReporteDTO causa;
	private estadoDTO estado;
	
	
	
	
	public reporteMensajeDTO() {
		super();
		setIdentificador(identificador);
		setMensaje(mensaje);
		setFechaCreacion(fechaCreacion);
		setAutor(autor);
		setCausa(causa);
		setEstado(estado);
	}
	
	
	public reporteMensajeDTO(UUID identificador, mensajeDTO mensaje, Time fechaCreacion, participanteGrupoDTO autor,
			causaReporteDTO causa, estadoDTO estado) {
		super();
		setIdentificador(identificador);
		setMensaje(mensaje);
		setFechaCreacion(fechaCreacion);
		setAutor(autor);
		setCausa(causa);
		setEstado(estado);
	}
	public UUID getIdentificador() {
		return identificador;
	}
	public void setIdentificador(UUID identificador) {
		this.identificador = identificador;
	}
	public mensajeDTO getMensaje() {
		return mensaje;
	}
	public void setMensaje(mensajeDTO mensaje) {
		this.mensaje = mensaje;
	}
	public Time getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Time fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public participanteGrupoDTO getAutor() {
		return autor;
	}
	public void setAutor(participanteGrupoDTO autor) {
		this.autor = autor;
	}
	public causaReporteDTO getCausa() {
		return causa;
	}
	public void setCausa(causaReporteDTO causa) {
		this.causa = causa;
	}
	public estadoDTO getEstado() {
		return estado;
	}
	public void setEstado(estadoDTO estado) {
		this.estado = estado;
	}
	
	
	


}
