package ejercicio10_observer;

public class Reportero implements Observer {
	
	
	public void notificar(String clima) {
		System.out.println("ocurrio un cambio en el clima, el clima es: " + clima);
	}
}
