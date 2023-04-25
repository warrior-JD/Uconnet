package co.edu.uco.Uconnet.dto;

import java.util.UUID;

public class organizacionDTO {
	private UUID identificador;
	private String nombre;
	private String descripcion;
	private tipoOrganizacionDTO tipoOrganizacion;
	private estadoDTO estado;
	
	
	public organizacionDTO() {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
		setTipoOrganizacion(tipoOrganizacion);
		setEstado(estado);
	}
	
	
	public organizacionDTO(UUID identificador, String nombre, String descripcion, tipoOrganizacionDTO tipoOrganizacion,
			estadoDTO estado) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
		setTipoOrganizacion(tipoOrganizacion);
		setEstado(estado);
	}
	public UUID getIdentificador() {
		return identificador;
	}
	public void setIdentificador(UUID identificador) {
		this.identificador = identificador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public tipoOrganizacionDTO getTipoOrganizacion() {
		return tipoOrganizacion;
	}
	public void setTipoOrganizacion(tipoOrganizacionDTO tipoOrganizacion) {
		this.tipoOrganizacion = tipoOrganizacion;
	}
	public estadoDTO getEstado() {
		return estado;
	}
	public void setEstado(estadoDTO estado) {
		this.estado = estado;
	}
	
	
	

}
