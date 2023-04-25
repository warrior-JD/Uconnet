package co.edu.uco.Uconnet.dto;



import java.sql.Time;
import java.util.UUID;

public class respuestaReporteMensajeDTO {
	
	private UUID identificador;
	private Time fechaRespuesta;
	private reporteMensajeDTO reporteMensaje;
	private String explicacionVeredicto;
	private estructuraAdministradorEstructuraDTO administrador;
	private estadoDTO estado;
	
	
	
	public respuestaReporteMensajeDTO() {
		super();
		setIdentificador(identificador);
		setFechaRespuesta(fechaRespuesta);
		setReporteMensaje(reporteMensaje);
		setExplicacionVeredicto(explicacionVeredicto);
		setAdministrador(administrador);
		setEstado(estado);
	}
	
	
	
	public respuestaReporteMensajeDTO(UUID identificador, Time fechaRespuesta, reporteMensajeDTO reporteMensaje,
			String explicacionVeredicto, estructuraAdministradorEstructuraDTO administrador, estadoDTO estado) {
		super();
		setIdentificador(identificador);
		setFechaRespuesta(fechaRespuesta);
		setReporteMensaje(reporteMensaje);
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
	public reporteMensajeDTO getReporteMensaje() {
		return reporteMensaje;
	}
	public void setReporteMensaje(reporteMensajeDTO reporteMensaje) {
		this.reporteMensaje = reporteMensaje;
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
