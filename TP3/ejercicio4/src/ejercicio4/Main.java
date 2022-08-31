package ejercicio4;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
Personaje p1= new Marie(200,100);
Personaje p2= new Hank(200,100);
Random ran = new Random();
Integer numRan= ran.nextInt(0, 1);

for (Integer i=0; i<5; i++) {
numRan= ran.nextInt(0, 2);
if (numRan==1) {
	System.out.println("hank se defiende");
	p2.defender(p1.Atacar(20));
}else {
	System.out.println("Marie se defiende");

	p1.defender(p2.Atacar(100));
}
System.out.println("se finalizo un ataque");
System.out.println();
System.out.println();
}


	}

}
