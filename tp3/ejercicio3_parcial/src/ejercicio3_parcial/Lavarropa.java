package ejercicio3_parcial;

public class Lavarropa extends Electrodomestico {
private boolean esCargaFrontal;

public Lavarropa( String modelo, Double precio, String marca, String color, Double capacidadTotal  ,boolean esCargaFrontal) {
	super(modelo,precio, marca,color,capacidadTotal);
	this.esCargaFrontal = esCargaFrontal;
}
	
	
	
}
