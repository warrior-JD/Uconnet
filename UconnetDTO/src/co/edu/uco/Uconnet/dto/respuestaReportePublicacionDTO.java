package co.edu.uco.Uconnet.dto;

import java.util.UUID;

public class respuestaReportePublicacionDTO {
	
	private UUID identificador;
	private reportePublicacionDTO reportePublicacion;
	private String explicacionVeredicto;
	private estructuraAdministradorEstructuraDTO administrador;
	private estadoDTO estado;
	
	
	
	
	public respuestaReportePublicacionDTO() {
		super();
		setIdentificador(identificador);
		setReportePublicacion(reportePublicacion);
		setExplicacionVeredicto(explicacionVeredicto);
		setAdministrador(administrador);
		setEstado(estado);
	}
	
	
	public respuestaReportePublicacionDTO(UUID identificador, reportePublicacionDTO reportePublicacion,
			String explicacionVeredicto, estructuraAdministradorEstructuraDTO administrador, estadoDTO estado) {
		super();
		setIdentificador(identificador);
		setReportePublicacion(reportePublicacion);
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


	


	public reportePublicacionDTO getReportePublicacion() {
		return reportePublicacion;
	}


	public void setReportePublicacion(reportePublicacionDTO reportePublicacion) {
		this.reportePublicacion = reportePublicacion;
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
