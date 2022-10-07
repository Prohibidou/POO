package autos;

import componentes.Computadora;
import componentes.Gps;
import componentes.Motor;
import componentes.Transmision;

public class Manual {
	private TipoAuto tipo;
    private int asientos;
    private Motor motor;
    private Transmision transmision;
    private Computadora computadora;
    private Gps gps;
	public Manual(TipoAuto tipo, int asientos, Motor motor, Transmision transmision, Computadora computadora, Gps gps) {
		super();
		this.tipo = tipo;
		this.asientos = asientos;
		this.motor = motor;
		this.transmision = transmision;
		this.computadora = computadora;
		this.gps = gps;
	}
    
    public String toString() {
    	String info = "";
    	info += "Tipo de auto: "+ tipo+ "\n";
    	info += "Cantidad de asientos: "+ asientos+ "\n";
    	info += "Motor: volumen - "+ motor.getVolumen()+" kilometraje - "+motor.getKilometraje()+ "\n";
    	info += "Transmisión: "+ transmision+ "\n";
    	info += (this.computadora !=null)? "Computadora: Funcional " + "\n": "Computadora: N/A"+ "\n";
    	info += (this.gps !=null)? "GPS: Funcional " + "\n": "GPS: N/A"+ "\n";
    	return info;

    		
    }
}
