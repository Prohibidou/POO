package builder;

import autos.TipoAuto;
import componentes.Computadora;
import componentes.Gps;
import componentes.Motor;
import componentes.Transmision;

public interface Builder {
	 public void setTipoAuto(TipoAuto tipo);
	 public void setAsiento(int asientos);
	 public void setMotor(Motor motor);
	 public void setTransmision(Transmision transmision);
	 public void setComputadora(Computadora computadora);
	 public void setGps(Gps gps);
}
