package es.interior.servicomsLib;

import java.time.OffsetDateTime;
import java.util.List;

public class ComisionImpl implements Comision {
	private String puesto;
	private String localidad;
	private String especialidad;
	private String empleo;
	private OffsetDateTime fechaPublicacion;
	private OffsetDateTime fechaLimite;
	private Integer duracion;
	private String detalles;
	private List<Solicitud> solicitudes;

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getEmpleo() {
		return empleo;
	}

	public void setEmpleo(String empleo) {
		this.empleo = empleo;
	}

	public OffsetDateTime getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(OffsetDateTime fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public OffsetDateTime getFechaLimite() {
		return fechaLimite;
	}

	public void setFechaLimite(OffsetDateTime fechaLimite) {
		this.fechaLimite = fechaLimite;
	}

	public Integer getDuracion() {
		return duracion;
	}

	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}

	public String getDetalles() {
		return detalles;
	}

	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}

	public List<Solicitud> getSolicitudes() {
		return solicitudes;
	}

	public void setSolicitudes(List<Solicitud> solicitudes) {
		this.solicitudes = solicitudes;
	}

	@Override
	public String toString() {
		return "Comision [puesto=" + puesto + ", localidad=" + localidad + ", especialidad=" + especialidad
				+ ", empleo=" + empleo + ", fechaPublicacion=" + fechaPublicacion + ", fechaLimite=" + fechaLimite
				+ ", duracion=" + duracion + "]";
	}

}
