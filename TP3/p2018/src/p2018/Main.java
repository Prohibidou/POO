package p2018;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Viaje viaje1= new Colectivo(8.0);
		Viaje viaje2= new Colectivo(8.0);
		Viaje viaje3= new Colectivo(8.0);
		ArrayList< Viaje> viajes= new ArrayList<Viaje>(); //viajes en el mes
		viajes.add(viaje1);
		viajes.add(viaje2);
		viajes.add(viaje3);

		
		
		Sube sube1 = new Sube(13.1,"maxi","123",viajes);
		
	}

}
