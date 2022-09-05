package ej9;

public class Modelo {
	private TarifaProveedor claro;
	private TarifaProveedor personal;
	private TarifaProveedor movistar;

//lo construyo con instancias de las clases claro,personal y movistar, que heredan de tarifaProveedor

	public Modelo(TarifaProveedor claro, TarifaProveedor personal, TarifaProveedor movistar) {
		this.claro = claro;
		this.personal = personal;
		this.movistar = movistar;
	}

	protected Double calculoPersonal(Integer totalSMS, Integer totalMinutos	, Integer totalGigas) {
		return this.personal.calcular(totalSMS, totalMinutos, totalGigas);
	}
	
	protected Double calculoMovistar(Integer totalSMS, Integer totalMinutos	, Integer totalGigas) {
		return this.movistar.calcular(totalSMS, totalMinutos, totalGigas);
	}
	
	
	protected Double calculoClaro(Integer totalSMS, Integer totalMinutos	, Integer totalGigas) {
		return this.claro.calcular(totalSMS, totalMinutos, totalGigas);
	}
}