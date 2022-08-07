package ejercicio11;

import java.util.ArrayList;

public class loteria {

	public static void main(String[] args) {

Operaciones Op1 = new Operaciones();     
ArrayList<Integer>num = new ArrayList();
num= Op1.LeoNumeros();
System.out.println("Su lista de numeros elegida es:");
for (int numLocales : num) {
        	  System.out.println(numLocales);
          }
          
ArrayList<Integer> listaGanadora = new ArrayList<Integer>() ;
listaGanadora = Op1.CombGanadora();
 
System.out.println("los numeros ganadores son;");
for(int numeros : listaGanadora) {
	      System.out.println(numeros);
}
	
System.out.println("los numeros que acerto son: "+ Op1.comparo(num, Op1.CombGanadora()));
	}
	
}
