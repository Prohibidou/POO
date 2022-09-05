package ej10.copia2;

public class NoDocente extends Personal{
private Integer jornada; //1:completa, 2:Reducida.

	public NoDocente(String nombre_completo, Double antiguedad, Integer jornada) {
	     super(nombre_completo, antiguedad);
		 this.setJornada(jornada);
	}

	public Integer getJornada() {
		return jornada;
	}

	public void setJornada(Integer jornada) {
		this.jornada = jornada;
	}

	public String cumple() {
		if (this.getJornada() == 1) {
			if (this.getCantHorasTrabMes() >= 30) {
				return("cumple");
			} else {
				return("no cumple");
			}
		} else if (this.getJornada() == 2) {
			if (this.getCantHorasTrabMes() >= 20) {
				return("cumple");
			} else {
				return("no cumple");
			}
		} 
		return "mensaje default";
	}	

	

}