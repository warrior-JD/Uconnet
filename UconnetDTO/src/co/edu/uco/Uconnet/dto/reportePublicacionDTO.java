package co.edu.uco.Uconnet.dto;

import java.sql.Time;
import java.util.UUID;

public class reportePublicacionDTO {
	private UUID identificador;
	private Time fechaCreacion;
	private publicacionDTO publicacion;
	private participanteGrupoDTO autor;
	private causaReporteDTO causa;
	private estadoDTO estado;
	
	
	
	public reportePublicacionDTO() {
		super();
		setIdentificador(identificador);
		setFechaCreacion(fechaCreacion);
		setPublicacion(publicacion);
		setAutor(autor);
		setCausa(causa);
		setEstado(estado);
	}
	
	
	
	public reportePublicacionDTO(UUID identificador, Time fechaCreacion, publicacionDTO publicacion,
			participanteGrupoDTO autor, causaReporteDTO causa, estadoDTO estado) {
		super();
		setIdentificador(identificador);
		setFechaCreacion(fechaCreacion);
		setPublicacion(publicacion);
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
	public Time getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Time fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public publicacionDTO getPublicacion() {
		return publicacion;
	}
	public void setPublicacion(publicacionDTO publicacion) {
		this.publicacion = publicacion;
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
