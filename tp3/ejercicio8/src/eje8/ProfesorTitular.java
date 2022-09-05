package eje8;

public class ProfesorTitular extends Profesor {
	private Integer antiguedad;
	private  Double valorAntiguedad;

	public ProfesorTitular(String nombre, String apellido, Integer edad, Integer horasTrabajadas, Integer antiguedad, 
			double valorAntiguedad, double valorHora) {
		super(nombre,apellido,edad,horasTrabajadas, valorHora);
		this.setValorAntiguedad(valorAntiguedad);
		this.setAntiguedad(antiguedad);
		}
	
	

	  public void setValorAntiguedad(Double valorAntiguedad) {
		this.valorAntiguedad = valorAntiguedad;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}

	public Double getRemuneracionMensual() {
		return (super.getRemuneracionMensual()+ (this.valorAntiguedad*this.getAntiguedad() )); //extiendo un metodo heredado 
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

	public Double getValorAntiguedad() {
		return valorAntiguedad;
	}

	public Double getValorHora() {
		return valorHora;
	}
	
	
	
	
}