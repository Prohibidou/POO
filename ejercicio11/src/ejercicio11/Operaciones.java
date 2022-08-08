package ejercicio11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Operaciones {

	public ArrayList<Integer> LeoNumeros () {
		int ingresado;
		Scanner in = new Scanner(System.in);
		int cont=1;
		ArrayList<Integer> listaEleg = new ArrayList<Integer>(); //Es una lista que almacena elementos de la clase Integer.
		do {
			System.out.println("ingrese un entero no repetido");
			ingresado = in.nextInt();
			if (!listaEleg.contains(ingresado)) {
			listaEleg.add(ingresado);
			cont++;
			} else System.out.println("ese elemento está en la lista, inserte otro hasta completar los 6");
		      //notese que cuando no se añade un elemento no se aumenta el contador; solo se aumenta cuando efectivamente el valor ingresado no pertenece a la lista.
		} while (cont<=6) ;
		Collections.sort(listaEleg);
		return listaEleg;
		
	}
	//retorno atributos consistidos y ordenado de menor a mayor.
	
public ArrayList<Integer> CombGanadora () {
	ArrayList<Integer> listaGanadora = new ArrayList();
	Random ran = new Random();
	int numRandom; int cont=0;
	do { 
		numRandom = ran.nextInt(0, 50)+1; 
		if (!listaGanadora.contains(numRandom)){
		listaGanadora.add(numRandom); // si vale 0, valdrà finalmente 1. Si vale 48 valdrà finalmente 50. De esta manera hacemos que el metodo me devuelva entre 1 y 50 inclusive!.
	    cont++;
	}
	}while( cont<=5);
	
	return listaGanadora;
}

public int comparo(ArrayList<Integer> listaEleg, ArrayList<Integer> listaGana) {
	int contadorGanadas =0;
	int contador =0;
	Collections.sort(listaGana); //ordeno la lista ascendentemente, ganadora, para poder hacer busqueda binaria, y que no haya elementos repetidos
   do {	
	   if (listaGana.contains(listaEleg.get(contador))) {
          contadorGanadas++;
	   }
	   
	   contador++;
	} while (contador<=5);
	return contadorGanadas;
}

    public int continuar() {
	Scanner in = new Scanner(System.in);
	int eleccion=3; //inicializo con un numero cualquiera
	while (eleccion>1 || eleccion<0 ) {
		System.out.println("si desea jugar denuevo presione 1. Sino, presione 0");		
		
		while (!in.hasNextInt()) {
			in.next();
			System.out.println("ingrese un entero");
		} eleccion=in.nextInt();
    			
	}
	System.out.println("ha realizado un ingreso de datos correcto");
	return eleccion;

    }}
