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
		configuraMenu("Negrita", "Estilo", "", Font.BOLD, 1, "src\\Graficos\\negrita.gif");
		configuraMenu("Cursiva", "Estilo", "", Font.ITALIC, 1, "src\\Graficos\\cursiva.gif");
		
		//-----------------------------------------------------------------------------------------------------------------
		configuraMenu("12", "Tamaño", "", 9, 12, "");
		configuraMenu("16", "Tamaño", "", 9, 16, "");
		configuraMenu("20", "Tamaño", "", 9, 20, "");
		configuraMenu("24", "Tamaño", "", 9, 24, "");
		
		//-----------------------------------------------------------------------------------------------------------------
		
		//-----------------------------------------------------------------------------------------------------------------
		/*JMenuItem arial = new JMenuItem("Arial");
		JMenuItem verdana = new JMenuItem("Verdana");
		JMenuItem timesNewRoman = new JMenuItem("Times New Roman");
		JMenuItem negrita = new JMenuItem("Negrita");
		JMenuItem cursiva = new JMenuItem("Cursiva");
		JMenuItem tam12 = new JMenuItem("12");
		JMenuItem tam16 = new JMenuItem("16");
		JMenuItem tam20 = new JMenuItem("20");
		JMenuItem tam24 = new JMenuItem("24");*/
		
		//-----------------------------------------------------------------------------------------------------------------
		/*fuente.add(arial);
		fuente.add(verdana);
		fuente.add(timesNewRoman);
		estilo.add(negrita);
		estilo.add(cursiva);
		tamano.add(tam12);
		tamano.add(tam16);
		tamano.add(tam20);
		tamano.add(tam24);
		
		verdana.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				miArea.setFont(new Font("Verdana", Font.PLAIN, 12));
				
			}
		});
		
		arial.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				miArea.setFont(new Font("Arial", Font.PLAIN, 12));
				
			}
		});
		
		timesNewRoman.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				miArea.setFont(new Font("Times New Roman", Font.PLAIN, 12));
				
			}
		});*/
		//-----------------------------------------------------------------------------------------------------------------
		barra.add(fuente);
		barra.add(estilo);
		barra.add(tamano);
		
		//-----------------------------------------------------------------------------------------------------------------
		laminaMenu.add(barra);
		
		add(laminaMenu, BorderLayout.NORTH);
		add(miArea, BorderLayout.CENTER);
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
				
				elemMenu.addActionListener(new StyledEditorKit.BoldAction());
				
			}else if(estilos == Font.ITALIC);{
				
				elemMenu.addActionListener(new StyledEditorKit.ItalicAction());
			}
			
		}else if(menu == "Tamaño") {
			tamano.add(elemMenu);
			
			elemMenu.addActionListener(new StyledEditorKit.FontSizeAction("cambia Tamaño", tam));
		}
		
		//elemMenu.addActionListener(new GestionaEventos(rotulo, tipoLetra, estilos, tam));
	}
	
	/*private class GestionaEventos implements ActionListener{

		String tipoTexto, menu;
		int estiloLetra, tamLetra;
		
		GestionaEventos(String elemento, String texto2, int estilo2, int tamaLetra){
			
			tipoTexto = texto2;
			estiloLetra = estilo2;
			tamLetra = tamaLetra;
			menu = elemento;
		}
		
		public void actionPerformed(ActionEvent e) {
			
			letras = miArea.getFont();
			
			if (menu == "Arial" || menu == "Verdana" || menu == "Times New Roman") {
				
				estiloLetra = letras.getStyle();
				tamLetra = letras.getSize();
				
			}else if(menu == "Cursiva" || menu == "Negrita") {
				if(letras.getStyle() == 1 || letras.getStyle() == 2) {
					
					estiloLetra = 3;
					
				}
				
				tipoTexto = letras.getFontName();
				tamLetra = letras.getSize();
				
			}else if(menu == "12" || menu == "16" || menu == "20" || menu == "24") {
				
				estiloLetra = letras.getStyle();
				tipoTexto = letras.getFontName();
				
			}
			
			miArea.setFont(new Font(tipoTexto, estiloLetra, tamLetra));
			
		}
		
	}
	
	private class GestionaMenu implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			miArea.setFont(new Font("Verdana", Font.PLAIN, 12));
			
		}
		
	}*/
	
	JTextPane miArea;
	JMenu fuente, estilo, tamano;
	Font letras;
}