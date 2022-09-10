package ejercicio2_parcial;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> nombres = new ArrayList<String>();
		ArrayList<String> apellidos = new ArrayList<String>();
		ArrayList<Familia> familias = new ArrayList<Familia>();
		ArrayList<Persona> integrantesF = new ArrayList<Persona>();

		for (Integer i = 0; i < 20; i++) {
			nombres.add("nombre" + i);
			apellidos.add("apellido" + i);
		}

		Random rnd = new Random();

		for (Integer i = 0; i < rnd.nextInt(1, 10); i++) {
			integrantesF.add(new Persona(nombres.get(rnd.nextInt(0, 20)), rnd.nextInt(0, 120)));
		}


		ArrayList<Persona> arrayAuxPersona = new ArrayList<Persona>();

		for (Integer i = 0; i < rnd.nextInt(1, 11); i++) {
			for (Integer j = 0; j < rnd.nextInt(1, 10); j++) {
				arrayAuxPersona.add(new Persona(nombres.get(rnd.nextInt(0, 15)) , rnd.nextInt(0, 110)));
			}
			familias.add(new Familia(apellidos.get(rnd.nextInt(0, 20)), arrayAuxPersona));
		}

		for (Integer i = 0; i < familias.size(); i++) {
			ArrayList<Persona> personasAux = familias.get(i).getIntegrantes();
			System.out.println("el apellido de la familia " + i + "     es:  " + familias.get(i).getApellidoF());
			System.out.println("su promedio de edad es:"+familias.get(i).promEdad(personasAux));
			System.out.println("sus integrantes son:     ");
			for (Integer j = 0; j < rnd.nextInt(1, 10); j++) {
				System.out.println(personasAux.get(j).getNombre());
			}

		}

	}

}
