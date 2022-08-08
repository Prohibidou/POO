package ejercicio10;

import java.util.Random;
import java.util.Scanner;

public class Operaciones {
private float num1;
private float num2;
public int ganadas; //de esta manera accedo a las veces ganadas directamente, sin un getter. El problema es que la cantidad de veces ganadas se puede setear desde la consola, lo cual es un problema de seguirdad

public Operaciones() {
	super();
	// TODO Auto-generated constructor stub
}



public void Generador() {
	System.out.println("le doy valores a los atributos.");
	Random ran = new Random ();
	num1=ran.nextFloat();
	num2=ran.nextFloat();
	if (num1==num2) {
		num1=ran.nextFloat();
	}
}

/*  Consistencia; leo un 1 o 2, y que sea solamente un Int.
 * Lo  hago mediante in.hasNextInt renovando su valor con in.Next() y asignando el valor de in.hasNextInt() 
 */
    public int LeoYConsisto () {
	Scanner in = new Scanner(System.in);
	int decision;
	System.out.println("ingrese 1 o 2");
	decision = 4; //inicializo para que entre al bucle.
	while (((decision<1) || (decision>2))) {	
	System.out.println("introduzcalo porque debe ser un 1 o un 2.");
    if (in.hasNextInt()) {    
	decision = in.nextInt();
    } else {
    System.out.println("su token no es un entero. ingrese otro");
     in.next(); //renovamos el numero ingresado mediante el in.next();
    }
    }
	return decision;
    }

    
public int getDecision() {
	return decision;
}



private void setDecision(int decision) {
	this.decision = decision;
}



public void Resultado (int eleccion) {
if (Integer.compare(eleccion,1)==0 && ((Float.compare(num1, num2))>0)) {
 	System.out.println("Ha ganado");
 	this.ganadas++;
     }else if(Integer.compare(eleccion,1)==0 && (Float.compare(num1, num2)<0)) {
	 System.out.println("ha perdido");
     }else if ((Integer.compare(eleccion,2)==0 && ((Float.compare(num2, num1))>0))) {
    	 System.out.println("ha ganado");
    	 this.ganadas++;
     }else {
    	System.out.println("ha perdido :) "); 
     }
}

public float getNum1() {
	return num1;
}



public void setNum1(float num1) {
	this.num1 = num1;
}



public float getNum2() {
	return num2;
}


public void setNum2(float num2) {
	this.num2 = num2;
}
	

	
	
}
