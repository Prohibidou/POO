package ejercicio5;

public class DirectorTorta {

	//todas las tortas de coco van a tener estos pasos, porque la idea del director es que setee los mismos atributos a una especie de torta, para así construir las tortas de coco de una manera ( pues cada torta de coco tiene un conjunto de mismos atributos)
	
	public void hacerTortaCoco(Builder torta) {		
		torta.setPaso1("hago masa durante 20min"); // hago masa
		torta.setPaso2("pongo a cocinar en 20min"); // pongo a cocinar
		torta.setPaso3("pongo ingrediente"); // pongo ingrediente
		torta.setPaso4("agrego chooclate arriba del coco");
		torta.setMasa("masa 00");
		torta.setRelleno("coco");
	}

	public void hacerTortaVainilla(Builder torta) {

		torta.setPaso1("hago masa durante 40min"); // hago masa
		torta.setPaso2("pongo a cocinar en 40min"); // pongo a cocinar
		torta.setPaso3("pongo ingrediente"); // pongo ingrediente
		torta.setPaso4("agrego leche arriba de la vainilla");
		torta.setMasa("masa 000");
		torta.setRelleno("vainilla");
	}

	public void hacerTortaPera(Builder torta) {

		torta.setPaso1("hago masa durante 80min"); // hago masa
		torta.setPaso2("pongo a cocinar en 80min "); // pongo a cocinar
		torta.setPaso3("pongo ingrediente"); // pongo ingrediente
		torta.setPaso4("agrego mas agua arriba de la pera");
		torta.setMasa("masa 00");
		torta.setRelleno("Pera");
	}

}
