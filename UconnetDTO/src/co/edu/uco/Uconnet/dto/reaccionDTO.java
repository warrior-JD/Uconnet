package co.edu.uco.Uconnet.dto;

import java.sql.Time;
import java.util.UUID;

public class reaccionDTO {
	private UUID identificador;
	private Time fecha;
	private publicacionDTO publicacion;
	private participanteGrupoDTO autor;
	private tipoReaccionDTO tipo;
	
	
	
	public reaccionDTO() {
		super();
		setIdentificador(identificador);
		setFecha(fecha);
		setPublicacion(publicacion);
		setAutor(autor);
		setTipo(tipo);
	}
	
	
	
	public reaccionDTO(UUID identificador, Time fecha, publicacionDTO publicacion, participanteGrupoDTO autor,
			tipoReaccionDTO tipo) {
		super();
		setIdentificador(identificador);
		setFecha(fecha);
		setPublicacion(publicacion);
		setAutor(autor);
		setTipo(tipo);
	}
	public UUID getIdentificador() {
		return identificador;
	}
	public void setIdentificador(UUID identificador) {
		this.identificador = identificador;
	}
	public Time getFecha() {
		return fecha;
	}
	public void setFecha(Time fecha) {
		this.fecha = fecha;
	}
	public publicacionDTO getPublicacion() {
		return publicacion;
	}
	public void setPublicacion(publicacionDTO publicacion) {
		this.publicacion = publicacion;
	}
	public participanteGrupoDTO getAutor() {
		return autor;
	}
	public void setAutor(participanteGrupoDTO autor) {
		this.autor = autor;
	}
	public tipoReaccionDTO getTipo() {
		return tipo;
	}
	public void setTipo(tipoReaccionDTO tipo) {
		this.tipo = tipo;
	}
	
	
	
	

}
