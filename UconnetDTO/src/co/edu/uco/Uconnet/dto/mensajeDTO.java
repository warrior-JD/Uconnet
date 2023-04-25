package co.edu.uco.Uconnet.dto;

import java.sql.Time;
import java.util.UUID;

public class mensajeDTO {

	private UUID identificador;
	private String contenido;
	private Time fecha;
	private participanteGrupoDTO autor;
	private chatDTO chat;
	private estadoDTO estado;
	
	
	
	public mensajeDTO() {
		super();
		setIdentificador(identificador);
		setContenido(contenido);
		setFecha(fecha);
		setAutor(autor);
		setChat(chat);
		setEstado(estado);
	}
	
	
	
	public mensajeDTO(UUID identificador, String contenido, Time fecha, participanteGrupoDTO autor, chatDTO chat,
			estadoDTO estado) {
		super();
		setIdentificador(identificador);
		setContenido(contenido);
		setFecha(fecha);
		setAutor(autor);
		setChat(chat);
		setEstado(estado);
	}
	public UUID getIdentificador() {
		return identificador;
	}
	public void setIdentificador(UUID identificador) {
		this.identificador = identificador;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	public Time getFecha() {
		return fecha;
	}
	public void setFecha(Time fecha) {
		this.fecha = fecha;
	}
	public participanteGrupoDTO getAutor() {
		return autor;
	}
	public void setAutor(participanteGrupoDTO autor) {
		this.autor = autor;
	}
	public chatDTO getChat() {
		return chat;
	}
	public void setChat(chatDTO chat) {
		this.chat = chat;
	}
	public estadoDTO getEstado() {
		return estado;
	}
	public void setEstado(estadoDTO estado) {
		this.estado = estado;
	}
	
	
	
}
