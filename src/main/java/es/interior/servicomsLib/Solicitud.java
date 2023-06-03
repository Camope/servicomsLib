package es.interior.servicomsLib;

import java.time.OffsetDateTime;

public interface Solicitud {

	public OffsetDateTime getFechaSolicitud();

	public Comision getComision();

	public Usuario getUsuario();

}
