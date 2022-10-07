package builder;

import autos.Auto;
import autos.TipoAuto;
import componentes.Computadora;
import componentes.Gps;
import componentes.Motor;
import componentes.Transmision;

public class AutoBuilder implements Builder {
	
	private TipoAuto tipo;
    private int asientos;
    private Motor motor;
    private Transmision transmision;
    private Computadora computadora;
    private Gps gps;

	@Override
	public void setTipoAuto(TipoAuto tipo) {
		this.tipo = tipo;
		
	}

	@Override
	public void setAsiento(int asientos) {
		this.asientos = asientos;
		
	}

	@Override
	public void setMotor(Motor motor) {
		this.motor = motor;
		
	}

	@Override
	public void setTransmision(Transmision transmision) {
		this.transmision = transmision;
		
	}

	@Override
	public void setComputadora(Computadora computadora) {
		this.computadora = computadora;
		
	}

	@Override
	public void setGps(Gps gps) {
		this.gps = gps;
		
	}
	public Auto getResultado() {
		return new Auto(tipo, asientos, motor, transmision, computadora,gps);
	}

}
