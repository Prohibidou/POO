package eje8;

public abstract class Profesor {
	public String nombre;
	public String apellido;
	public Integer edad;
	public Integer horasTrabajadas;
	public Integer antiguedad;
	public Double valorHora;
	
	public Profesor () {
		
	}
	
	public Profesor(String nombre, String apellido, Integer edad, Integer horasTrabajadas, Double valorHora) {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setEdad(edad);
		this.setHorasTrabajadas(horasTrabajadas);
		this.valorHora=valorHora;
	}
	
	public Double getRemuneracionMensual() {
		return this.valorHora * this.getHorasTrabajadas();
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

	public Integer getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}
	
	
	
	
	
}
