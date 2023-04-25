package co.edu.uco.Uconnet.dto;

import java.util.UUID;

public class organizacionAdministradorOrganizacionDTO {
	private UUID identificador;
	private organizacionDTO organizacion;
	private administradorOrganizacionDTO administradorOrganizacion;
	
	
	public organizacionAdministradorOrganizacionDTO() {
		super();
		setIdentificador(identificador);
		setOrganizacion(organizacion);
		setAdministradorOrganizacion(administradorOrganizacion);
	}
	
	
	public organizacionAdministradorOrganizacionDTO(UUID identificador, organizacionDTO organizacion,
			administradorOrganizacionDTO administradorOrganizacion) {
		super();
		setIdentificador(identificador);
		setOrganizacion(organizacion);
		setAdministradorOrganizacion(administradorOrganizacion);
	}
	
	
	public UUID getIdentificador() {
		return identificador;
	}
	public void setIdentificador(UUID identificador) {
		this.identificador = identificador;
	}
	public organizacionDTO getOrganizacion() {
		return organizacion;
	}
	public void setOrganizacion(organizacionDTO organizacion) {
		this.organizacion = organizacion;
	}
	public administradorOrganizacionDTO getAdministradorOrganizacion() {
		return administradorOrganizacion;
	}
	public void setAdministradorOrganizacion(administradorOrganizacionDTO administradorOrganizacion) {
		this.administradorOrganizacion = administradorOrganizacion;
	}
	
	
	
	
	

}
