package co.edu.uco.Uconnet.dto;

import java.util.UUID;

public class participanteGrupoDTO {
	
	private UUID identificador;
	private grupoDTO grupo;
	private participanteDTO participante;
	private boolean puedePublicar;
	
	
	

	public participanteGrupoDTO() {
		super();
		setIdentificador(identificador);
		setGrupo(grupo);
		setParticipante(participante);
		setPuedePublicar(puedePublicar);
	}
	
	
	public participanteGrupoDTO(UUID identificador, grupoDTO grupo, participanteDTO participante,
			boolean puedePublicar) {
		super();
		setIdentificador(identificador);
		setGrupo(grupo);
		setParticipante(participante);
		setPuedePublicar(puedePublicar);
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
	public participanteDTO getParticipante() {
		return participante;
	}
	public void setParticipante(participanteDTO participante) {
		this.participante = participante;
	}
	public boolean isPuedePublicar() {
		return puedePublicar;
	}
	public void setPuedePublicar(boolean puedePublicar) {
		this.puedePublicar = puedePublicar;
	}
	
	
	
	

}
