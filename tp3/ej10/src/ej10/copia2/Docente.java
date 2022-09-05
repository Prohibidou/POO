package ej10.copia2;

public class Docente extends Personal {
	private Integer categoria; // 1:simple, 2:Semiexclusiva, 3:exclusiva

	public Docente(String nombre_completo, Double antiguedad, Integer categoria) {
		super(nombre_completo, antiguedad);
		this.setCategoria(categoria);

	}

	public Integer getCategoria() {
		return categoria;
	}

	public void setCategoria(Integer categoria) {
		this.categoria = categoria;
	}

	public String cumple() {
		if (this.getCategoria() == 1) {
			if (this.getCantHorasTrabMes() >= 10) {
				return("cumple");
			} else {
				return("no cumple");
			}
		} else if (this.getCategoria() == 2) {
			if (this.getCantHorasTrabMes() >= 20) {
				return ("cumple");
			} else {
				return("no cumple");
			}
		} else if (this.getCategoria() == 3) {
			if (this.getCantHorasTrabMes() >= 40) {
				return("cumple");

			} else {
				return"no cumple" ;
			}
		}
		return "mensaje default";
	}
}
