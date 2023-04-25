package co.edu.uco.Uconnet.dto;

import java.util.UUID;
import java.sql.Time;

public class respuestaReporteComentarioDTO {
	private UUID identificador;
	private Time fechaRespuesta;
	private reporteComentarioDTO reporteComentario;
	private String explicacionVeredicto;
	private estructuraAdministradorEstructuraDTO administrador;
	private estadoDTO estado;
	
	
	
	
	public respuestaReporteComentarioDTO() {
		super();
		setIdentificador(identificador);
		setFechaRespuesta(fechaRespuesta);
		setReporteComentario(reporteComentario);
		setExplicacionVeredicto(explicacionVeredicto);
		setAdministrador(administrador);
		setEstado(estado);
	}
	
	
	public respuestaReporteComentarioDTO(UUID identificador, reporteComentarioDTO reporteComentario,
			String explicacionVeredicto, estructuraAdministradorEstructuraDTO administrador, estadoDTO estado) {
		super();
		setIdentificador(identificador);
		setFechaRespuesta(fechaRespuesta);
		setReporteComentario(reporteComentario);
		setExplicacionVeredicto(explicacionVeredicto);
		setAdministrador(administrador);
		setEstado(estado);
	}
	
	public UUID getIdentificador() {
		return identificador;
	}
	public void setIdentificador(UUID identificador) {
		this.identificador = identificador;
	}
	public Time getFechaRespuesta() {
		return fechaRespuesta;
	}
	public void setFechaRespuesta(Time fechaRespuesta) {
		this.fechaRespuesta = fechaRespuesta;
	}
	public reporteComentarioDTO getReporteComentario() {
		return reporteComentario;
	}
	public void setReporteComentario(reporteComentarioDTO reporteComentario) {
		this.reporteComentario = reporteComentario;
	}
	public String getExplicacionVeredicto() {
		return explicacionVeredicto;
	}
	public void setExplicacionVeredicto(String explicacionVeredicto) {
		this.explicacionVeredicto = explicacionVeredicto;
	}
	public estructuraAdministradorEstructuraDTO getAdministrador() {
		return administrador;
	}
	public void setAdministrador(estructuraAdministradorEstructuraDTO administrador) {
		this.administrador = administrador;
	}
	public estadoDTO getEstado() {
		return estado;
	}
	public void setEstado(estadoDTO estado) {
		this.estado = estado;
	}
	
	
	
	

}
