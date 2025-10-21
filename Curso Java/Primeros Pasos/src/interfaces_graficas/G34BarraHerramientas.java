package interfaces_graficas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class G34BarraHerramientas {

	public static void main(String[] args) {
		
		MarcoBarra marco = new MarcoBarra();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco.setVisible(true);

	}

}

class MarcoBarra extends JFrame{
	
	public MarcoBarra() {
		
		setTitle("Marco con Barra");
		setBounds(500, 300, 600, 450);
		lamina = new JPanel();
		add(lamina);
		
		//Configuración de acciones
		
		Action accionAmarillo = new AccionColor1("Amarillo", new ImageIcon("src\\Graficos\\Amarillo.gif"), Color.YELLOW);
		Action accionAzul = new AccionColor1("Azul", new ImageIcon("src\\Graficos\\Azul.gif"), Color.BLUE);
		Action accionRojo = new AccionColor1("Rojo", new ImageIcon("src\\Graficos\\Rojo.gif"), Color.RED);
		Action accionSalir = new AbstractAction("Salir", new ImageIcon("src\\Graficos\\Salir.gif")) {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
			
		};
		
		JMenu menu = new JMenu("Color");
		
		menu.add(accionAmarillo);
		menu.add(accionAzul);
		menu.add(accionRojo);
		
		JMenuBar barraMenu = new JMenuBar();
		
		barraMenu.add(menu);
		
		setJMenuBar(barraMenu);
		
		//Construccion de la barra de herramientas
		
		JToolBar barra = new JToolBar();
		
		barra.add(accionAmarillo);
		barra.add(accionAzul);
		barra.add(accionRojo);
		
		barra.addSeparator();
		
		barra.add(accionSalir);
		
		add(barra, BorderLayout.NORTH);
	}
	
	private class AccionColor1 extends AbstractAction{

		public AccionColor1(String nombre, Icon icono, Color colorBoton) {
			
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
	
	private JPanel lamina;
}
