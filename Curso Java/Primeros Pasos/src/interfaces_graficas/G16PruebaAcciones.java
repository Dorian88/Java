package interfaces_graficas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class G16PruebaAcciones {

	public static void main(String[] args) {
		
		MarcoAccion marco = new MarcoAccion();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco.setVisible(true);
	}

}

class MarcoAccion extends JFrame{
	
	public MarcoAccion () {
		
		setTitle("PruebaAcciones");
		setBounds(500, 250, 500, 200);
		PanelAccion lamina = new PanelAccion();
		add(lamina);
	}
}

class PanelAccion extends JPanel{
	
	public PanelAccion() {
		
		/*JButton botonAmarillo = new JButton("Amarillo");
		JButton botonAazul = new JButton("Azul");
		JButton botonRojo = new JButton("Rojo");
		
		add(botonAmarillo);
		add(botonAazul);
		add(botonRojo);*/
		
		AccionColor accionAmarillo = new AccionColor("Amarillo", new ImageIcon("src\\Graficos\\Amarillo.gif"), Color.YELLOW);
		AccionColor accionAzul = new AccionColor("Azul", new ImageIcon("src\\Graficos\\Azul.gif"), Color.BLUE);
		AccionColor accionRojo = new AccionColor("Rojo", new ImageIcon("src\\Graficos\\Rojo.gif"), Color.RED);
		
		add(new JButton(accionAmarillo));
		add(new JButton(accionAzul));
		add(new JButton(accionRojo));
		
		InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		
		/*KeyStroke teclaAmarillo = KeyStroke.getKeyStroke("Ctrl A");
		KeyStroke teclaAzul = KeyStroke.getKeyStroke("Ctrl B");
		KeyStroke teclaRojo = KeyStroke.getKeyStroke("Ctrl R");*/
		
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "fondo_amarillo");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondo_azul");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"), "fondo_rojo");
		
		ActionMap mapaAccion = getActionMap();
		
		mapaAccion.put("fondo_amarillo", accionAmarillo);
		mapaAccion.put("fondo_azul", accionAzul);
		mapaAccion.put("fondo_rojo", accionAmarillo);
	}
	
	private class AccionColor extends AbstractAction{

		public AccionColor(String nombre, Icon icono, Color colorBoton) {
			
			putValue(Action.NAME, nombre);
			putValue(Action.SMALL_ICON, icono);
			putValue(Action.SHORT_DESCRIPTION, "Poner la lamina de color " + nombre);
			putValue("Color de fondo", colorBoton);
		}
		
		public void actionPerformed(ActionEvent e){
			
			Color c = (Color)getValue("Color de fondo");
			setBackground(c);
		}
		
	}
}