package co.edu.uco.Uconnet.dto;

import java.sql.Time;
import java.util.UUID;

public class historialChatGrupoDTO {
	
	private UUID identificador;
	private chatDTO chat;
	private participanteGrupoDTO participante;
	private Time fechaIngresoChat;
	
	
	
	public historialChatGrupoDTO() {
		super();
		setIdentificador(identificador);
		setChat(chat);
		setParticipante(participante);
		setFechaIngresoChat(fechaIngresoChat);
	}
	
	
	
	public historialChatGrupoDTO(UUID identificador, chatDTO chat, participanteGrupoDTO participante,
			Time fechaIngresoChat) {
		super();
		setIdentificador(identificador);
		setChat(chat);
		setParticipante(participante);
		setFechaIngresoChat(fechaIngresoChat);
	}
	public UUID getIdentificador() {
		return identificador;
	}
	public void setIdentificador(UUID identificador) {
		this.identificador = identificador;
	}
	public chatDTO getChat() {
		return chat;
	}
	public void setChat(chatDTO chat) {
		this.chat = chat;
	}
	public participanteGrupoDTO getParticipante() {
		return participante;
	}
	public void setParticipante(participanteGrupoDTO participante) {
		this.participante = participante;
	}
	public Time getFechaIngresoChat() {
		return fechaIngresoChat;
	}
	public void setFechaIngresoChat(Time fechaIngresoChat) {
		this.fechaIngresoChat = fechaIngresoChat;
	}
	
	
	
	
	

}
