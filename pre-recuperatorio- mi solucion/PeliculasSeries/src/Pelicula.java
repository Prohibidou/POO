import java.util.Comparator;

public class Pelicula extends Obra {
	private Double recaudacion;
	private String pais;

	
	
public Pelicula(String titulo, Float duracion, Integer calif, Double recaudacion, String pais) {
		super(titulo, duracion, calif);
		this.recaudacion = recaudacion;
		this.pais = pais;
	}










@Override
public String toString() {
	return "Pelicula"+super.toString()+"[recaudacion=" + recaudacion + ", pais=" + pais + "]";
}










public Double getRecaudacion() {
	return recaudacion;
}







public void setRecaudacion(Double recaudacion) {
	this.recaudacion = recaudacion;
}







public String getPais() {
	return pais;
}






public void setPais(String pais) {
	this.pais = pais;
}














}
