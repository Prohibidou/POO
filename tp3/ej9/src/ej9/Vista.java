package ej9;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.*;

public class Vista {
	private JFrame frame;
	public JPanel panelSuperior;
	private JLabel labelMinutos;
	private JLabel labelSMS;
	private JLabel labelGB;
	private JTextField inputMinutos;
	private JTextField inputSMS;
	private JTextField inputGB;
	private JPanel panelInferior;
	private JButton botonPrecioTotal;
	private JTextPane panelPrecio;
	private JLabel lblNewLabel;

	public Vista() {
		this.frame = new JFrame("calc precio");
		this.frame.setSize(600, 200);
		this.generarPanelSuperior();
		this.frame.getContentPane().add(BorderLayout.CENTER, this.panelSuperior);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setEnabled(true);
		lblNewLabel.setBounds(10, 75, 576, 55);
		panelSuperior.add(lblNewLabel);
		this.generarPanelInferior();
		frame.getContentPane().add(BorderLayout.SOUTH, panelInferior);
	}

	private void generarPanelSuperior() {
		this.panelSuperior = new JPanel();
		this.labelMinutos = new JLabel("minutos");

		labelMinutos.setBounds(10, 13, 93, 14);
		
		
		this.labelSMS = new JLabel("SMS");
		labelSMS.setBounds(134, 46, 134, 14);

		
		
		
		
		this.labelGB = new JLabel("GB");
		labelGB.setBounds(346, 13, 27, 14);
		panelSuperior.setLayout(null);
		this.panelSuperior.add(this.labelMinutos);
		this.panelSuperior.add(this.labelSMS);
		this.panelSuperior.add(this.labelGB);

		
		this.inputMinutos = new JTextField(25);
		inputMinutos.setBounds(124, 5, 206, 30);
		this.inputMinutos.setPreferredSize(new Dimension(200, 30));
		this.panelSuperior.add(this.inputMinutos);
		
		this.inputGB = new JTextField(25);
		inputGB.setBounds(380, 5, 206, 30);
		this.inputGB.setPreferredSize(new Dimension(100, 30));
		this.panelSuperior.add(this.inputGB);
		
		this.inputSMS = new JTextField(25);
		inputSMS.setBounds(278, 38, 298, 30);
		this.inputSMS.setPreferredSize(new Dimension(250, 30));
		this.panelSuperior.add(this.inputSMS);
		
		
	}
	
	
	
	
	

	public JTextField getInputMinutos() {
		return inputMinutos;
	}

	public void setInputMinutos(JTextField inputMinutos) {
		this.inputMinutos = inputMinutos;
	}

	public JTextField getInputSMS() {
		return inputSMS;
	}

	public void setInputSMS(JTextField inputSMS) {
		this.inputSMS = inputSMS;
	}

	public JTextField getInputGB() {
		return inputGB;
	}

	public void setInputGB(JTextField inputGB) {
		this.inputGB = inputGB;
	}

	public JLabel getLblNewLabel() {
		return lblNewLabel;
	}

	public void setLblNewLabel(JLabel lblNewLabel) {
		this.lblNewLabel = lblNewLabel;
	}

	private void generarPanelInferior() {
		this.panelInferior = new JPanel();
		this.botonPrecioTotal = new JButton("precioTotal");
		this.panelInferior.add(this.botonPrecioTotal);
	}

	public void mostrar() {
		this.frame.setVisible(true);
	}

	
	

	
	

	
	


	public void setLabelPrecio(JLabel labelPrecio) {
		this.labelMinutos = labelPrecio;
	}



	public JButton getBotonPrecioTotal() {
		return botonPrecioTotal;
	}

	public void setBotonPrecioTotal(JButton botonPrecioTotal) {
		this.botonPrecioTotal = botonPrecioTotal;
	}


}