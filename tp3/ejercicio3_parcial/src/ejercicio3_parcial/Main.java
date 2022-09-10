package ejercicio3_parcial;

import java.util.ArrayList;
import java.util.Random;
//indexOf devuelve -1 si esta ese elemento en el arreglo
public class Main {

	public static void main(String[] args) {
    ArrayList<Electrodomestico> electrods = new ArrayList<Electrodomestico>();
		Random rnd= new Random();
		for (int i =0; i<10; i++ ) {
			electrods.add(new Heladera("modelo"+i, rnd.nextDouble(0, 20000), "marca"+i, "color"+i, rnd.nextDouble(0, 200)  ,rnd.nextDouble(0, 200)));
			electrods.add(new Lavarropa("modelo"+i+2, rnd.nextDouble(0, 20000), "marca"+i+2, "color"+i+2, rnd.nextDouble(0, 200)  , rnd.nextBoolean()));
			electrods.add(new Cocina("modelo"+i+3, rnd.nextDouble(0, 20000), "marca"+i+2, "color"+i+2, rnd.nextDouble(0, 200)  , rnd.nextBoolean()));
		
	}
		
		ArrayList<String> electroAux= new ArrayList<String>();
		for (int i =0; i<12; i++ ) {
			int ran= rnd.nextInt(0, 30);
			if (electrods.get(ran) instanceof Heladera && !electroAux.contains(electrods.get(ran).getModelo())) {
				electroAux.add(electrods.get(ran).getModelo());  
				electrods.get(ran).getModelo();
				System.out.println("heladerera    "+electrods.get(ran).getModelo()+ "     precio  "+electrods.get(ran).getPrecio() +electrods.get(ran).getCapacidadTotal()+electrods.get(ran).getMarca());
			}
			else if (electrods.get(ran) instanceof Cocina && !electroAux.contains(electrods.get(ran).getModelo())) {
				electroAux.add(electrods.get(ran).getModelo());  
				electrods.get(ran).getModelo();
				System.out.println("cocina      "+electrods.get(ran).getModelo()+electrods.get(ran).getMarca()+"       precio"+electrods.get(ran).getPrecio() );			       
			}else if (electrods.get(ran) instanceof Lavarropa && !electroAux.contains(electrods.get(ran).getModelo())) {
				electroAux.add(electrods.get(ran).getModelo());  
				electrods.get(ran).getModelo();
				System.out.println("lavarropa    "+electrods.get(ran).getModelo()+ "       precio"+electrods.get(ran).precio+"   "+electrods.get(ran).getMarca()+electrods.get(ran).getCapacidadTotal());
			}
			
		}
		

			
		}
	
		
		
		
	}


