package p2018;

import java.util.ArrayList;
import java.util.Random;

public class Main {

     	public static void main(String[] args) {

		Viaje viajeCole= new Colectivo(8.0);
		Viaje viajeCole2= new Colectivo(8.0);

		Sube sube1 = new Sube(1999.0,"maxi","123", new ArrayList<Viaje>()); //una sube con cierta cantidad de viajes realizados hasta el momento, con un saldo actual.
		
		//para pagar el viaje debo tener cargado los viajes que tuvo la sube hasta el momento, para así calcular el descuento
		sube1.pagarViaje(viajeCole); //Quiero pagar el viaje en colectivo numero 3, por lo que debo saber la cantidad de viajes realizados antes para setear el descuento, y ver si lo puedo pagar o no según mi saldo actual.
		//cuando pago el viaje, seteo el descuento en la clase viaje, seteo su atributo descuento.
		
        Random rnd= new Random();
        
		for (int i=0; i < 16;i++) {
		  sube1.pagarViaje(new Colectivo(8.0));

		  //estoy seteando valores siempre a la misma clase, siempre le seteo el descuento a la misma clase 
              
		}


        
		
		sube1.informeMensual();


		
		
	}

}
