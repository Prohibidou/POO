package ejercicio1;

public class Chupetin extends Golosina{
	private int tipoAzucar;
	
public int demandaEsperada (int x) {
	return x*this.tipoAzucar;
}

public int metodoEspecializado () {
	return 1;
}

public int getTipoAzucar() {
	return tipoAzucar;
}

public void setTipoAzucar(int tipoAzucar) {
	this.tipoAzucar = tipoAzucar;
}


}
