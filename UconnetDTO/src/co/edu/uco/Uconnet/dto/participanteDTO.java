package co.edu.uco.Uconnet.dto;

import java.util.UUID;

public class participanteDTO {
	private UUID identificador;
	private personaDTO persona;
	private estadoDTO estado;
	
	
	
	public participanteDTO() {
		super();
		setIdentificador(identificador);
		setPersona(persona);
		setEstado(estado);
	}
	
	
	public participanteDTO(UUID identificador, personaDTO persona, estadoDTO estado) {
		super();
		setIdentificador(identificador);
		setPersona(persona);
		setEstado(estado);
	}
	public UUID getIdentificador() {
		return identificador;
	}
	public void setIdentificador(UUID identificador) {
		this.identificador = identificador;
	}
	public personaDTO getPersona() {
		return persona;
	}
	public void setPersona(personaDTO persona) {
		this.persona = persona;
	}
	public estadoDTO getEstado() {
		return estado;
	}
	public void setEstado(estadoDTO estado) {
		this.estado = estado;
	}
	
	

}
