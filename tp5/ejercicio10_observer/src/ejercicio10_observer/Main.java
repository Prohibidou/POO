package ejercicio10_observer;

public class Main {

	public static void main(String[] args) {
//Resumen: el patron se basa en que al llamar un metodo de una clase cualquiera o que le ocurra algo a esa clase cualquiera que llamamos desde el main, se notifique a los interesados.
		// Tenes que establecer los interesados y a qué en especifico estan interesados,
		// porque a una clase le pueden ocurrir que le llamemos varios de sus metodos o
		// le cambiemos algun atributo o algo, desde el Main, y debemos informar de lo
		// que ocurrio no a todos; sino solo a los interesados de eso que pasò en
		// particular.

		SistemaMeteorologico sist = new SistemaMeteorologico();
		sist.anadirObservadores(new Reportero());
		sist.anadirObservadores(new Reportero());
		sist.anadirObservadores(new Reportero());
		sist.anadirObservadores(new Reportero());
		sist.anadirObservadores(new Reportero());
		sist.setEstadoClima("100");
		

        
		
		
	}

}
