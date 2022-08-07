package ejercicio10;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Operaciones Op1 = new Operaciones();
Op1.Generador(); //obtengo los numeros aleatorios consistidos;

System.out.println("el primero"+Op1.getNum1()+"\n"+"el segundo"+Op1.getNum2());
System.out.println("apuesta por el 1 o por el 2? presione 1 o 2");	

    Op1.LeoYConsisto();
	
    Op1.Resultado(Op1.getDecision());

    Scanner in2 = new Scanner(System.in);
    System.out.println("ingrese otro numero");
	}
}
