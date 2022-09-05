package ej9;

public class Personal extends TarifaProveedor {

  public Personal (String nombre){
	  super(nombre);		
	}
  
  
  public Double calcular (Integer totalSMS, Integer totalMinutos	, Integer totalGigas) {
     double precioMinutos= super.calcularMinutosDeLlamada(totalMinutos)+super.calcularMinutosDeLlamada(totalMinutos)*0.20;
     double precioGB = super.calcularConsumoGB(totalGigas)+super.calcularConsumoGB(totalGigas)*0.50;
	 return precioMinutos+precioGB+ super.calcularSMS(totalSMS);
  } 
  
public void nada() {
	
}
  
  public String getNombre() {
	  return this.nombre;
 }
	
	
}