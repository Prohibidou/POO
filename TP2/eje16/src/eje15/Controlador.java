package eje15;

import javax.swing.JOptionPane;

public class Controlador {
private Vista vista;
private Modelo modelo;
private SaludoRespuesta saludoRespuesta;
public Controlador(Modelo modelo, Vista vista) {
this.modelo = modelo;
this.vista = vista;
this.inicializarVista();
}


private void inicializarVista() {
//el boton que generé le añado el metodo addActionListener que lo que hace es que cuando se aprete llame al metodo generarContraseña de esta clase para llamar mediante el objeto modelo, al metodo de la clase modelo
  this.vista.getBotonSaludar().addActionListener(( e -> this.Saludo()));
  
  this.vista.mostrar();
}

private void Saludo() {
this.modelo.setContraseña(this.vista.getInputContraseña().getText()); //el input existe y lo guardamos en el atributo de la clase modelo
JOptionPane.showMessageDialog(this.vista.getFrame(), "HELLO, MR. "+ modelo.getContraseña());
System.out.println("la contraseña es"+ this.modelo.getContraseña()); //me muestro a mí en consola qué contraseña se ingreso, para ver si se guardó
//le seteo la contraseña generada al cartelito donde dice que instroduzcas la contaseña
}
 
}