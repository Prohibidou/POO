import java.util.ArrayList;

public class Serie {

private String titulo;
private ArrayList<Temporada> temporadas;

public Serie (String titulo, ArrayList<Temporada> temporadas ) {
  this.titulo=titulo;
  this.temporadas=temporadas;
	
}



 
public ArrayList<Temporada> getTemporadas() {
	return temporadas;
}




public void setTemporadas(ArrayList<Temporada> temporadas) {
	this.temporadas = temporadas;
}




@Override
public String toString() {
	return "Serie [titulo=" + titulo + "]";
}
	
	
	
}
