package ej9;

public abstract class TarifaProveedor {
protected String nombre;

	public TarifaProveedor(String nombre) {
	super();
	this.nombre = nombre;
    }

    public abstract String getNombre();

	public Double calcular (Integer totalSMS, Integer totalMinutos	, Integer totalGigas) {
		return calcularSMS(totalSMS)+ calcularMinutosDeLlamada(totalMinutos)+calcularConsumoGB(totalGigas);
	}
	
	
	
	public Double calcularSMS (Integer totalSMS) {
	return totalSMS*1.0;	
	}
	
    public Double calcularMinutosDeLlamada (Integer totalMinutos) {
	return	totalMinutos * 15.0;
	}
    
    public Double calcularConsumoGB (Integer totalGigas) {
	   return totalGigas*20.0;
    	
   }


}
