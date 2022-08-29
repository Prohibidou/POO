package ejercicio4;

public abstract class Personaje {
public Integer vida;
public Integer nivelDefensa;
public Integer nivelAtaque;

public Personaje() {
	super();
}

public Personaje(Integer nivelVida, Integer nivelDefensa, Integer nivelAtaque) {
	super();
	this.vida = 150;
	this.nivelDefensa = nivelDefensa;
	this.nivelAtaque = nivelAtaque;
}

public Integer Atacar(Integer nivelAtaque) {
	   return nivelAtaque;
}

public abstract Integer defender (Integer nivelAtaque);	

}
