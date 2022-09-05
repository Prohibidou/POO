package eje8;

public class ProfesorSuplente extends Profesor {

	public ProfesorSuplente(String nombre, String apellido, Integer edad, Integer horasTrabajadas, Double valorHora) {
		super(nombre,apellido,edad,horasTrabajadas,valorHora );
	//los setteos de los atributos de profesorSuplente se hacen en el padre, ahorrando codigo.	
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

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Integer getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(Integer horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public Double getValorHora() {
		return valorHora;
	}
	 
	 
}