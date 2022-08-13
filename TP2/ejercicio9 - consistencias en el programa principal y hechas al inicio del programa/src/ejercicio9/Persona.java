package ejercicio9;

import java.util.Scanner;

public class Persona {
private String sexo;
private Integer edad;
private Integer estudia; //true significa que si estudia.
private Integer trabaja; //true significa que si trabaja


public Persona() { //construyo el objeto, pero sus atributos son inicializados en 0 o nulo.
	super();
}


	

public Integer getTrabaja() {
	return trabaja;
}

public void setTrabaja() {
	System.out.println("usted trabaja?");
    this.trabaja = Persona.consistoEstudiaTrabaja();
}

public String getSexo() {
	return sexo;
}

public void setSexo() {
	this.sexo = Persona.consistoSexo();
}

public Integer getEdad() {
	return edad;
}
public void setEdad() {
	this.edad = Persona.consistoEdad();
}

public Integer getEstudia() {
	return estudia;
}

public void setEstudia() {
	System.out.println("usted estuda?");
	this.estudia = Persona.consistoEstudiaTrabaja() ;
}

private static String consistoSexo () {
	Scanner in =new  Scanner (System.in);
	String respuesta;
	String retornoFalso=""; //es un retorno que nunca se va a producir, pero me permite compilar y evitar los errores que me aparecen.
	int control=0;
	while (control==0) {
		System.out.println("su sexo biologico es masculino,presione M, o femenino, presione F ?");
	respuesta=in.nextLine();
	respuesta=respuesta.toUpperCase();
	if(respuesta.equals("M")|| respuesta.equals("F")){
		System.out.println("respuesta valida, y es:"+respuesta);
		control=1;
		return respuesta;
	}else {
		System.out.println("ingrese una respuesta valida");
	}
	} return retornoFalso;

}

public static Integer consistoEdad() {
	Scanner in = new Scanner (System.in);
	int cont=0;
	int suEdad;
	while (cont==0) {
		System.out.println("ingrese su edad");
		if ( in.hasNextInt() ) {
			 suEdad=in.nextInt();
			if (suEdad>=0 && suEdad<=120) {
				System.out.println("ha introducido un valor de edad correcto");
				return suEdad;
			} else {
				System.out.println("su edad es imposible");
			}
		}else {
			in.next();
		System.out.println("ingrese un entero para su edad ");	
		}
		
			
	} return cont ; //nunc retornaré cont pero me evito los errores que surgen 
	
}

public static Integer consistoEstudiaTrabaja () { //si lo hago static, lo puedo llamar
	//en la misma clase sin necesidad de instanciar un nuevo objeto.
	String respuesta;
	int control=0;
	Integer integerAtributo=0;
	Scanner in = new Scanner (System.in);
	while (control==0) {
	System.out.println(" presione 1 para si, y 0 para no");
	respuesta = in.nextLine();
	if (respuesta.equals("1") || respuesta.equals("0")) {
         System.out.println("la respuesta fue ingresada correctamente, y es: "+ respuesta);
        integerAtributo = Integer.valueOf(respuesta);
        return integerAtributo;
	} else {
		System.out.println("ingreso una respuesta invalida, introduzcala denuevo");
	}
	}
	return integerAtributo;
}	
}
