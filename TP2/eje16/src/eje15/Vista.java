package eje15;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.*;
public class Vista {
	private JFrame frame;
	private JPanel panelSuperior;
	private JLabel labelContraseña;
	private JTextField inputContraseña;
	private JPanel panelInferior;
	private JButton botonSaludar;
	
	public Vista() {
	this.frame=new JFrame("Ingrese su nombre");
	this.frame.setSize(400,100);
	this.generarPanelSuperior();
	this.frame.getContentPane().add(BorderLayout.CENTER, this.panelSuperior);
	this.generarPanelInferior();
	frame.getContentPane().add(BorderLayout.SOUTH, panelInferior);
	}
	
	private void generarPanelSuperior() {
	this.panelSuperior = new JPanel();
	this.labelContraseña = new JLabel("INTRODUZCA");
	this.panelSuperior.add(this.labelContraseña);
	this.inputContraseña = new JTextField(25);
	this.inputContraseña.setPreferredSize( new Dimension( 200, 30 ) );
	this.panelSuperior.add(this.inputContraseña);
	}
	
	private void generarPanelInferior() {
	this.panelInferior = new JPanel();
	this.botonSaludar = new JButton("Saludar");
	this.panelInferior.add(this.botonSaludar);
	}
	public void mostrar() {
	this.frame.setVisible(true);
	}
	public JTextField getInputContraseña() {
	return inputContraseña;
	}
	public void setInputContraseña(JTextField inputContraseña) {
	this.inputContraseña = inputContraseña;
	}
	public JButton getBotonSaludar() {
	return botonSaludar;
	}
	
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	}