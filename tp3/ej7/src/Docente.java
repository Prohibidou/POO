import java.util.ArrayList ;

public class Docente extends Persona {
	private String materia;

	//this.nombre no se hereda. Asi que uso el get y setter del padre y el constructor del padre, y usando el padre puedo desde el hijo tener nombre, aunque no lo tenga como atributo.
	public Docente(String nombre, String apellido, String materia) {
		super(nombre, apellido);
		this.materia = materia;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String materia() {
		return "El docente dicta la siguiente clase " + this.materia + "\n";
	}
	public String materia(String mensaje) {
     return mensaje+this.materia ;
	}
}