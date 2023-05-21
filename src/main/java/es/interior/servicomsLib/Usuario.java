package es.interior.servicomsLib;

import java.util.List;

public interface Usuario {

	public String getNombre();

	public String getApellidos();

	public String getTip();

	public String getEmpleo();

	public String getEmail();

	public List<Solicitud> getSolicitudes();

}
