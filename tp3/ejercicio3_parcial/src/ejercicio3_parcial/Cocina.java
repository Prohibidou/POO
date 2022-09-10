package ejercicio3_parcial;

public class Cocina extends Electrodomestico {
private boolean electrica ;

public Cocina( String modelo, Double precio, String marca, String color, Double capacidadTotal  ,boolean electrica) {
	super(modelo,precio, marca,color,capacidadTotal);
	this.electrica = electrica;
}

	
	
}
