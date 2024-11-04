import javax.swing.JOptionPane;

public class C071EntradaNumerosEjemplo3 {
	
	public static void main(String[] args) {
		
		String num1 =JOptionPane.showInputDialog("Introduce un número");
		double num2 = Double.parseDouble(num1);
		
		System.out.print("La raiz de " + num2 + " es ");
		System.out.printf("%1.2f ", Math.sqrt(num2));
		System.out.print("\n");

	}
}
