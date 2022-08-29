package modelo;

public abstract class Carnivoro extends Animal {

	public Carnivoro() {
		super();
		System.out.println("En carnivoro");
	}
	public Carnivoro(Double peso) { //recibo el parametro enviado desde su hijo
		super(peso); //envio al constructor del padre de Carnivoro ( Animal, el parametro peso al constructor que tenga como parametro a peso.
		System.out.println("En carnivoro"+ peso );
	}
	@Override
	public void comer() {
		System.out.println("come carne");
	} 
}
