package ej9;

import javax.swing.JOptionPane;

public class Controlador {
private Vista vista;
private Modelo modelo;
public Controlador(Modelo modelo, Vista vista) {
this.modelo = modelo;
this.vista = vista;
this.inicializarVista();
}
private void inicializarVista() {
this.vista.getBotonPrecioTotal().addActionListener( e -> this.calculos() );
this.vista.mostrar();
}

private void Leo () {

}

private void calculos() {
//private void Leo ();	
 Integer min = Integer.valueOf(this.vista.getInputMinutos().getText());
 Integer gb = Integer.valueOf(this.vista.getInputGB().getText());
 Integer sms = Integer.valueOf(this.vista.getInputSMS().getText());

this.vista.getLblNewLabel().setText("   personal"+"   "+ String.valueOf(this.modelo.calculoPersonal(sms,min,gb))+
 "   movistar"+"   "+String.valueOf(this.modelo.calculoMovistar(sms,min,gb))+ "   claro "+"   "+String.valueOf(this.modelo.calculoClaro(sms,min,gb)) );


}
}
