package ejercicio4;

public class Marie extends Personaje {

	public Marie () {
    super();

}

 public Marie(Integer nivelDefensa, Integer nivelAtaque) {
 super(150, nivelDefensa, nivelAtaque); //al instanciar una clase hija, primero debo instanciar
 //al padre directo, y en este caso como hay 2 constructores en el padre, debo decirle cual de los dos uso, con Super().
 }

 
 
 
public Integer defender (Integer nivelAtaque) {
	System.out.println("vida del defensor por default"+ this.vida);
	System.out.println("el nivel de defensa despues de pelear es de ");System.out.println(nivelDefensa-nivelAtaque);
	System.out.println("ataque: ");System.out.println(nivelAtaque);
	System.out.println(" defensa es de ");System.out.println(nivelDefensa);

	try {
		if (nivelAtaque >=nivelDefensa) {
			throw new Exception("Excepcion. vida resultante:0");
		}
	} catch (Exception e) {
		System.out.println("excepcion. su vida es 0");
		return this.vida=0;
	}
	return this.nivelDefensa=nivelDefensa- nivelAtaque; //se va debilitando la defensa por cada ataque, hasta que la defensa no puede defender el ataque y muere
	
}
	
public Integer Atacar(Integer nivelAtaque) {
super.Atacar(nivelAtaque);
return nivelAtaque+100 ; //extiendo el metodo metodo del padre manipulando sus variables de rotorno
}


}
