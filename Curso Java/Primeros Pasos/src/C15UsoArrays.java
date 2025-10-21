import javax.swing.*;

public class C15UsoArrays {

	public static void main(String[] args) {
		
		int [] matriz1 = new int [5];
		int [] matriz2 = {30, -21, 4, 6, 78, 5, 38, -15, 92, 71};
		
		String [] paises = new String [8];
		int [] aleatorios = new int [150];
		
		paises [0]= "Colombia";
		paises [1]= "Venezuela";
		paises [2]= "Brasil";
		paises [3]= "Ecuador";
		paises [4]= "Perú";
		paises [5]= "Bolivia";
		paises [6]= "Argentina";
		paises [7]= "Uruguay";
		
		matriz1[0] = 5;
		matriz1[1] = 38;
		matriz1[2] = -15;
		matriz1[3] = 92;
		matriz1[4] = 71;
		
		System.out.println("Primera forma de imprimir un array sin usar un bucle: repetir la instruccion System.out.println"
				+ " las veces que sea necesaria.");
		System.out.println(matriz1[0]);
		System.out.println(matriz1[1]);
		System.out.println(matriz1[2]);
		System.out.println(matriz1[3]);
		System.out.println(matriz1[4]);
		System.out.println("\n");
		
		System.out.println("Segunda forma de imprimir un array usando un bucle: el Bucle for.");
		
		for(int i = 0; i < 5; i++) {
			System.out.println(matriz1[i]);
		}
		
		for(int i = 0; i < matriz2.length; i++) {
			System.out.println(matriz2[i]);
		}
		
		
		for(int k = 0; k < 8; k++) {
			paises[k] = JOptionPane.showInputDialog("Introduce un país. " + (k+1));
		}
		
		System.out.println("Recorriendo el array usando bucle foreach.");
		
		int j = 0;
		
		for(String elemento:paises) {
			j++;
			System.out.println(j + ". " + elemento);
		}
		
		System.out.println("Llenando un array aleatoriamente con numeros.");
		
		for(int i = 0; i < aleatorios.length; i++) {
			aleatorios[i] = (int)Math.round(Math.random()*100);
		}
		
		for(int numeros:aleatorios) {
			System.out.print(numeros + " ");
		}

	}

}
