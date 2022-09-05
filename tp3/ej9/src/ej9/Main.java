package ej9;
public class Main {
public static void main(String[] args) {
TarifaProveedor tarifa1 = new Claro("proveedor nombre 1"); 
TarifaProveedor tarifa2 = new Movistar("proveedor nombre 1"); 
TarifaProveedor tarifa3 = new Personal("proveedor nombre 1"); 



Modelo modelo = new Modelo(tarifa1,tarifa2,tarifa3);
Vista vista = new Vista();
Controlador controlador = new Controlador(modelo, vista);


//esto no lo voy a usar

Personal ejemplo = new Personal("nombre");
//Cuando hago una instancia de un hijo, puedo usar todos los metodos heredados más los suyos que ningun otro hijo tiene,
//pero es recomendable no hacer metodos que sólo tenga un hijo, pues la idea de estos parciales es que vos generalices/hagas herencia de todo o de lo más posible, así no hay hijos con metodos o atributos de solamente ellos.
}

	

}