package ej9;

public class Claro extends TarifaProveedor {

  public Claro (String nombre){
	  super(nombre);		
	}
  
  
public Double calcular (Integer totalSMS, Integer totalMinutos	, Integer totalGigas) {
return super.calcular(totalSMS, totalMinutos, totalGigas)+	super.calcular(totalSMS, totalMinutos, totalGigas)*0.20; //extiendo el metodo del padre.
} 
  
  
  public String getNombre() {
	  return this.nombre;
  }
	
	
}
