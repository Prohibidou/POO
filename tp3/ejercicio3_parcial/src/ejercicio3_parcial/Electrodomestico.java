package ejercicio3_parcial;

public class Electrodomestico {
protected String modelo;
protected Double precio;
private String marca;
private String color;
private Double capacidadTotal;

public Electrodomestico(String modelo, Double precio, String marca, String color, Double capacidadTotal) {
	super();
	this.modelo = modelo;
	this.precio = precio;
	this.marca = marca;
	this.color = color;
	this.capacidadTotal = capacidadTotal;
}

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}

public Double getPrecio() {
	return precio;
}

public void setPrecio(Double precio) {
	this.precio = precio;
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public Double getCapacidadTotal() {
	return capacidadTotal;
}

public void setCapacidadTotal(Double capacidadTotal) {
	this.capacidadTotal = capacidadTotal;
}
	


	
	
}
