package ejercicio1;

public class Alfajor extends Golosina {
private int tipoChocolate; //atributo propio de solamente el alfajor, no visible para referencias o objetos golosina


public int demandaEsperada(int x) { //es un atributo que se puede acceder mediante un objeto del padre golosina, porque este metodo está en el padre, y aquí fue sobrescrito
	return (x*2 * this.tipoChocolate);
	
}

private int metodoEspecializado () {
	return 1;
}


public int getTipoChocolate() {
	return tipoChocolate;
}


public void setTipoChocolate(int tipoChocolate) {
	this.tipoChocolate = tipoChocolate;
}

}
