package co.edu.uco.Uconnet.dto;

import java.util.UUID;

public class personaDTO {
	private UUID identificador; 
	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;
	private String correo;
	private tipoIdentificacionDTO tipoIdentificacion;
	private String numeroIdentificacion;
	private paisDTO paisTelefono;
	private String numeroTelefono;
	private estadoDTO estado;
	private boolean telefonoConfirmado;
	private boolean correoConfirmado;
	
	
	
	public personaDTO() {
		super();
		setIdentificador(identificador);
		setPrimerNombre("");
		setSegundoNombre("");
		setPrimerApellido("");
		setSegundoApellido("");
	}
	
	public personaDTO(UUID identificador, String primerNombre, String segundoNombre, String primerApellido,
			String segundoApellido, String correo, tipoIdentificacionDTO tipoIdentificacion, String numeroIdentificacion,
			paisDTO paisTelefono, String numeroTelefono, estadoDTO estado, boolean telefonoConfirmado,
			boolean correoConfirmado) {
		super();
		setIdentificador(identificador);
		setPrimerNombre(primerNombre);
		setSegundoNombre(segundoNombre);
		setPrimerApellido(primerApellido);
		setSegundoApellido(segundoApellido);
		setCorreo(correo);
		setTipoIdentificacion(tipoIdentificacion);
		setNumeroIdentificacion(numeroIdentificacion);
		setPaisTelefono(paisTelefono);
		setNumeroTelefono(numeroTelefono);
		setEstado(estado);
		setTelefonoConfirmado(telefonoConfirmado);
		setCorreoConfirmado(correoConfirmado);
	}
	
	
	
	
	

	

	public UUID getIdentificador() {
		return identificador;
	}
	public void setIdentificador(UUID identificador) {
		this.identificador = identificador;
	}
	public String getPrimerNombre() {
		return primerNombre;
	}
	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}
	public String getSegundoNombre() {
		return segundoNombre;
	}
	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public tipoIdentificacionDTO getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(tipoIdentificacionDTO tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public paisDTO getPaisTelefono() {
		return paisTelefono;
	}

	public void setPaisTelefono(paisDTO paisTelefono) {
		this.paisTelefono = paisTelefono;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public estadoDTO getEstado() {
		return estado;
	}

	public void setEstado(estadoDTO estado) {
		this.estado = estado;
	}

	public boolean isTelefonoConfirmado() {
		return telefonoConfirmado;
	}

	public void setTelefonoConfirmado(boolean telefonoConfirmado) {
		this.telefonoConfirmado = telefonoConfirmado;
	}

	public boolean isCorreoConfirmado() {
		return correoConfirmado;
	}

	public void setCorreoConfirmado(boolean correoConfirmado) {
		this.correoConfirmado = correoConfirmado;
	}
	
	
	
	

}
