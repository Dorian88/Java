import javax.swing.*;

public class C12EjemploPesoIdealDoWhile {

	public static void main(String[] args) {
		
		String genero = "";
		int altura, peso_ideal = 0;
		
		
		do {
			genero = JOptionPane.showInputDialog("Introduce tu genero (H/M)");
			
		}while(genero.equalsIgnoreCase("H" ) == false && genero.equalsIgnoreCase("M") == false);
		
		altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));
		
		if(genero.equalsIgnoreCase("H")) {
			peso_ideal = altura - 110;
		}else if(genero.equalsIgnoreCase("M")) {
			peso_ideal = altura - 120;
		}
		
		System.out.println("Tu peso es ideal es: " + peso_ideal + " Kg");

	}

}
