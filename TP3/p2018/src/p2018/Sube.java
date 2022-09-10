package p2018;

import java.util.ArrayList;

public class Sube {
private Double saldoAct;
private String duenio;
private String contrasenia;
private ArrayList<Viaje> viajes;


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
	viaje.setDescuento(this.viajes); //viajes que la sube tiene hasta el momento, con el cual calculamos el descuento para este viaje
	
	Double desc= viaje.getDescuento(); //descuento para los pasajes comprados de acuerdo a la cantidad de viajes realizados en el mes
//	System.out.println("el descuento en este viaje fue:"+viaje.getDescuento());
	Double precioViaje = viaje.calcPrecio();
    Double precioFinal = precioViaje-(precioViaje* desc);
	if( (this.saldoAct+30 ) < precioFinal) {
		System.out.println("pago no realizado");
		return false;
	} else // tengo que this.saldoAct+30>=precioFinal; 
		System.out.println("añadido");
	       this.setSaldoAct(this.saldoAct-(precioFinal));
		   this.viajes.add(viaje);
	       return true;		   
   }



public void informeMensual() {
    for (int i=0; i<this.viajes.size() ; i++) {
    System.out.println("en el viaje"+i+"hay de descuento:"+ viajes.get(i).getDescuento() ) ;    //Estoy modificando el atributo del padre, cada vez que hago setDescuento, y cada hijo accede a ese atributo actualizado con el getDescuento.Porque cada hijo tiene el mismo padre por ende cada elemento del array, cada viaje en colectivo, accede al mismo atributo del padre; al mismo atributo y valor   		   
}
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
