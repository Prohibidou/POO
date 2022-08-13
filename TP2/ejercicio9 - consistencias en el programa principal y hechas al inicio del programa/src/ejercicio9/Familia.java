package ejercicio9;

import java.util.ArrayList;

public class Familia {

	private ArrayList<Persona> integrantesFamilia; //no tenes que inicializar el array, solo declara que vas a tener un array en el atributo.

//recuerda que no es lo mismo inicializar con un set, que meterle elementos a este array.
public void setIntegrantesFamilia (ArrayList<Persona> integrantesFamilia) {
this.integrantesFamilia = integrantesFamilia;	
}

//añado personas a la lista Familia.
public void añadoLista(Persona pers){
      this.integrantesFamilia.add(pers);
}

//devuelvo al arreglo de 1 familia con todas las personas dentro.
public ArrayList<Persona> getIntegrantesFamilia() {
	return integrantesFamilia;
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

public void muestro() {
	for (int i=0; 1<integrantesFamilia.size();i++) {
	Persona	per = integrantesFamilia.get(i);
		System.out.println("su edad:"+per.getEdad()+"su sexo"+per.getSexo()+"estudia?"+per.getEstudia()+"trabaja"+per.getTrabaja());		
	
	}
}

	
}
