

import java.util.ArrayList;

public class Alumno extends Persona {
	ArrayList<String> materias = new ArrayList<>();

	public Alumno(String nombre, String apellido) {
		super(nombre, apellido);
	}

	public ArrayList<String> getMaterias() {
		return materias;
	}

	public void setMaterias(ArrayList<String> materias) {
		this.materias = materias;
	}

	public void agregarMateria(String materia) {
		this.materias.add(materia);
	}
	
	/*polimorfismo estatico/en tiempo de compilacion
	 * Tengo dos metodos con el mismo nombre en la misma clase, pero con distinta cantidad de parametros y tipo de retorno.
	 * 
	 */

	public String materia() {
		String msg = "El Alumno se encuentra cursando las siguientes materias \n";
		for (String materia : materias) {
			msg = msg + materia + "\n";
		}
		return msg; //cuando retorna MSG, entra al bucle a buscar su ultimo valor.
	}
	
	public String materia(String mensaje) {
		for (String materia : materias) {
			mensaje = mensaje + materia + "\n";
		}
		return mensaje ;
		}
	
	
}