package ej6;

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
	public void materia(int b) {   
		String msg = "El Alumno se encuentra cursando las siguientes materias \n";
		for (String materia : materias) {
		System.out.println(msg = msg + materia + "\n");
		}
	}

	public String materia() {
		String msg = "El Alumno se encuentra cursando las siguientes materias \n";
		for (String materia : materias) {
			msg = msg + materia + "\n";
		}
		return msg;
	}
}