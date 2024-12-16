package interfaces_graficas;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class G32MarcoMenu{

	public static void main(String[] args){
		
		MenuFrame miMarco = new MenuFrame();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);

	}

}

class MenuFrame extends JFrame{
	
	public MenuFrame(){
		
		setBounds(500, 300, 550, 400);
		MenuLamina miLamina = new MenuLamina();
		add(miLamina);
		setVisible(true);
	}
}

class MenuLamina extends JPanel{
	
	public MenuLamina() {
		
		JMenuBar miBarra = new JMenuBar();
		
		JMenu archivo = new JMenu("Archivo");
		JMenu edicion = new JMenu("Edición");
		JMenu herramientas = new JMenu("Herramientas");
		JMenu opciones = new JMenu("Opciones");
		
		JMenuItem guardar = new JMenuItem("Guardar");
		JMenuItem guardarComo = new JMenuItem("Guardar Como");
		/*JMenuItem cortar = new JMenuItem("Cortar", new ImageIcon("src\\Graficos\\cortar.gif"));
		JMenuItem copiar = new JMenuItem("Copiar");
		JMenuItem pegar = new JMenuItem("Pegar");*/
		JMenuItem cortar = new JMenuItem("Cortar", new ImageIcon("src\\Graficos\\cortar.gif"));
		JMenuItem copiar = new JMenuItem("Copiar", new ImageIcon("src\\Graficos\\copiar.gif"));
		JMenuItem pegar = new JMenuItem("Pegar", new ImageIcon("src\\Graficos\\pegar.gif"));
		JMenuItem generales = new JMenuItem("General");
		JMenuItem opcion1 = new JMenuItem("Opcion 1");
		JMenuItem opcion2 = new JMenuItem("Opcion 2");
		
		archivo.add(guardar);
		archivo.add(guardarComo);
		edicion.add(cortar);
		edicion.add(copiar);
		edicion.add(pegar);
		edicion.addSeparator();
		herramientas.add(generales);
		opciones.add(opcion1);
		opciones.add(opcion2);
		
		edicion.add(opciones);
				
		miBarra.add(archivo);
		miBarra.add(edicion);
		miBarra.add(herramientas);
		
		add(miBarra);
	}
}