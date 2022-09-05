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
				Alumno alumno = new Alumno("AlumNom" + i, "AlumApe" + i);
				for (int j = 0; j < 10; j++) {
					alumno.agregarMateria("Mat" + j);
					if (rnd.nextBoolean()) {
						break;
					}
				}
				personas.add(alumno);
			}
		}
		
	String	mensajeElegido="la materia de la persona es:";
	Integer cont=0;
		for (Persona persona : personas) {
		 if (cont<personas.size()/2) {
		//	System.out.println(persona.materia(mensajeElegido));
		 } else {
			 System.out.println(persona.materia());
		 }
		 cont++;
		}
	}
}