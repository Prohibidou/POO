package ejercicio4;

public class Hank extends Personaje {
//piso los valores del padre por defecto, menos la vida que la heredamos de Personaje
private Integer vida=100;
private Integer nivelDefensa;
private Integer nivelAtaque;


public Hank(Integer nivelDefensa, Integer nivelAtaque ) {
	super();
	this.nivelDefensa = nivelDefensa;
	this.nivelAtaque= nivelAtaque ;
}

public Integer defender (Integer nivelAtaque) {

	System.out.println("vida del defensor "+ this.vida);
	System.out.println("el nivel de defensa es ");System.out.println(nivelDefensa-nivelAtaque);
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
	return this.nivelDefensa=nivelDefensa- nivelAtaque;
	
}



public Integer getVida() {
	return vida;
}



public void setVida(Integer vida) {
	this.vida = vida;
}



public Integer getNivelDefensa() {
	return nivelDefensa;
}



public void setNivelDefensa(Integer nivelDefensa) {
	this.nivelDefensa = nivelDefensa;
}



public Integer getNivelAtaque() {
	return nivelAtaque;
}



public void setNivelAtaque(Integer nivelAtaque) {
	this.nivelAtaque = nivelAtaque;
}
	
}

