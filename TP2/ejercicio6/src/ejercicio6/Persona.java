package ejercicio6;

import java.time.LocalDate;

public class Persona {
private String nombre;
private String apellido;
private LocalDate fechaNac;

public Persona(String nombre, String apellido, LocalDate fechaNac) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.fechaNac = fechaNac;
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
	return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", fechaNac=" + fechaNac + "]";
}


	
}
