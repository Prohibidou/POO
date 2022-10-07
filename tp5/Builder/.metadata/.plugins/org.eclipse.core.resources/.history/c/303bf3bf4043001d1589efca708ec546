package director;

import autos.TipoAuto;
import builder.Builder;
import componentes.Computadora;
import componentes.Gps;
import componentes.Motor;
import componentes.Transmision;

public class Director {

	public void buildAutoDeportivo(Builder builder) {
		builder.setTipoAuto(TipoAuto.DEPORTIVO);
		builder.setAsiento(2);
		builder.setMotor(new Motor(3.0, 0));
		builder.setTransmision(Transmision.SEMIAUTOMATICO);
		builder.setComputadora(new Computadora());
		builder.setGps(new Gps());
	}
	public void buildAutoCiudad(Builder builder) {
		builder.setTipoAuto(TipoAuto.CIUDAD);
		builder.setAsiento(2);
		builder.setMotor(new Motor(1.2, 0));
		builder.setTransmision(Transmision.AUTOMATICO);
		builder.setComputadora(new Computadora());
		builder.setGps(new Gps());
	}
	public void buildSUV(Builder builder) {
		builder.setTipoAuto(TipoAuto.SUV);
		builder.setAsiento(4);
		builder.setMotor(new Motor(2.5, 0));
		builder.setTransmision(Transmision.MANUAL);
		builder.setGps(new Gps());
	}
}
