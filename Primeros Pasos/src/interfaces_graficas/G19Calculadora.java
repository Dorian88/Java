package interfaces_graficas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class G19Calculadora {

	public static void main(String[] args) {
		
		MarcoCalculadora miMarco = new MarcoCalculadora();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);
	}

}

class MarcoCalculadora extends JFrame{
	
	public MarcoCalculadora() {
		
		setTitle("Calculadora");
		setBounds(500, 300, 450, 300);
		LaminaCalculadora miLamina = new LaminaCalculadora();
		add(miLamina);
		//pack();
	}
	
}

class LaminaCalculadora extends JPanel{
	
	public LaminaCalculadora() {
		
		principio = true;
		
		setLayout(new BorderLayout());
		
		pantalla = new JButton("0");
		pantalla.setEnabled(false);
		
		add(pantalla, BorderLayout.NORTH);
		
		miLamina2 = new JPanel();
		
		miLamina2.setLayout(new GridLayout(4, 4));
		
		ActionListener insertar = new InsertaNumero();
		ActionListener orden = new AccionOrden();
		
		ponerBoton("7", insertar);
		ponerBoton("8", insertar);
		ponerBoton("9", insertar);
		ponerBoton("/", orden);
		
		ponerBoton("4", insertar);
		ponerBoton("5", insertar);
		ponerBoton("6", insertar);
		ponerBoton("*", orden);
		
		ponerBoton("1", insertar);
		ponerBoton("2", insertar);
		ponerBoton("3", insertar);
		ponerBoton("-", orden);
		
		ponerBoton("0", insertar);
		ponerBoton(".", insertar);
		ponerBoton("=", orden);
		ponerBoton("+", orden);
		
		add(miLamina2, BorderLayout.CENTER);
		
		ultimaOperacion = "=";
	}
	
	private void ponerBoton(String rotulo, ActionListener oyente) {
		
		JButton boton = new JButton(rotulo);
		
		boton.addActionListener(oyente);
		
		miLamina2.add(boton);
	}
	
	private class InsertaNumero implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			String entrada = e.getActionCommand();
			
			if (principio) {
				pantalla.setText("");
				principio = false;
			}
			
			pantalla.setText(pantalla.getText() + entrada);
			
		}
		
	}
	
	private class AccionOrden implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			principio = true;
			
			String operacion = e.getActionCommand();
			calcular(Double.parseDouble(pantalla.getText()));
			ultimaOperacion = operacion;
			
		}
		
		public void calcular(Double x) {
			
			if (ultimaOperacion.equals("+")){
				
				resultado += x;
				
			}else if (ultimaOperacion.equals("-")) {
				
				resultado -= x;
				
			}else if (ultimaOperacion.equals("*")) {
				
				resultado *= x;
				
			}else if (ultimaOperacion.equals("/")) {
				
				resultado /= x;
				
			}else if (ultimaOperacion.equals("=")) {
				
				resultado = x;
				
			}
			
			pantalla.setText("" + resultado);
			
		}
		
	}
	
	private JPanel miLamina2;
	private JButton pantalla;
	private boolean principio;
	private double resultado;
	private String ultimaOperacion;
}