package ejercicio5;

public class Main {

	public static void main(String[] args) {

		TortaBuilder builder = new TortaBuilder();
		
		DirectorTorta director = new DirectorTorta();
		
		director.hacerTortaCoco(builder);
		
		Torta torta = builder.getResultado();
		System.out.println("torta construido: "+ torta.toString()  );
		
	}

}
