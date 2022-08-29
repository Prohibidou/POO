package ejercicio11;

import java.util.ArrayList;

public class loteria {

	public static void main(String[] args) {
int continua;
do {
Operaciones Op1 = new Operaciones();     
ArrayList<Integer> listaElegida = new ArrayList<Integer>();

listaElegida= Op1.LeoNumeros();
System.out.println("Su lista de numeros elegida es:");
//muestro los elementos de la lista leída, del usuario
for (int numLocales : listaElegida ) {
        	  System.out.println(numLocales);
          }
          
ArrayList<Integer> listaGanadora = new ArrayList<Integer>() ;
listaGanadora = Op1.CombGanadora();

 //muestro los numeros aleatoriamente generados
System.out.println("los numeros ganadores son;");
for(int numeros : listaGanadora) {
	      System.out.println(numeros);
}
	
System.out.println("los numeros que acerto son: "+ Op1.comparo(listaElegida , listaGanadora));

 continua = Op1.continuar();
} while (continua ==1 );
	}
	
}
