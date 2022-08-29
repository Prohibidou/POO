package modelo;

public abstract class Animal {
	private Double peso;
	
	public Animal() {
		System.out.println("En animal");
	}

	public Animal(Double peso) { //Recibo el parametro enviado por su hijo carnivoro (mediante super(peso);
		super();
		this.peso = peso;
		System.out.println("En animal, peso: "+peso);
	}
	
	public abstract void comer();
	

}
