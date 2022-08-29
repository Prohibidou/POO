package ejercicio9;

import java.util.Scanner;

public class Persona {
private String sexo;
private Integer edad;
private String estudia; //true significa que si estudia.
private String trabaja; //true significa que si trabaja




public Persona(String sexo, Integer edad, String estudia, String trabaja) {
	super();
	this.sexo = sexo;
	this.edad = edad;
	this.estudia = estudia;
	this.trabaja = trabaja;
}

public void permitido () {
	if (this.edad>=18) {
	   System.out.println("tiene permitido trabajar");
		System.out.println("tiene permitido manejar");
	}else if(this.edad>=16){
		System.out.println("no tiene permitido trabajar");
	    System.out.println("tiene permitido manejar de forma condicional");
	}else {
		System.out.println("no tiene permitido ni trabajar ni manejar");
	}
	
	
}
public String getSexo() {
	return sexo;
}
public void setSexo(String sexo) {
	this.sexo = sexo;
}
public Integer getEdad() {
	return edad;
}
public void setEdad(Integer edad) {
	this.edad = edad;
}
public String getEstudia() {
	return estudia;
}
public void setEstudia(String estudia) {
	this.estudia = estudia;
}
public String getTrabaja() {
	return trabaja;
}
public void setTrabaja(String trabaja) {
	this.trabaja = trabaja;
}




	
}