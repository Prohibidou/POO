package ejercicio10_observer;

import java.util.ArrayList;

//el observable es observado por un monton de observadores Reportero???
public class Observable {
	private ArrayList<Observer> observadores = new ArrayList<Observer>();
	protected String estadoClima;

	public void notificarObservadores() {
		this.getObservadores();
		for (Observer observador : this.getObservadores()) {
			observador.notificar(this.estadoClima);
		}
	}

	public void setEstadoClima(String estadoClima) {
		this.estadoClima = estadoClima;
		this.notificarObservadores();
	}

	public void anadirObservadores(Observer observador) {
		this.observadores.add(observador);
	}

	public void removerObservador(Observer observador) {
		this.observadores.remove(observador);
	}

	public ArrayList<Observer> getObservadores() {
		return observadores;
	}

}
