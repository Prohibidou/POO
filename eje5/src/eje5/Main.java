package eje5;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Materia poo= new Materia("POO", "IF153");
		Materia algebra= new Materia("Algebra", "183");
		Materia introduccion= new Materia("Introducción a la computación", "codigo182"); //inicializar atributos a default con un constructor depende de cómo esté formado el constructor al que llamo, porque pueden haber mas de un constructor en la misma clase; de ello dependera si sale o no error.
		Materia algoritmica= new Materia("Algoritmica", "500");
		
		ArrayList<Profesor> profesores = new ArrayList<Profesor>(); 
		//array de Profesor (nombre, apellido y una lista de materias, en sus atributos)
		
		Profesor profesor1 = new Profesor("Pedro", "Hernandez");
		profesor1.setMaterias(new ArrayList<Materia>());
		profesor1.añadirMateria(poo); 
		profesor1.añadirMateria(introduccion);
		profesores.add(profesor1);
		
		Profesor profesor2 = new Profesor("Romina", "Alvarez");
		profesor2.setMaterias(new ArrayList<Materia>()); //antes de añadir elementos al arreglo, debo setearlo para que exista; lo mejor es mandarlo como un nuevo arreglo como parametro.
		profesor2.añadirMateria(introduccion);
		profesor2.añadirMateria(algoritmica);		
		profesores.add(profesor2);
		
		
		Profesor profesor3 = new Profesor("Laura", "Perez");
		profesor3.setMaterias(new ArrayList<Materia>()); 
		profesor3.añadirMateria(poo);
		profesor3.añadirMateria(algebra);
		profesores.add(profesor3);
		//tengo una lista de profesores (clases de Profesor), pero dentro de cada clase de Profesor, no he inicializado su array (no inicialice los atributos de lista de materias)
		
		
		for (int i=0;i< profesores.size() ;i++) {
		System.out.println("Profesor: " + profesores.get(i).getNombre() + " " +
		profesores.get(i).getApellido());
		//mostré el nombre y apellido del profesor almacenado en el array profesores.
		System.out.println("Materias: ");
		for (int j=0;j<profesores.get(i).getMaterias().size();j++) {
			
		System.out.println(profesores.get(i).getMaterias().get(j).getNombre());
		}
		}
		}
}
