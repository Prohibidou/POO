package componentes;

public class Gps {
	private String ruta;
	public Gps() {
		this.ruta = "1234, calle falsa, Comodoro Rivadavia a 4321 calle falsa 2, Comodoro Rivadavia";
	}
	public Gps(String ruta) {
		this.ruta = ruta;
	}
	
	public String getRuta() {
		return ruta;
	}
}
