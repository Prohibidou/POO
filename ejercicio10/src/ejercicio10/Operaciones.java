package ejercicio10;

import java.util.Random;
import java.util.Scanner;

public class Operaciones {
private float num1;
private float num2;
private int decision; 
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
    public void LeoYConsisto () {
	Scanner in = new Scanner(System.in);
	do {
		System.out.println("introduzcalo");
	int decision = in.nextInt();
	}while ( (decision<1) || (decision>2));
	this.decision=decision;
     
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
     }else if(Integer.compare(eleccion,1)==0 && (Float.compare(num1, num2)<0)) {
	 System.out.println("ha perdido");
     }else if ((Integer.compare(eleccion,2)==0 && ((Float.compare(num2, num1))>0))) {
    	 System.out.println("ha ganado");
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
