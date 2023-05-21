package es.interior.servicomsLib;

import java.util.Date;

public class SolicitudImpl implements Solicitud {
	
	private Date fechaSolicitud;
	private Comision comision;
	private Usuario usuario;

	public Date getFechaSolicitud() {
		return fechaSolicitud;
	}

	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	public Comision getComision() {
		return comision;
	}

	public void setComision(Comision comision) {
		this.comision = comision;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Solicitud [fechaSolicitud=" + fechaSolicitud + ", comision=" + comision.getPuesto() + ", usuario=" + usuario.getTip() + "]";
	}

}
