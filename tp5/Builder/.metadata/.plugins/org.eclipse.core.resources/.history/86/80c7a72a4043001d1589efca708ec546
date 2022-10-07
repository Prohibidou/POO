package autos;

import componentes.Computadora;
import componentes.Gps;
import componentes.Motor;
import componentes.Transmision;

public class Auto {
	private TipoAuto tipo;
    private int asientos;
    private Motor motor;
    private Transmision transmision;
    private Computadora computadora;
    private Gps gps;
    private double combustible = 0;
	public Auto(TipoAuto tipo, int asientos, Motor motor, Transmision transmision, Computadora computadora, Gps gps) {
		super();
		this.tipo = tipo;
		this.asientos = asientos;
		this.motor = motor;
		this.transmision = transmision;
		this.gps = gps;
		 if (this.computadora != null) {
			 this.computadora.setAuto(this);
		 }
		 
	}
	public double getCombustible() {
		return combustible;
	}
	public void setCombustible(double combustible) {
		this.combustible = combustible;
	}
	public TipoAuto getTipo() {
		return tipo;
	}
	public int getAsientos() {
		return asientos;
	}
	public Motor getMotor() {
		return motor;
	}
	public Transmision getTransmision() {
		return transmision;
	}
	public Computadora getComputadora() {
		return computadora;
	}
	public Gps getGps() {
		return gps;
	}
    
    
}
