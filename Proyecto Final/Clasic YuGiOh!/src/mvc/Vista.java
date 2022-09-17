package mvc;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.*;
public class Vista {

private JFrame frame;
private JPanel panelInferior;
private JButton botonGenerar;
//private ImageIcon Card;
private JLabel carta;
private JPanel panel1_1;
private JPanel panel1;
private JPanel panel1_2;

private JLabel carta_1;
private JLabel carta_2;
private JLabel carta_3;
private JPanel panel_Tablero;
private JLabel carta_4;
private JLabel fondo;

ArrayList<JPanel> cartas_tablero = new ArrayList<JPanel>();


public Vista() {	
this.frame=new JFrame("TABLERO");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);
this.frame.setSize(2000,2000);
this.generarPanelSuperior();


//this.generarPanelInferior();

}




private void generarPanelSuperior() {

//accedo a carta_1 y creo el label
BufferedImage img = null;
try {
    img = ImageIO.read(new File("dark_magician.jpg"));
} catch (IOException e) {
    e.printStackTrace(); //si no encuentra el archivo, lo dirà
}
Image dimg = img.getScaledInstance(150, 150,
        Image.SCALE_SMOOTH);
ImageIcon imageIcon = new ImageIcon(dimg);

//accedo a carta_2 y creo el label
BufferedImage img2 = null;
try {
  img2 = ImageIO.read(new File("dark_magician.jpg"));
} catch (IOException e) {
  e.printStackTrace(); //si no encuentra el archivo, lo dirà
}
Image dimg2 = img2.getScaledInstance(150, 150,
      Image.SCALE_SMOOTH);
ImageIcon imageIco2 = new ImageIcon(dimg2);

//accedo a carta_3 y creo el label
BufferedImage img3 = null;
try {
img3 = ImageIO.read(new File("Cambio_de_fidelidad.jpg"));
} catch (IOException e) {
e.printStackTrace(); //si no encuentra el archivo, lo dirà
}
Image dimg3 = img3.getScaledInstance(150, 150,
    Image.SCALE_SMOOTH);
ImageIcon imageIco3 = new ImageIcon(dimg3);

// Panel tablero
panel_Tablero = new JPanel();
panel_Tablero.setBackground(Color.RED);
panel_Tablero.setForeground(Color.RED);
//panel_Tablero.setBackground(Color.RED);
panel_Tablero.setBounds(0, 0, 1027, 463);
frame.getContentPane().add(panel_Tablero);
panel_Tablero.setLayout(null);



//Fondo del tablero
BufferedImage img4 = null;
try {
img4 = ImageIO.read(new File("fondo_tablero.jpg"));
} catch (IOException e) {
e.printStackTrace(); //si no encuentra el archivo, lo dirà
}
Image dimg4 = img4.getScaledInstance(2000, 2000, Image.SCALE_SMOOTH);
ImageIcon imageIco4 = new ImageIcon(dimg4);
fondo= new JLabel(imageIco4);

//frame.add(fondo);
panel_Tablero.add(fondo);



//preparo el panel 1_1
carta_1= new JLabel(imageIcon);
panel1_1 = new JPanel();
panel1_1.setBounds(552, 158, 122, 132);
//panel_Tablero.add(panel1_1);
panel1_1.setBackground(Color.RED);
panel1_1.add(carta_1);
cartas_tablero.add(panel1_1);
//carta_2.setVisible(false);

//preparo el panel1
panel1 = new JPanel();
panel1.setBounds(387, 158, 122, 132);
//panel_Tablero.add(panel1);
panel1.setBackground(Color.BLACK);
carta_2= new JLabel(imageIco2);
panel1.add(carta_2);

//Array TABLERO ( array de paneles de cartas)
cartas_tablero.add(panel1);



//preparo el panel1_2
panel1_2 = new JPanel();
panel1_2.setBounds(720, 158, 122, 132);
//panel_Tablero.add(panel1_2);
panel1_2.setBackground(Color.BLACK);
carta_3= new JLabel(imageIco3);
panel1_2.add(carta_3); 
cartas_tablero.add(panel1_2);




}



private void generarPanelInferior() {
this.panelInferior = new JPanel();
this.botonGenerar = new JButton("Generar");
this.panelInferior.add(this.botonGenerar);
}



public void mostrar() {
this.frame.setVisible(true);
}
}