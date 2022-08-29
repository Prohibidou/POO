package ejercicio10;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Operaciones Op1 = new Operaciones();
Op1.Generador(); //obtengo los numeros aleatorios consistidos;	
Scanner in = new Scanner(System.in);
int seguir;
int contador;
do {
	System.out.println("el primero"+Op1.getNum1()+"\n"+"el segundo"+Op1.getNum2());
	System.out.println("apuesta por el 1 o por el 2? presione 1 o 2");
    Op1.Resultado(Op1.LeoYConsisto()); //retorna un entero que se envia como parametro al mètodo Parametro
    System.out.println("si desea seguir presione 1. Sino, presione 2");
    seguir=Op1.LeoYConsisto();
} while(seguir==1);  
System.out.println("Ha finalizado con exito y ganò un total de "+Op1.ganadas +" veces");
	}
}
