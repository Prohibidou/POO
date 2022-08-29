package ejercicio9;

import java.util.ArrayList;
import java.util.Scanner;

public class Censo {

public static void main(String[] args) {
Scanner in= new  Scanner(System.in);
ArrayList <ArrayList<Persona>> comuna = new ArrayList<ArrayList <Persona>>(); 
//voy a tener una lista de familias, que es la comuna


//inicializo el objeto familia y persona, para inicializarlos solo 1 vez y no en cada bucle 
Familia familia = new Familia();
familia.setPersonas(new ArrayList<Persona>());

Persona persona = new Persona("m",1,"no","si");
familia.añadoPersona(persona);



Persona persona1 = new Persona("m",2,"si","no");
familia.añadoPersona(persona1);

Persona persona2 = new Persona("m",3,"si","no");
familia.añadoPersona(persona2);
//Añado familia a la comuna
comuna.add(familia.getPersonas());

familia.setPersonas(new ArrayList<Persona>());

Persona persona3 = new Persona("m",4,"no","si");
familia.añadoPersona(persona3);


Persona persona4 = new Persona("f",5,"si","si");
familia.añadoPersona(persona4);

Persona persona5 = new Persona("f",6,"no","no");
familia.añadoPersona(persona5);
//Añado familia a la comuna
comuna.add(familia.getPersonas());

familia.setPersonas(new ArrayList<Persona>());

Persona persona6 = new Persona("m",4,"no","si");
familia.añadoPersona(persona3);


Persona persona7 = new Persona("f",5,"si","si");
familia.añadoPersona(persona4);

Persona persona8 = new Persona("f",6,"no","no");
familia.añadoPersona(persona5);
//Añado familia a la comuna
comuna.add(familia.getPersonas());

familia.setPersonas(new ArrayList<Persona>());

Persona persona9 = new Persona("m",4,"no","si");
familia.añadoPersona(persona3);


Persona persona10 = new Persona("f",5,"si","si");
familia.añadoPersona(persona4);

Persona persona11 = new Persona("f",6,"no","no");
familia.añadoPersona(persona5);
//Añado familia a la comuna
comuna.add(familia.getPersonas());

familia.setPersonas(new ArrayList<Persona>());

Persona persona12 = new Persona("m",4,"no","si");
familia.añadoPersona(persona3);


Persona persona13 = new Persona("f",5,"si","si");
familia.añadoPersona(persona4);

Persona persona14 = new Persona("f",6,"no","no");
familia.añadoPersona(persona5);
//Añado familia a la comuna
comuna.add(familia.getPersonas());


int contPer=0;
float promEdad = 0;
int cantPersonasTrab=0;	
ArrayList <Persona> personasFamilia = new ArrayList<Persona> (); 
for (int i=0; i<comuna.size(); i++) {	      
	        System.out.println("FAMILIA"+i);
            personasFamilia=comuna.get(i);
	for (int j=0; j<personasFamilia.size(); j++) {         
	    	System.out.println("su edad:"+personasFamilia.get(j).getEdad()+"    su sexo: "+personasFamilia.get(j).getSexo()+"   estudia?    "+personasFamilia.get(j).getEstudia()+"   trabaja?   "+personasFamilia.get(j).getTrabaja());		
	        contPer++;
	        promEdad=personasFamilia.get(j).getEdad()+promEdad;
	        if (personasFamilia.get(j).getTrabaja()=="si") {
	        	cantPersonasTrab++;
	        }
	}
   }
   System.out.println("cantida de personas censadas:"+contPer);
	System.out.println("promedio edad"+ promEdad/contPer);
	System.out.println("cant personas que trabajan:"+cantPersonasTrab);


	 comuna.get(1).get(2).permitido(); //obtengo si una persona tiene permitido trabajar y estudiar

}
}
