import javax.swing.*;

public class C070EntradaJOptionPaneEjemplo2 {

	public static void main(String[] args) {
		String Nombre_Usuario = JOptionPane.showInputDialog("Introduce tu nombre");
		String edad = JOptionPane.showInputDialog("Introduce tu edad");
		int edad_usuario = Integer.parseInt(edad);
		
		System.out.println("Hola " + Nombre_Usuario + ". Tienes " + edad + " años.");
		System.out.println("Y el año que viene tendrás " + (edad_usuario +1) + " años.\n");

	}

}
