package co.edu.uco.Uconnet.dto;

import java.util.UUID;

public class grupoDTO {

	private UUID identificador;
	private estructuraDTO estructura;
	private String nombre;
	private estadoDTO estado;
	
	
	public grupoDTO() {
		super();
		setIdentificador(identificador);
		setEstructura(estructura);
		setNombre(nombre);
		setEstado(estado);
	}
	
	
	
	public grupoDTO(UUID identificador, estructuraDTO estructura, String nombre, estadoDTO estado) {
		super();
		setIdentificador(identificador);
		setEstructura(estructura);
		setNombre(nombre);
		setEstado(estado);
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
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public estadoDTO getEstado() {
		return estado;
	}
	public void setEstado(estadoDTO estado) {
		this.estado = estado;
	}
	
	
	
}
