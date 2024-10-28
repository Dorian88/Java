import javax.swing.*;

public class C14FactorialBucleFor {

	public static void main(String[] args) {
		
		int res = 1, num;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero."));
		
		for(int i = num; i > 0; i--) {
			res = res*i;
		}
		
		System.out.println("El factorial de " + num + " es: " + res);

	}

}
