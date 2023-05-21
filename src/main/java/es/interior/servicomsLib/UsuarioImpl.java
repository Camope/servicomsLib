package es.interior.servicomsLib;

import java.util.List;

public class UsuarioImpl implements Usuario {

	private String nombre;
	private String apellidos;
	private String tip;
	private String empleo;
	private String email;
	List<Solicitud> solicitudes;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public String getEmpleo() {
		return empleo;
	}

	public void setEmpleo(String empleo) {
		this.empleo = empleo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Solicitud> getSolicitudes() {
		return solicitudes;
	}

	public void setSolicitudes(List<Solicitud> solicitudes) {
		this.solicitudes = solicitudes;
	}
	
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellidos=" + apellidos + ", tip=" + tip + ", empleo=" + empleo
				+ ", email=" + email + ", solicitudes=" + solicitudes + "]";
	}
}