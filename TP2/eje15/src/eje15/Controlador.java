package eje15;
public class Controlador {
private Vista vista;
private Modelo modelo;

public Controlador(Modelo modelo, Vista vista) {
this.modelo = modelo;
this.vista = vista;
this.inicializarVista();
}


private void inicializarVista() {
	
	//el boton que generé le añado el metodo addActionListener que lo que hace es que cuando se aprete llame al metodo generarContraseña
this.vista.getBotonGenerar().addActionListener( e -> this.generarContraseña() ); 
this.vista.mostrar();
}

private void generarContraseña() {
this.modelo.generarContraseña();
this.vista.getInputContraseña().setText( this.modelo.getContraseña() );
}

}