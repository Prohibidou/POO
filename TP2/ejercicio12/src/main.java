import java.time.LocalDate;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
        
	    Empresa empresa = new Empresa ("saico.sa","avenida callao 3412");
	    Puesto puesto = new Puesto();
	    Puesto puesto1 = new Puesto();
	    Puesto puesto2 = new Puesto();
	    
	    LocalDate fechaNac=LocalDate.of(1999, 12, 02);
	    LocalDate fechaNac2=LocalDate.of(1992, 02, 02);
	    puesto.setPuesto("admin");
        puesto1.setPuesto("gerente");
        puesto2.setPuesto("tesorero");
	    
		Persona persona1 = new Persona ("maxi","vera",fechaNac,puesto);
		Persona persona2 = new Persona ("jose","vera",fechaNac,puesto);
		Persona persona3 = new Persona ("romina","vmn",fechaNac,puesto);
		Persona persona4 = new Persona ("juamna","vertc",fechaNac2,puesto1);
		Persona persona5 = new Persona ("juanmpa","robi",fechaNac2,puesto2);
		
		empresa.setEmpleados(new ArrayList<Persona>());
		empresa.añadoEmpleado(persona1); //añade de izquierda a derecha, del primero al ultimo
		empresa.añadoEmpleado(persona2);
		empresa.añadoEmpleado(persona3);
		empresa.añadoEmpleado(persona4);
		empresa.añadoEmpleado(persona5);
		
		System.out.println("la cantidad total de empleados es:"+ empresa.numTotalEmp(empresa.getEmpleados()));
	      //imprime de izquierda a derecha, del primero al ultimo, en el mismo orden que se lo añade a la lista con  Lista.add(i)
		 for (int i=0;i<empresa.getEmpleados().size();i++) {
			System.out.println(empresa.getEmpleados().get(i).toString());
			
			 
			 
		 }
	}

}
