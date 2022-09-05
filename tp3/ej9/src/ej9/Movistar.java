package ej9;

public class Movistar extends TarifaProveedor {

  public Movistar (String nombre){
	  super(nombre);		
	}
  
  
  public Double calcular (Integer totalSMS, Integer totalMinutos	, Integer totalGigas) {
     double precioMinutos= super.calcularMinutosDeLlamada(totalMinutos)+super.calcularMinutosDeLlamada(totalMinutos)*0.20;
     double precioGB = super.calcularConsumoGB(totalGigas) + super.calcularConsumoGB(totalGigas)*0.30  ;
     double precioMensaje = super.calcularSMS(totalSMS)*0.1+super.calcularSMS(totalSMS) ;
	 return precioMinutos+precioGB+ precioMensaje;
  } 
  
  
  public String getNombre() {
	  return this.nombre;
 }
	
	
}