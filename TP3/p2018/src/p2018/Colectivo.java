package p2018;

public class Colectivo extends Viaje {
private Double km;


 public Colectivo(Double km) {
	super();
	this.km = km;
}



public Double calcPrecio() {
	if (this.km<=3.0 && this.km>=0.0) {
		return 11.0;
	}else if (this.km<=6.0 && this.km>=4.0){
		return 11.75;
	}else if(this.km<=12.0 && this.km>=7.0) {
		return 12.25;
	}else if (this.km<=27.0 && this.km>=13.0) {
		return 13.0-(13.0*super.getDescuento());
	}else {
		return 13.75;
	}
	
}



public Double getKm() {
	return km;
}



public void setKm(Double km) {
	this.km = km;
}
	
	
}
