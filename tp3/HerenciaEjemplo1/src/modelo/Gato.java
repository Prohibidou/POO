package modelo;

public class Gato extends Carnivoro {

	public Gato(Double peso) {
		super(peso); //envio a la cuperclase de gato ( que es CARNIVORO) a su constructor el parametro peso.
		System.out.println("En gato"+peso);
	}

	@Override
	public void comer() { //el metodo comer que hereda el hijo, lo redefinimos en el hijo; pisando así el metodo que tiene el padre ( superclase)
		
		System.out.println("El gato come ratones.");
		super.comer(); //llamo, en el hijo, a un metodo del padre, pues lo hereda.
	}
}
