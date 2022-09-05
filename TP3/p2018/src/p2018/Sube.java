package p2018;

import java.util.ArrayList;

public class Sube {
private Double saldoAct;
private String duenio;
private String contrasenia;
private ArrayList<Viaje> viajes= new ArrayList<Viaje>(); //viajes que la sube realiza en el mes.



public Sube(Double saldoAct, String duenio, String contrasenia, ArrayList<Viaje> viajes) {
	super();
	this.saldoAct = saldoAct;
	this.duenio = duenio;
	this.contrasenia = contrasenia;
	this.viajes = viajes;
}



//se ingresa el saldo a acreditar al saldo actual
public void acreditarSalgo(Double saldo) {
this.saldoAct=this.saldoAct+saldo;

}



public Double consultarSaldo() {
	 return this.saldoAct ;
}

public boolean pagarViaje (Viaje viaje) {
	Double desc= viaje.getDescuento(); //descuento para los pasajes comprados de acuerdo a la cantidad de viajes realizados en el mes
	Double precioViaje = viaje.calcPrecio();
	Double precioFinal= precioViaje-precioViaje*desc;
if( this.saldoAct>=0 ) {

	if(this.saldoAct +30 < precioFinal) {
		return false;
	} else if (this.saldoAct+30>=precioFinal) {
	       this.setSaldoAct(this.saldoAct-precioFinal);
		   return true;
		   
	}
}else {
	Double saldoAbs = Math.abs(this.getSaldoAct()) ;
	
	if(saldoAbs < precioFinal) {
		return false;
	} else if (saldoAbs>=precioFinal) {
	       this.setSaldoAct(this.saldoAct-precioFinal);
		   return true;
		   
	}
	
}
	
	return false;



}

public String informeMensual() {
	
return ("la cantidad de viajes realizados por"+this.duenio+"es:"+this.viajes.size());		
	
}

public Double getSaldoAct() {
	return saldoAct;
}

public void setSaldoAct(Double saldoAct) {
	this.saldoAct = saldoAct;
}



public String getDuenio() {
	return duenio;
}

public void setDuenio(String duenio) {
	this.duenio = duenio;
}

public String getContrasenia() {
	return contrasenia;
}

public void setContrasenia(String contrasenia) {
	this.contrasenia = contrasenia;
}

public ArrayList<Viaje> getViajes() {
	return viajes;
}

public void setViajes(ArrayList<Viaje> viajes) {
	this.viajes = viajes;
}



}
