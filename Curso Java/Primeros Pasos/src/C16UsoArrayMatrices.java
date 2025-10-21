import java.util.*;

public class C16UsoArrayMatrices {

	public static void main(String[] args) {
		
		Scanner numero = new Scanner(System.in);
		
		int [][] matriz1 = new int[4][5];
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("Ingrese el valor para la posicion [" + i + "][" + j + "]: ");
				matriz1[i][j] = numero.nextInt();
			}
		}
		
		for(int i = 0; i < 4; i++) {
			System.out.println();
			for(int j = 0; j < 5; j++) {
				System.out.print(matriz1[i][j] + " ");
			}
		}
	}

}
