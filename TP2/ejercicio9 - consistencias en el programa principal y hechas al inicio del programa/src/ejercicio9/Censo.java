package ejercicio9;

import java.util.ArrayList;
import java.util.Scanner;

public class Censo {

public static void main(String[] args) {
String respuesta,respuesta2;
Scanner in= new  Scanner(System.in);
int control,control2,control3; 
ArrayList <Familia> comuna = new ArrayList<Familia>(); //voy a tener una lista de familias, que es la comuna
control=0;


//inicializo el objeto familia y persona, para inicializarlos solo 1 vez y no en cada bucle 
Familia f1 = new Familia(); 
Persona p1 = new Persona();

//este bucle se encarga de agregar tantas familias como el usuario requiera
while(control==0) {		
     f1.setIntegrantesFamilia(new ArrayList<Persona>());
	 System.out.println("ingrese los datos de los integrantes de la familia");
     control2=0;
     //en este bucle me ocupo de añadir tantos integrantes como el usuario desee
     while (control2==0) {  
     p1.setEstudia();
     p1.setTrabaja();
     p1.setSexo();
     p1.setEdad();
     System.out.println("desea añadir datos de otro integrante de la familia? responda con si o no");
	 control3=0;
     do {
     respuesta=in.nextLine();  
	 if (respuesta.equals("si")|| respuesta.equals("no")) {
		 control3=1;
		 System.out.println("respuesta introducida correctamente");
	 }else {
		 System.out.println("dato mal ingresado. Ingrese un si o no");
	 }
	 } while (control3==0);
       if (respuesta.equals("si")) {
    	   control2=0;	   
     } else {
    	control2=1;
     }
       //antes de añadir informacion de otro integrante de la familia, o no hacerlo, voy igual a añadirlo a la familia antes 
      f1.añadoLista(p1);
      System.out.println("persona añadida con exito a la lista de integrantes de la familia");
     }
     //añado la familia creada a la comuna, así tengo la lista de familias
     comuna.add(f1);
     System.out.println("desea añadir a otra familia a la comuna ?escriba si o no");
     control=0;
     do {
     respuesta2=in.nextLine();  
	 if (respuesta2.equals("si")|| respuesta2.equals("no")) {
		 control=1;
		 System.out.println("respuesta introducida correctamente");
	 }else {
		 System.out.println("dato mal ingresado. Ingrese un si o no");
	 }
	 } while (control==0);
       if (respuesta2.equals("si")) {
    	   control=0;	   
     } else {
    	control=1;
     }
     
     
   } System.out.println("la carga de familias a la comuna ha sido un exito");


   
	
   //voy a mostrar varias familias, las familias de la comuna
   
   for (int i=0; i<comuna.size(); i++) {
	   
	    for (int j=0; j<comuna.get(i).getIntegrantesFamilia().size() ; j++) {
	          comuna.get(i).muestro(); 	
	    }
   }
   
	
	}
}
