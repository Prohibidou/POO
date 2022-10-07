package ejercicio6;

public class JuegoFisico  extends Juego {
	private Double precioTraslado;	

public JuegoFisico(Integer id, Double importe, Double precioTraslado) {
		super(id, importe);
		// TODO Auto-generated constructor stub
		this.precioTraslado=precioTraslado;
	}

	public Double getPrecio() {
		return this.getImporte()*this.precioTraslado ;
	}

	@Override
	public String toString() {
		return  super.toString()+ "Juego Fisico [precioPlataforma=" + precioTraslado + "]";
	}
	
}