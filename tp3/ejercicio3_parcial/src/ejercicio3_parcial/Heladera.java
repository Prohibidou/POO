package ejercicio3_parcial;

public class Heladera extends Electrodomestico {
private Double capacidadFreezer;

public Heladera(String modelo, Double precio, String marca, String color, Double capacidadTotal  ,Double capacidadFreezer) {
	super(modelo,precio, marca,color,capacidadTotal);
	this.capacidadFreezer=capacidadFreezer;

}




}
