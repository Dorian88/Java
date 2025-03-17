package dorian.com.CalculosMatematicos;

public class Calculos {
	
	private static int resultado;
	
	public static int metodoSuma(int num1, int num2){
		
		resultado = num1 + num2;
		
		return resultado;
		
	}
	
	public static int metodoResta(int num1, int num2){
		
		resultado = num1 - num2;
		
		return resultado;
		
	}

	public static int metodoMultiplicar(int num1, int num2){

		resultado = num1 * num2;

		return resultado;

	}

}