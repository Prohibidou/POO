package eje8;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		ArrayList<Profesor> profesores = new ArrayList<Profesor>();
		profesores.add(new ProfesorTitular("Aldana", "Gutierrez", 40, 40, 15, 14.2, 14));
		profesores.add(new ProfesorTitular("Pedro", "Perez", 30, 30, 4, 15.2, 6));
		profesores.add(new ProfesorTitular("María", "Gomez", 29, 40, 1, 16.2, 9));

		profesores.add(new ProfesorSuplente("Juan", "Gomez", 29, 1, 9.2));
		profesores.add(new ProfesorSuplente("Alberto", "Gomez", 29, 24, 9.2));
		profesores.add(new ProfesorSuplente("Pedro", "Go", 29, 52, 9.4));

		for (Integer i = 0; i < profesores.size(); i++) {
				System.out.println(
						"Nombre y apellido: " + profesores.get(i).getNombre() + " " + profesores.get(i).getApellido());
				System.out.println("¿Es titular?:);");
				if ( profesores.get(i) instanceof ProfesorTitular ) {
					System.out.println("si");
				}else {
					System.out.println("no");
				}
		
				System.out.println("Remuneración:" + profesores.get(i).getRemuneracionMensual());
		
		}
	}
}