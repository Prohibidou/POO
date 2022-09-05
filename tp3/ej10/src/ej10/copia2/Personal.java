package ej10.copia2;

public abstract class Personal {
protected String nombre_completo;
protected Double antiguedad;
protected Double cantHorasTrabMes;
protected Double horasAsignadas;


public Personal(String nombre_completo, Double antiguedad) {
	super();
	this.nombre_completo = nombre_completo;
	this.antiguedad = antiguedad;
}

public abstract String cumple();


public String getNombre_completo() {
	return nombre_completo;
}

public void setNombre_completo(String nombre_completo) {
	this.nombre_completo = nombre_completo;
}

public Double getAntiguedad() {
	return antiguedad;
}

public void setAntiguedad(Double antiguedad) {
	this.antiguedad = antiguedad;
}
public Double getCantHorasTrabMes() {
	return cantHorasTrabMes;
}
public void setCantHorasTrabMes(Double cantHorasTrabMes) {
	this.cantHorasTrabMes = cantHorasTrabMes;
}
	

}
