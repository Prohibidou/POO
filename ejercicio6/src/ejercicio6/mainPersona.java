package ejercicio6;

import java.time.LocalDate;

public class mainPersona {

	public static void main(String[] args) {
         LocalDate NacJuan = LocalDate.of(1999, 03, 16)   ;   
         LocalDate NacRomina = LocalDate.of(2001, 03, 14)   ;    
         LocalDate NacMaxi = LocalDate.of(1980, 03, 21)   ;    

         //instanciar tres veces una clase es crear 3 objetos.
		Persona juan = new Persona("juan","vera",NacJuan);
		Persona romina = new Persona("romina","salazar",NacRomina);
		Persona maxi = new Persona("maxi","Juarez",NacMaxi);
		
	System.out.println(juan.toString());
		System.out.println(romina.toString());
	System.out.println(maxi.toString());
	}

}
