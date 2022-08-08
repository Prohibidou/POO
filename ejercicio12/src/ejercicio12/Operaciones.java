package ejercicio12;

import java.util.ArrayList;
import java.util.Scanner;

public class Operaciones {

	public ArrayList<String> procesamiento () {
		Scanner in = new Scanner(System.in);
    ArrayList<String> temporal = new ArrayList<String>();
     for (int i=0; i<=5; i++) {
    	 System.out.println("ingrese una cadena cualquiera");
    	 temporal.add(in.next());
     }
     return temporal;
	}
}
