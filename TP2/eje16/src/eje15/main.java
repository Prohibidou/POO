package eje15;
public class main {
public static void main(String[] args) {
Modelo modelo = new Modelo();
Vista vista = new Vista();
Controlador controlador = new Controlador(modelo, vista);
}
}