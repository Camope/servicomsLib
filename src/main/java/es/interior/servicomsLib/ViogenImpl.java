package es.interior.servicomsLib;

public class ViogenImpl extends ComisionImpl implements Viogen {

	private String riesgo;

	public String getRiesgo() {
		return riesgo;
	}

	public void setRiesgo(String riesgo) {
		this.riesgo = riesgo;
	}

	@Override
	public String toString() {
		return "Viogen [riesgo=" + riesgo + "]";
	}

}
