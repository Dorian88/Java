package Beans;

import java.awt.Dimension;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;

/**
 * Esta clase pretende construir un Bean para incluir imágenes
 * @author Dorian
 *  
 */


public class B1VisorDeImagenes extends JLabel{
	
	public B1VisorDeImagenes() {
		
		setBorder(BorderFactory.createEtchedBorder());
	}
	
	/**
	 * Método clave para escoger una imagen desde el dispositivo
	 * @param elegirImagen. este parametro te permitira escoger una imagen
	 */
	
	public void setEscogeImagen(String elegirImagen) {
		 try {
			 
			 archivo = new File(elegirImagen);
			 setIcon(new ImageIcon(ImageIO.read(archivo)));
			 
		 }catch(IOException e) {
			 
			 archivo = null;
			 
			 setIcon(null);
			 
			 
		 }
	}
	
	/**
	 * 
	 * @return Devuelve la ruta de la imagen escogida con el metodo setEscogeImagen
	 * @param No recibe parametro alguno 
	 */
	
	public String getEscogeImagen() {
		
		if (archivo == null) {
			
			return null;
			
		}else {
			
			return archivo.getPath();
			
		}
	}
	
	public Dimension getPreferredSize() {
		
		return new Dimension(600, 400);
		
	}
	private File archivo = null;
	
	/**
	 * 
	 * El tamaño maximo en megas
	 * 
	 */
	public static int pruebaConstante = 5;

}
