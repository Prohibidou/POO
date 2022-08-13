package ejercicio9;

import java.util.ArrayList;
import java.util.Scanner;

public class Censo {

public static void main(String[] args) {
Scanner in= new  Scanner(System.in);
ArrayList <ArrayList<Persona>> comuna = new ArrayList<ArrayList <Persona>>(); //voy a tener una lista de familias, que es la comuna

//inicializo el objeto familia y persona, para inicializarlos solo 1 vez y no en cada bucle 
Familia familia = new Familia();
familia.setPersonas(new ArrayList<Persona>());

Persona persona = new Persona("m",1,"no","si");
familia.añadoLista(persona);

Persona persona1 = new Persona("m",2,"si","no");
familia.añadoLista(persona1);

Persona persona2 = new Persona("m",3,"si","no");
familia.añadoLista(persona2);

comuna.add(familia.getPersonas());

familia.setPersonas(new ArrayList<Persona>());

Persona persona3 = new Persona("m",4,"no","si");
familia.añadoLista(persona3);


Persona persona4 = new Persona("f",5,"si","si");
familia.añadoLista(persona4);

Persona persona5 = new Persona("f",6,"no","no");
familia.añadoLista(persona5);

comuna.add(familia.getPersonas());



ArrayList <Persona> personas2 = new ArrayList<Persona> (); 
for (int i=0; i<comuna.size(); i++) {	          
            personas2=comuna.get(i);
	for (int j=0; j<personas2.size(); j++) {  
	    	System.out.println("bucle");       
	    	System.out.println("su edad:"+personas2.get(j).getEdad()+"su sexo"+personas2.get(j).getSexo()+"estudia?"+personas2.get(j).getEstudia()+"trabaja"+personas2.get(j).getTrabaja());		
	    }
   }
   
	
	}
}
