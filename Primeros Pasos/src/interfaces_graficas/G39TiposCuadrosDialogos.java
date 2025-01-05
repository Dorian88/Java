package interfaces_graficas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class G39TiposCuadrosDialogos {

	public static void main(String[] args) {
		
		CuadrosDialogos miMarco = new CuadrosDialogos();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);

	}

}

class CuadrosDialogos extends JFrame{
	
	public CuadrosDialogos() {
		
		setBounds(500, 300, 400, 250);
		
		add(new LaminaCuadrosDialogos());
	}
}

class LaminaCuadrosDialogos extends JPanel{
	
	public LaminaCuadrosDialogos(){
		
		boton1 = new JButton("Boton 1");
		boton2 = new JButton("Boton 2");
		boton3 = new JButton("Boton 3");
		boton4 = new JButton("Boton 4");
		
		boton1.addActionListener(new AccionBotones());
		boton2.addActionListener(new AccionBotones());
		boton3.addActionListener(new AccionBotones());
		boton4.addActionListener(new AccionBotones());
		
		add(boton1);
		add(boton2);
		add(boton3);
		add(boton4);
	}
	
	private class AccionBotones implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == boton1) {
				JOptionPane.showMessageDialog(LaminaCuadrosDialogos.this, "Mensaje de prueba");
			}else if (e.getSource() == boton2) {
				JOptionPane.showInputDialog("Introduce nombre");
			}else if (e.getSource() == boton3) {
				JOptionPane.showConfirmDialog(LaminaCuadrosDialogos.this, "Elige opción", "V Confirmar", 0);
			}else if (e.getSource() == boton4) {
				JOptionPane.showOptionDialog(LaminaCuadrosDialogos.this, "Elige", "V de Opciones", 1, 1, null, null, null);
			}
		}
		
	}
	
	JButton boton1, boton2, boton3, boton4;
}