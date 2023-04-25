package co.edu.uco.Uconnet.dto;

import java.sql.Time;
import java.util.UUID;

public class reporteComentarioDTO {
	
	private UUID identificador;
	private Time fechaCreacion ;
	private comentarioDTO comentario;
	private participanteGrupoDTO autor;
	private causaReporteDTO causa;
	private estadoDTO estado;
	private respuestaReporteComentarioDTO respuesta;
	
	
	
	public reporteComentarioDTO() {
		super();
		setIdentificador(identificador);
		setFechaCreacion(fechaCreacion);
		setComentario(comentario);
		setAutor(autor);
		setCausa(causa);
		setEstado(estado);
		setRespuesta(respuesta);
	}
	
	public reporteComentarioDTO(UUID identificador, Time fechaCreacion, comentarioDTO comentario,
			participanteGrupoDTO autor, causaReporteDTO causa, estadoDTO estado,
			respuestaReporteComentarioDTO respuesta) {
		super();
		setIdentificador(identificador);
		setFechaCreacion(fechaCreacion);
		setComentario(comentario);
		setAutor(autor);
		setCausa(causa);
		setEstado(estado);
		setRespuesta(respuesta);
	}
	public UUID getIdentificador() {
		return identificador;
	}
	public void setIdentificador(UUID identificador) {
		this.identificador = identificador;
	}
	public Time getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Time fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public comentarioDTO getComentario() {
		return comentario;
	}
	public void setComentario(comentarioDTO comentario) {
		this.comentario = comentario;
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
	public respuestaReporteComentarioDTO getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(respuestaReporteComentarioDTO respuesta) {
		this.respuesta = respuesta;
	}
	
	
	
	

}
