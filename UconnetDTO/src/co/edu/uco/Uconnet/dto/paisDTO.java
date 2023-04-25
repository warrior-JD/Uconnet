package co.edu.uco.Uconnet.dto;

import java.util.UUID;

public class paisDTO {
	private UUID identificador;
	private String nombre;
	private String indicadorPais;
	
	
	public paisDTO() {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setIndicadorPais(indicadorPais);
	}
	
	
	
	public paisDTO(UUID identificador, String nombre, String indicadorPais) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setIndicadorPais(indicadorPais);
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
	public String getIndicadorPais() {
		return indicadorPais;
	}
	public void setIndicadorPais(String indicadorPais) {
		this.indicadorPais = indicadorPais;
	}
	
	
	

}
