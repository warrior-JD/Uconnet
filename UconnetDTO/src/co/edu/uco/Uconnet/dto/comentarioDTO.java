package co.edu.uco.Uconnet.dto;

import java.sql.Time;
import java.util.UUID;

public class comentarioDTO {
	private UUID identificador;
	private Time fecha;
	private publicacionDTO publicacion;
	private comentarioDTO comentarioPadre;
	private participanteGrupoDTO autor;
	private String contenido;
	private estadoDTO estado;
	
	
	public comentarioDTO() {
		super();
		setIdentificador(identificador);
		setFecha(fecha);
		setPublicacion(publicacion);
		setComentarioPadre(comentarioPadre);
		setAutor(autor);
		setContenido(contenido);
		setEstado(estado);
	}
	
	
	public comentarioDTO(UUID identificador, Time fecha, publicacionDTO publicacion, comentarioDTO comentarioPadre,
			participanteGrupoDTO autor, String contenido, estadoDTO estado) {
		super();
		setIdentificador(identificador);
		setFecha(fecha);
		setPublicacion(publicacion);
		setComentarioPadre(comentarioPadre);
		setAutor(autor);
		setContenido(contenido);
		setEstado(estado);
	}
	public UUID getIdentificador() {
		return identificador;
	}
	public void setIdentificador(UUID identificador) {
		this.identificador = identificador;
	}
	public Time getFecha() {
		return fecha;
	}
	public void setFecha(Time fecha) {
		this.fecha = fecha;
	}
	public publicacionDTO getPublicacion() {
		return publicacion;
	}
	public void setPublicacion(publicacionDTO publicacion) {
		this.publicacion = publicacion;
	}
	public comentarioDTO getComentarioPadre() {
		return comentarioPadre;
	}
	public void setComentarioPadre(comentarioDTO comentarioPadre) {
		this.comentarioPadre = comentarioPadre;
	}
	public participanteGrupoDTO getAutor() {
		return autor;
	}
	public void setAutor(participanteGrupoDTO autor) {
		this.autor = autor;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	public estadoDTO getEstado() {
		return estado;
	}
	public void setEstado(estadoDTO estado) {
		this.estado = estado;
	}
	
	
	

}
