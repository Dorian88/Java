import javax.swing.*;

public class C13UsoBucleFor {

	public static void main(String[] args) {
		
		String nombre;
		
		nombre = "Dorian";
				
		for(int i = 0; i < 10; i++) {
			System.out.println((i+1)+ ". "+ nombre);
		}
		
		System.out.println("\n");
		
		System.out.println("Ejemplo: evaluar si una dirección de Email es correcto o no. \n");
		
		int arroba = 0;
		boolean punto = false;
		
		String mail = JOptionPane.showInputDialog("Introduce tu email");
		
		for(int j = 0; j < mail.length(); j++) {
			if(mail.charAt(j) == '@') { 
				arroba++;
			}
			
			if(mail.charAt(j) == '@') { 
				punto = true;
			}
		}
		
		if(arroba == 1 && punto == true){
			System.out.println("El email es correcto.");
		}else{
			System.out.println("El email NO es correcto.");
		}

	}

}
