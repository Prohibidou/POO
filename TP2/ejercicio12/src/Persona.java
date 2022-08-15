import java.time.LocalDate;

public class Persona {
private String nombre;
private String apellido;
private LocalDate fechaNac;
private Puesto puesto;




public Persona(String nombre, String apellido, LocalDate fechaNac, Puesto puesto) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.fechaNac = fechaNac;
	this.puesto = puesto;
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
public LocalDate getFechaNac() {
	return fechaNac;
}
public void setFechaNac(LocalDate fechaNac) {
	this.fechaNac = fechaNac;
}


@Override
public String toString() {
	return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", fechaNac=" + fechaNac + ", puesto=" + puesto.getPuesto()
			+ "]";
}





	
}
