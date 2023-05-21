package es.interior.servicomsLib;

import java.util.Date;
import java.util.List;

public interface Comision {

	public String getPuesto();

	public String getLocalidad();

	public String getEspecialidad();

	public String getEmpleo();

	public Date getFechaPublicacion();

	public Date getFechaLimite();

	public Integer getDuracion();

	public String getDetalles();

	public List<Solicitud> getSolicitudes();

}
