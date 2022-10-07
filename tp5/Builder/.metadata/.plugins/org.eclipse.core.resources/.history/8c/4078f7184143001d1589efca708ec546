package main;

import autos.Auto;
import autos.Manual;
import builder.AutoBuilder;
import builder.ManualUsuarioAutoBuilder;
import director.Director;

public class Main {

	public static void main(String[] args) {
		Director director = new Director();
		//A Director se le pasa un builder concreto desde el cliente (el codigo mismo). 
		//Esto es porque la aplicacion sabe cual builder se debe usar para obtener un producto (objeto) especifico
		AutoBuilder builder = new AutoBuilder();
		director.buildAutoDeportivo(builder);
		
		/* el producto final es obtenido del objeto builder, desde que el director no es conciente y no depende 
		 * de los builder concretos ni productos (objetos a construir).
		 */
		Auto auto = builder.getResultado();
		System.out.println("Auto construido: "+ auto.getTipo());
		
		ManualUsuarioAutoBuilder manualBuilder = new ManualUsuarioAutoBuilder();
		
		//Director puede conocer diferentes formas de construir.
		
		director.buildAutoDeportivo(manualBuilder);
		Manual manual = manualBuilder.getResultado();
		System.out.println("Manual de auto construido: "+ manual);
	}

}
