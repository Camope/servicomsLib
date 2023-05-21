package es.interior.servicomsLib;

import java.util.Date;

public interface Solicitud {

	public Date getFechaSolicitud();

	public Comision getComision();

	public Usuario getUsuario();

}
