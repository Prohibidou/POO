package ejercicio9;

import java.util.ArrayList;

public class Familia {

	private ArrayList<Persona> personas; //no tenes que inicializar el array, solo declara que vas a tener un array en el atributo.

//recuerda que no es lo mismo inicializar con un set, que meterle elementos a este array.
public void setPersonas (ArrayList<Persona> personas) {
this.personas = personas;	
}
//añado personas a la lista Familia.
public void añadoPersona(Persona pers){
      this.personas.add(pers);
}

//devuelvo al arreglo de 1 familia con todas las personas dentro.
public ArrayList<Persona> getPersonas() {
	return personas;
}


	
}
