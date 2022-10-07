package componentes;

public class Motor {
	private final double volumen;
	private double kilometraje;
	private boolean encendido;
	
	public Motor(double volumen, double kilometraje) {
		super();
		this.volumen = volumen;
		this.kilometraje = kilometraje;
	}
	
	public void encender() {
		this.encendido=true;
	}
	public void apagar() {
		this.encendido = false;
	}
	public boolean isEncendido() {
		return encendido;
	}
	public void andar(double kilometraje) {
		if(encendido) {
			this.kilometraje += kilometraje;
		}else {
			System.err.println("No se puede andar, primero pone en marcha el auto.");
		}
	}

	public double getVolumen() {
		return volumen;
	}

	public double getKilometraje() {
		return kilometraje;
	}
	
	
	

}
