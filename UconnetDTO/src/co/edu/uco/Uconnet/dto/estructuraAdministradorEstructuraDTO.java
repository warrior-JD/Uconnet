package co.edu.uco.Uconnet.dto;

import java.util.UUID;

public class estructuraAdministradorEstructuraDTO {
	private UUID identificador;
	private estructuraDTO estructura;
	private administradorEstructuraDTO administradorEstructura;
	
	
	public estructuraAdministradorEstructuraDTO() {
		super();
		setIdentificador(identificador);
		setEstructura(estructura);
		setAdministradorEstructura(administradorEstructura);
	}
	
	
	public estructuraAdministradorEstructuraDTO(UUID identificador, estructuraDTO estructura,
			administradorEstructuraDTO administradorEstructura) {
		super();
		setIdentificador(identificador);
		setEstructura(estructura);
		setAdministradorEstructura(administradorEstructura);
	}
	public UUID getIdentificador() {
		return identificador;
	}
	public void setIdentificador(UUID identificador) {
		this.identificador = identificador;
	}
	public estructuraDTO getEstructura() {
		return estructura;
	}
	public void setEstructura(estructuraDTO estructura) {
		this.estructura = estructura;
	}
	public administradorEstructuraDTO getAdministradorEstructura() {
		return administradorEstructura;
	}
	public void setAdministradorEstructura(administradorEstructuraDTO administradorEstructura) {
		this.administradorEstructura = administradorEstructura;
	}
	
	
	

}
