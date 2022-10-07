package builder;

import autos.Auto;
import autos.Manual;
import autos.TipoAuto;
import componentes.Computadora;
import componentes.Gps;
import componentes.Motor;
import componentes.Transmision;

/*A diferencia de otros patrones creacionales, Builder nos permite crear objetos no relacionados
 * En este ejemplo este builder crea un manual de usuario para el auto*/
public class ManualUsuarioAutoBuilder implements Builder {
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
	public Manual getResultado() {
		return new Manual(tipo, asientos, motor, transmision, computadora,gps);
	}
}
