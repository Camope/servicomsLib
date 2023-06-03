package es.interior.servicomsLib;

import java.time.OffsetDateTime;
import java.util.List;

public interface Comision {

	public String getPuesto();

	public String getLocalidad();

	public String getEspecialidad();

	public String getEmpleo();

	public OffsetDateTime getFechaPublicacion();

	public OffsetDateTime getFechaLimite();

	public Integer getDuracion();

	public String getDetalles();

	public List<Solicitud> getSolicitudes();

}
