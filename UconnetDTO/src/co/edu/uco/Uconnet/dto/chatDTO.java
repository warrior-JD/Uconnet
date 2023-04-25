package co.edu.uco.Uconnet.dto;

import java.util.UUID;

public class chatDTO {
	private UUID identificador;
	private grupoDTO grupo;
	private estadoDTO estado;
	
	
	
	public chatDTO() {
		super();
		setIdentificador(identificador);
		setGrupo(grupo);
		setEstado(estado);
	}
	
	public chatDTO(UUID identificador, grupoDTO grupo, estadoDTO estado) {
		super();
		setIdentificador(identificador);
		setGrupo(grupo);
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
	public estadoDTO getEstado() {
		return estado;
	}
	public void setEstado(estadoDTO estado) {
		this.estado = estado;
	}
	
	
	

}
