import java.util.ArrayList;

public class Temporada {
	private Integer numeroTemp;
	private ArrayList<Episodio> episodios;

	public Temporada(Integer numeroTemp, ArrayList<Episodio> episodios) {
         this.numeroTemp=numeroTemp;
         this.episodios=episodios;
	}

	
	
	public ArrayList<Episodio> getEpisodios() {
		return episodios;
	}



	public void setEpisodios(ArrayList<Episodio> episodios) {
		this.episodios = episodios;
	}



	@Override
	public String toString() {
		return "Temporada [numeroTemp=" + numeroTemp + "]";
	}

}
