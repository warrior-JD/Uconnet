package co.edu.uco.Uconnet.dto;

import java.sql.Time;
import java.util.UUID;

public class publicacionDTO {
	private UUID identificador;
	private Time fecha;
	private String titulo;
	private participanteGrupoDTO autor;
	private String contenido;
	private estadoDTO estado;
	
	
	
	public publicacionDTO() {
		super();
		setIdentificador(identificador);
		setFecha(fecha);
		setTitulo(titulo);
		setAutor(autor);
		setContenido(contenido);
		setEstado(estado);
	}
	
	
	public publicacionDTO(UUID identificador, Time fecha, String titulo, participanteGrupoDTO autor, String contenido,
			estadoDTO estado) {
		super();
		setIdentificador(identificador);
		setFecha(fecha);
		setTitulo(titulo);
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
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
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
