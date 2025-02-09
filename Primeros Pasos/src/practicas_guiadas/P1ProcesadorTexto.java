//Programa que hace un procesador de texto.

package practicas_guiadas;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;

import java.awt.*;
import java.awt.event.*;

public class P1ProcesadorTexto {

	public static void main(String[] args) {
		
		MenuProcesador miMarco = new MenuProcesador();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MenuProcesador extends JFrame{
	
	public MenuProcesador() {
		
		setBounds(500, 300, 550, 400);
		LaminaProcesador miLamina = new LaminaProcesador();
		add(miLamina);
		setVisible(true);
	}
}

class LaminaProcesador extends JPanel{
	
	public LaminaProcesador(){
		
		setLayout(new BorderLayout());
		JPanel laminaMenu = new JPanel();
		JMenuBar barra = new JMenuBar();
		miArea = new JTextPane();
		
		//-----------------------------------------------------------------------------------------------------------------
		fuente = new JMenu("Fuente");
		estilo = new JMenu("Estilo");
		tamano = new JMenu("Tamaño");
		
		configuraMenu("Arial", "Fuente", "Arial", 9, 10, "");
		configuraMenu("Verdana", "Fuente", "Verdana", 9, 10, "");
		configuraMenu("Times New Roman", "Fuente", "Times New Roman", 9, 10, "");
		
		//-----------------------------------------------------------------------------------------------------------------
		JCheckBoxMenuItem negrita = new JCheckBoxMenuItem("Negrita", new ImageIcon("src\\Graficos\\negrita.gif"));
		JCheckBoxMenuItem cursiva = new JCheckBoxMenuItem("Cursiva", new ImageIcon("src\\Graficos\\cursiva.gif"));
		
		negrita.addActionListener(new StyledEditorKit.BoldAction());
		cursiva.addActionListener(new StyledEditorKit.ItalicAction());
		
		estilo.add(negrita);
		estilo.add(cursiva);
		
		//-----------------------------------------------------------------------------------------------------------------
		ButtonGroup tamanoLetra = new ButtonGroup();
		
		JRadioButtonMenuItem doce = new JRadioButtonMenuItem("12");
		JRadioButtonMenuItem dieciseis = new JRadioButtonMenuItem("16");
		JRadioButtonMenuItem veinte = new JRadioButtonMenuItem("20");
		JRadioButtonMenuItem veinticuatro = new JRadioButtonMenuItem("24");
		
		veinticuatro.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK));
		
		tamanoLetra.add(doce);
		tamanoLetra.add(dieciseis);
		tamanoLetra.add(veinte);
		tamanoLetra.add(veinticuatro);
		
		doce.addActionListener(new StyledEditorKit.FontSizeAction("cambia Tamaño", 12));
		dieciseis.addActionListener(new StyledEditorKit.FontSizeAction("cambia Tamaño", 16));
		veinte.addActionListener(new StyledEditorKit.FontSizeAction("cambia Tamaño", 20));
		veinticuatro.addActionListener(new StyledEditorKit.FontSizeAction("cambia Tamaño", 24));
		
		tamano.add(doce);
		tamano.add(dieciseis);
		tamano.add(veinte);
		tamano.add(veinticuatro);
		
		//-----------------------------------------------------------------------------------------------------------------
		barra.add(fuente);
		barra.add(estilo);
		barra.add(tamano);
		
		//-----------------------------------------------------------------------------------------------------------------
		laminaMenu.add(barra);
		
		add(laminaMenu, BorderLayout.NORTH);
		add(miArea, BorderLayout.CENTER);
		
		//-----------------------------------------------------------------------------------------------------------------
		JPopupMenu emergente = new JPopupMenu();
		JMenuItem negritaE = new JMenuItem("Negrita");
		JMenuItem cursivaE = new JMenuItem("Cursiva");
		
		negritaE.addActionListener(new StyledEditorKit.BoldAction());
		cursivaE.addActionListener(new StyledEditorKit.ItalicAction());
		
		emergente.add(negritaE);
		emergente.add(cursivaE);
				
		miArea.setComponentPopupMenu(emergente);
		
		//-----------------------------------------------------------------------------------------------------------------
		//Barra de Herramientas
				
		miBarra = new JToolBar();
		
		configuraBarra("src\\Graficos\\negrita.gif").addActionListener(new StyledEditorKit.BoldAction());
		configuraBarra("src\\Graficos\\cursiva.gif").addActionListener(new StyledEditorKit.ItalicAction());
		configuraBarra("src\\Graficos\\Subrayar.gif").addActionListener(new StyledEditorKit.UnderlineAction());
		
		miBarra.addSeparator();
		
		configuraBarra("src\\Graficos\\Amarillo.gif").addActionListener(new StyledEditorKit.ForegroundAction("Poner Amarillo", Color.YELLOW));
		configuraBarra("src\\Graficos\\Azul.gif").addActionListener(new StyledEditorKit.ForegroundAction("Poner Azul", Color.BLUE));
		configuraBarra("src\\Graficos\\Rojo.gif").addActionListener(new StyledEditorKit.ForegroundAction("Poner Rojo", Color.RED));
		
		miBarra.addSeparator();
		
		configuraBarra("src\\Graficos\\izquierda.gif").addActionListener(new StyledEditorKit.AlignmentAction("Izquierda", 0));
		configuraBarra("src\\Graficos\\centrado.gif").addActionListener(new StyledEditorKit.AlignmentAction("Centrado", 1));
		configuraBarra("src\\Graficos\\derecha.gif").addActionListener(new StyledEditorKit.AlignmentAction("Derecha", 2));
		configuraBarra("src\\Graficos\\justificado.gif").addActionListener(new StyledEditorKit.AlignmentAction("Justificado", 3));
		
		
		
		miBarra.setOrientation(1);
		add(miBarra, BorderLayout.WEST);
	}
	
	public JButton configuraBarra(String ruta) {
		
		JButton boton = new JButton(new ImageIcon(ruta));
		
		miBarra.add(boton);
		
		return boton;
	}
	
	public void configuraMenu(String rotulo, String menu, String tipoLetra, int estilos, int tam, String rutaMenu) {
		
		JMenuItem elemMenu = new JMenuItem(rotulo, new ImageIcon(rutaMenu));
		
		if(menu == "Fuente") {
			
			if(tipoLetra == "Arial") {
				
				elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("CambiaLetra", "Arial"));
				
			}else if(tipoLetra == "Verdana") {
				
				elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("CambiaLetra", "Verdana"));
				
			}else if(tipoLetra == "Times New Roman") {
				
				elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("CambiaLetra", "Times New Roman"));
				
			}
			
			fuente.add(elemMenu);
			
		}else if(menu == "Estilo") {
			
			estilo.add(elemMenu);
			
			if(estilos == Font.BOLD) {
				
				elemMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
				
				elemMenu.addActionListener(new StyledEditorKit.BoldAction());
				
			}else if(estilos == Font.ITALIC);{
				
				elemMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_DOWN_MASK));
				
				elemMenu.addActionListener(new StyledEditorKit.ItalicAction());
			}
			
		}else if(menu == "Tamaño") {
			tamano.add(elemMenu);
			
			elemMenu.addActionListener(new StyledEditorKit.FontSizeAction("cambia Tamaño", tam));
		}
	}
	
	JTextPane miArea;
	JMenu fuente, estilo, tamano;
	Font letras;
	JButton negritaBarra, cursivaBarra, subrayarBarra, azulBarra, rojoBarra, amarilloBarra, izquierdaBarra, centroBarra, derechaBarra,
	justificadoBarra;
	JToolBar miBarra;
}