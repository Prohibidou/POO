package mainPrincipal;

import java.net.URLConnection;
import java.net.http.HttpResponse;

import mvc.Controlador;
import mvc.Modelo;
import mvc.Vista;

public class Main {
public static void main(String[] args) {
Modelo modelo = new Modelo();
Vista vista = new Vista();
Controlador controlador = new Controlador(modelo, vista);





}

}