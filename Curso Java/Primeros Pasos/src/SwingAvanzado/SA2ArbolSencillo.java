package SwingAvanzado;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.*;
import javax.swing.tree.*;

public class SA2ArbolSencillo {

	public static void main(String[] args) {
		
		JFrame marco = new MarcoArbol();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco.setVisible(true);

	}

}

class MarcoArbol extends JFrame{
	
	public MarcoArbol() {
		
		setTitle("Arbol Sencillo");
		
		setBounds(350, 300, 600, 200);
		
		//Pais Colombia
		DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("Mundo");
		DefaultMutableTreeNode pais = new DefaultMutableTreeNode("Colombia");
		DefaultMutableTreeNode departamento = new DefaultMutableTreeNode("Antioquia");
		DefaultMutableTreeNode medellin = new DefaultMutableTreeNode("Medellín");
		DefaultMutableTreeNode itagui = new DefaultMutableTreeNode("Itaguí");
		DefaultMutableTreeNode departamento1 = new DefaultMutableTreeNode("Caldas");
		DefaultMutableTreeNode manizales = new DefaultMutableTreeNode("Manizales");
		
		raiz.add(pais);
		pais.add(departamento);
		departamento.add(medellin);
		departamento.add(itagui);
		pais.add(departamento1);
		departamento1.add(manizales);
		
		//Pais Argentina
		pais = new DefaultMutableTreeNode("Argentina");
		DefaultMutableTreeNode provincia = new DefaultMutableTreeNode("Buenos Aires");
		DefaultMutableTreeNode laferrere = new DefaultMutableTreeNode("Laferrere");
		
		raiz.add(pais);
		pais.add(provincia);
		provincia.add(laferrere);
		
		JTree arbol = new JTree(raiz);
		
		/*LaminaArbol miLamina = new LaminaArbol(arbol);
		
		add(miLamina);*/
		
		Container laminaContenido = getContentPane();
		
		laminaContenido.add(new JScrollPane(arbol));
		
	}
}

/*class LaminaArbol extends JPanel{
	
	public LaminaArbol(JTree miArbol) {
		
		setLayout(new BorderLayout());
		
		add(miArbol, BorderLayout.NORTH);
	}
}*/