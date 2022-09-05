public abstract class Persona {
	private String nombre,apellido; 
	
	Persona(String nombre, String apellido) { 
		super(); 
		this.nombre = nombre; 
		this.apellido = apellido;
	}
	
public String getNombre() {
	return nombre; 
	} 
public void setNombre(String nombre) {
this.nombre = nombre;
}
public String getApellido() {
	return apellido;
	} 
public void setApellido(String apellido) {
		this.apellido = apellido;
	}
/*La sobrecarga no implica herencia, asi que puedo sobreescribir aquì mismo o en uno de sus hijos.
 * 	
 */
public abstract String materia();
public abstract String materia(String mensaje);
	
}