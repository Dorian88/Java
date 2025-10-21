import javax.swing.*;

public class C10UsandoBucleWhileAcceso_Aplicacion {

	public static void main(String[] args) {
		
		String clave = "Alexander", pass = "";
		
		while(clave.equals(pass) == false) {
			pass = JOptionPane.showInputDialog("Por favor introduce la contraseña.");
			
			if (clave.equals(pass) == false) {
				System.out.println("Contraseña Incorrecta.");
			}
		}
		
		System.out.println("Contraseña correcta. Acceso permitido");
	}

}
