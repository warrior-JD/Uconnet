package co.edu.uco.Uconnet.dto;

import java.util.UUID;

public class tipoEstadoDTO {
	private UUID identificador;
	private String nombre;
	
	
	public tipoEstadoDTO() {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
	}
	
	
	public tipoEstadoDTO(UUID identificador, String nombre) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
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
	
	
	

}
