package ejercicio14; 
import javax.swing.*;
public class eje14 { public static void main(String[] args) 
{ JFrame frame = new JFrame("Botones");
JPanel panel = new JPanel();
JButton boton1= new JButton("Boton1"); 

boton1.addActionListener(e -> { JOptionPane.showMessageDialog(frame, "Presionaste el botón 1"); });
panel.add(boton1); 
JButton boton2= new JButton("Boton2");
panel.add(boton2);

boton2.addActionListener(e -> { JOptionPane.showMessageDialog(frame, "Repito. Presionaste el botón 2");});
boton2.addActionListener(e -> { JOptionPane.showMessageDialog(frame, "Presionaste el botón 2");
});
frame.add(panel);
frame.setSize(600,922);
frame.setVisible(true);
}
}
