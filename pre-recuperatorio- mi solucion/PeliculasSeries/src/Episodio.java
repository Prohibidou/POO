
public class Episodio extends Obra {

	private String fechaEmision;

	


	public Episodio(String titulo, Float duracion, Integer calif, String fechaEmision) {
		super(titulo, duracion, calif);
		this.fechaEmision = fechaEmision;
	}



//sobreescribo toString de clase padre (polimorf.dinamico) y a la vez, extiendo el metodo del padre.
	@Override
	public String toString() {
		return "Episodio"+ super.toString()+"[fechaEmision=" + fechaEmision + "]";
	}








}
