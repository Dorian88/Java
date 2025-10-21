package Excepciones;

public class E8OperacionesDebugging {

	public static void main(String[] args) {
		
		E8_1Suma operacion1 = new E8_1Suma();
		E8_2Resta operacion2 = new E8_2Resta();
		E8_3Multiplicacion operacion3 = new E8_3Multiplicacion();
		E8_4Division operacion4 = new E8_4Division();
		
		System.out.println(operacion1.calculo(7, 8));
		System.out.println(operacion2.calculo(7, 8));
		System.out.println(operacion3.calculo(7, 8));
		System.out.println(operacion4.calculo(7, 8));

	}

}
