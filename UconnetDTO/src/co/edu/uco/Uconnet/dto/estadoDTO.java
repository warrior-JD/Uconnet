package co.edu.uco.Uconnet.dto;

import java.util.UUID;

public class estadoDTO {
	private UUID identificador;
	private String nombre;
	private tipoEstadoDTO estado;
	
	
	

	public estadoDTO() {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setEstado(estado);
	}
	
	
	public estadoDTO(UUID identificador, String nombre, tipoEstadoDTO estado) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
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
	public tipoEstadoDTO getEstado() {
		return estado;
	}
	public void setEstado(tipoEstadoDTO estado) {
		this.estado = estado;
	}
	
	
	

}
