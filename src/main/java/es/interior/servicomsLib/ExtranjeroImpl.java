package es.interior.servicomsLib;

public class ExtranjeroImpl extends ComisionImpl implements Extranjero {

	private String perfil;

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	@Override
	public String toString() {
		return "Extranjero [perfil=" + perfil + "]";
	}
	
}
