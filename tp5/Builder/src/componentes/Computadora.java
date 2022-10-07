package componentes;

import autos.Auto;

public class Computadora {

	private Auto auto;

	public void setAuto(Auto auto) {
		this.auto = auto;
	}

	public void mostrarNivelCombustible() {
		System.out.println("Nivel de combustible: " + auto.getCombustible());
	}

	public void mostrarEstado() {
		if (this.auto.getMotor().isEncendido()) {
			System.out.println("Auto en marcha.");
		} else {
			System.out.println("Auto no esta en marcha.");
		}

	}

}
