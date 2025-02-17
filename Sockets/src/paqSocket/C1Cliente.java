package paqSocket;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class C1Cliente {

	public static void main(String[] args) {
		
		MarcoCliente miMarco = new MarcoCliente();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoCliente extends JFrame{
	
	public MarcoCliente() {
		
		setBounds(600, 300, 280, 350);
		
		LaminaMarcoCliente miLamina = new LaminaMarcoCliente();
		
		add(miLamina);
		
		setVisible(true);
	}
}

class LaminaMarcoCliente extends JPanel{
	
	public LaminaMarcoCliente() {
		
		JLabel texto = new JLabel("CLIENTE");
		
		add(texto);
		
		campo1 = new JTextField(20);
		
		add(campo1);
		
		miBoton = new JButton("Enviar");
		
		EnviaTexto miEvento = new EnviaTexto();
		
		miBoton.addActionListener(miEvento);
		
		add(miBoton);
	}
	
	private class EnviaTexto implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			try {
				
				Socket miSocket = new Socket("192.168.1.4", 9999);
				
				DataOutputStream flujoSalida = new DataOutputStream(miSocket.getOutputStream());
				
				flujoSalida.writeUTF(campo1.getText());
				
				flujoSalida.close();
				
			} catch (IOException e1) {
				
				System.out.println(e1.getMessage());
				
			}
			
		}
		
	}
	
	private JTextField campo1;
	private JButton miBoton;
}