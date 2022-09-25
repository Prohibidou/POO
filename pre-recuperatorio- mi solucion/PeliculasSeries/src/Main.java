import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Temporada> temporadas = new ArrayList<Temporada>();

		Random rnd = new Random();
		for (Integer i = 0; i < 2; i++) {
			ArrayList<Episodio> episodios = new ArrayList<Episodio>(); // en cada iteracion creo un nuevo objeto al que
																		// agregarle episodios
			for (Integer j = 0; j < 10; j++) {
				episodios.add(new Episodio(" " + j, rnd.nextFloat(0, 260), rnd.nextInt(0, 11), "fecha " + j));
			}

			temporadas.add(new Temporada(i + 1, episodios));
		}

		Serie serie = new Serie(" 'titulo serie' ", temporadas);

		serie.toString();

		for (Integer i = 0; i < serie.getTemporadas().size(); i++) { // recorro temporadas de la serie

			System.out.println(serie.toString() + serie.getTemporadas().get(i).toString()); // muestro el nro de
																							// temporada de la serie
			for (Integer j = 0; j < serie.getTemporadas().get(i).getEpisodios().size(); j++) { // recorro los episodios
																								// de
																								// esa temporada
				System.out.println(serie.getTemporadas().get(i).getEpisodios().get(j).toString()); // muestro el dato
																									// del episodio j de
																									// esa temporada i
			}

		}

		ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();

		for (Integer i = 0; i < rnd.nextDouble(3, 6); i++) {
			peliculas.add(new Pelicula("titulo" + i, rnd.nextFloat(0, 260), rnd.nextInt(0, 11),
					rnd.nextDouble(0, 1000000), "pais" + i));
		}

//		//otra manera de ordenar arrays, donde primero ordeno por califiacion y a igualdad de ella, ordeno por duracion
//		Comparator<Pelicula> porCalificacion = Comparator.comparing(Pelicula::getCalif);
//		Comparator<Pelicula> porDuracion = Comparator.comparing(Pelicula::getDuracion);
//		peliculas.sort(porCalificacion.thenComparing(porDuracion));
//		

		System.out.println("\n \n peliculas ordenadas por calificacion, descendentemente: ");
		Collections.sort(peliculas, (p1, p2) -> p1.getCalif().compareTo(p2.getCalif()));
		Collections.reverse(peliculas); 

		for (Integer i = 0; i < peliculas.size(); i++) {
			System.out.println(peliculas.get(i).toString());
		}

		ArrayList<Obra> obras = new ArrayList<Obra>();

		obras.addAll(peliculas);
		obras.addAll(serie.getTemporadas().get(0).getEpisodios());
		obras.addAll(serie.getTemporadas().get(1).getEpisodios());

		Collections.sort(obras, (o1, o2) -> o1.getDuracion().compareTo(o2.getDuracion()));
        Collections.reverse(obras); //CUIDADO! si no llamas a este metodo, vas a mostrar de 0 a 5 los 5 mas chicos en duracion.Al hacer reverse, en las primeras 5 tenes a los que tienen mayor duracion  ( y no a lo ultimo del array)
		System.out.println("\n obras ordenadas por mayor duracion");
		for (Integer i = 0; i < 5; i++) {
			System.out.println(obras.get(i).toString());
		}
	}

}
