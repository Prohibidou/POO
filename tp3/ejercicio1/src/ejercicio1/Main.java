package ejercicio1;

public class Main {

	public static void main(String[] args) {
	Golosina g1 = new Golosina ();
    g1 = new Alfajor (); //de momento solo puedo usar metodos que esten en el padre y en los hijos sobreescritos o iguales, pero no puedo acceder a los metodos o variables unicas de cada hijo
    Alfajor alf1 = (Alfajor)g1; //ahora tengo visibilidad mas especializada de alfajor, pues puedo usar todos sus metodos.
    alf1.setTipoChocolate(5);
    System.out.println("demanda esperada del alfajor es:"+ alf1.demandaEsperada(1));
	
	}

}
