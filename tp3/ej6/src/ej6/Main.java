package ej6;

import java.util.ArrayList;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random rnd = new Random();
		ArrayList<Persona> personas = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			if (rnd.nextBoolean()) {
				personas.add(new Docente("NomDoc" + i, "ApeDoc" + i, "Mat" + i));
			} else {                
				Alumno alumno = new Alumno("AlumNom" + i, "AlumApe" + i);//instancio una clase alumno, que esta hereda del padre, porque es una clase que extiende a Persona aunque no instanciemos Persona alumno = new Alumno()
				//Gracias a instanciar un hijo, puedo usar los metodos del hijo y del padre a la vez.
				for (int j = 0; j < 10; j++) {
					alumno.agregarMateria("Mat" + j);
					if (rnd.nextBoolean()) {
						break;
					}
				}
				personas.add(alumno);
			}
		}
		for (Persona persona : personas) {
			System.out.println(persona.materia());
		}
	}
}