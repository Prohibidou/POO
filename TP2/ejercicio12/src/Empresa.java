import java.util.ArrayList;

public class Empresa {
private String nombre;
private String direccion;
private ArrayList<Persona> empleados = new ArrayList<Persona>();


public Empresa (String nombre, String direccion) {
	this.nombre=nombre;
	this.direccion=direccion;
}

public void añadoEmpleado(Persona persona){
	this.empleados.add(persona);
}

public Integer numTotalEmp (ArrayList<Persona> empleados ) {
           return empleados.size(); 
}

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
public ArrayList<Persona> getEmpleados() {
	return empleados;
}
public void setEmpleados(ArrayList<Persona> empleados) {
	this.empleados = empleados;
}



}
