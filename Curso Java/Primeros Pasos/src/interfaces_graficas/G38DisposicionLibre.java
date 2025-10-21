package interfaces_graficas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class G38DisposicionLibre {

	public static void main(String[] args) {
		
		MarcoLibre miMarco = new MarcoLibre();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoLibre extends JFrame{
	
	public MarcoLibre() {
		
		setBounds(350, 250, 600, 400);
		
		LaminaLibre miLamina = new LaminaLibre();
		
		add(miLamina);
		
		setVisible(true);
		
	}
}

class LaminaLibre extends JPanel{
	
	public LaminaLibre() {
		
		setLayout(new EnColumnas());
		
		JLabel nombre = new JLabel("Nombre: ");
		JLabel apellido = new JLabel("Apellido: ");
		JLabel edad = new JLabel("Edad: ");
		JLabel telefono = new JLabel("Telefono: ");
		
		JTextField cNombre = new JTextField ();
		JTextField cApellido = new JTextField ();
		JTextField cEdad = new JTextField ();
		JTextField cTelefono = new JTextField ();
		
		/*nombre.setBounds(20, 20, 80, 10);
		cNombre.setBounds(100, 17, 100, 20);
		apellido.setBounds(20, 60, 80, 15);
		cApellido.setBounds(100, 55, 100, 20);*/
		
		
		add(nombre);
		add(cNombre);
		add(apellido);
		add(cApellido);
		add(edad);
		add(cEdad);
		add(telefono);
		add(cTelefono);
		
		/*JButton boton1 = new JButton("Boton 1");
		JButton boton2 = new JButton("Boton 2");
		
		boton1.setBounds(50, 50, 120, 25);
		boton2.setBounds(200, 100, 120, 25);
				
		add(boton1);
		add(boton2);*/
		
		
	}
}

class EnColumnas implements LayoutManager{

	@Override
	public void addLayoutComponent(String name, Component comp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeLayoutComponent(Component comp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Dimension preferredLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dimension minimumLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	public void layoutContainer(Container miContenedor) {
		
		int contador = 0, n = miContenedor.getComponentCount();
		int d = miContenedor.getWidth();
		
		x = d/2;
		
		for(int i = 0; i < n; i++) {
			contador++;
			
			Component c = miContenedor.getComponent(i);
			
			c.setBounds(x - 100, y, 100, 20);
			x += 100;
			
			if(contador % 2 == 0) {
				x = d/2;
				y += 40;
			}
		}
		
	}
	
	private int x, y = 20;
}