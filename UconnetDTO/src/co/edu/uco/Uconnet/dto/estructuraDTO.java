package co.edu.uco.Uconnet.dto;

import java.util.UUID;

public class estructuraDTO {
	
	private UUID identificador;
	private String nombre;
	private estructuraDTO estructuraPadre;
	private organizacionDTO organizacion;
	private estadoDTO estado;
	
	
	
	public estructuraDTO() {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setEstructuraPadre(estructuraPadre);
		setOrganizacion(organizacion);
		setEstado(estado);
	}
	
	public estructuraDTO(UUID identificador, String nombre, estructuraDTO estructuraPadre, organizacionDTO organizacion,
			estadoDTO estado) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setEstructuraPadre(estructuraPadre);
		setOrganizacion(organizacion);
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
	public estructuraDTO getEstructuraPadre() {
		return estructuraPadre;
	}
	public void setEstructuraPadre(estructuraDTO estructuraPadre) {
		this.estructuraPadre = estructuraPadre;
	}
	public organizacionDTO getOrganizacion() {
		return organizacion;
	}
	public void setOrganizacion(organizacionDTO organizacion) {
		this.organizacion = organizacion;
	}
	public estadoDTO getEstado() {
		return estado;
	}
	public void setEstado(estadoDTO estado) {
		this.estado = estado;
	}
	
	

}
