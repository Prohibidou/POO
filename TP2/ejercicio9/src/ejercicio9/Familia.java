package ejercicio9;

import java.util.ArrayList;

public class Familia {

	private ArrayList<Persona> personas; //no tenes que inicializar el array, solo declara que vas a tener un array en el atributo.

//recuerda que no es lo mismo inicializar con un set, que meterle elementos a este array.
public void setPersonas (ArrayList<Persona> personas) {
this.personas = personas;	
}
//añado personas a la lista Familia.
public void añadoLista(Persona pers){
      this.personas.add(pers);
}

//devuelvo al arreglo de 1 familia con todas las personas dentro.
public ArrayList<Persona> getPersonas() {
	return personas;
}

//public String toString() {
//	String edad,estudia,trabaja,resultado;
//	for (Persona per :integrantesFamilia) {
//		 edad= Integer.toString(per.getEdad());
//		 estudia= Integer.toString(per.getTrabaja());
//		 trabaja= Integer.toString(per.getEstudia());
//		return "su edad:"+edad+"su sexo"+per.getSexo()+"estudia?"+estudia+"trabaja"+trabaja ;		
//	}
//}

//public void muestro(ArrayList<Persona> personas2) {
//	for (int i=0; 1<personas2.size();i++) {
//	Persona	per = personas2.get(i);
//	System.out.println("su edad:"+per.getEdad()+"su sexo"+per.getSexo()+"estudia?"+per.getEstudia()+"trabaja"+per.getTrabaja());		
//
//	}
//}

	
}
