
public class C03UsoConstantesOperadores {

	public static void main(String[] args) {
		int a = 5;
		
		int b;
		
		b = 7;
		
		System.out.println("a = 5 y b = 7");
		System.out.println("Opreador +");
		int c = a + b;
		
		System.out.print("El valor de c = a + b es igual a: ");
		System.out.println(c);
		System.out.println("");
		
		System.out.println("Opreador Incremento ++");
		c++;
		
		System.out.print("El valor de c++: ");
		System.out.println(c);
		System.out.println("");
		
		System.out.println("Opreador decremento --");
		c--;
		
		System.out.print("El valor de c-- es igual a: ");
		System.out.println(c);
		System.out.println("");
		
		System.out.println("Opreador -");
		c = a - b;
		
		System.out.print("El valor de c = a - b es igual a: ");
		System.out.println(c);
		System.out.println("");
		
		System.out.println("Opreador *");
		c = a * b;
		
		System.out.print("El valor de c = a * b es igual a: ");
		System.out.println(c);
		System.out.println("");
		
		System.out.println("Opreador / usando el tipo de variable float");
		float d = b / a;
		
		System.out.print("El valor de d = b / a es igual a: ");
		System.out.println(d);
		System.out.println("");
		
		System.out.println("Uso de Constantes.");
		
		final int e = 7;
		
		System.out.print("El valor de la constante e es: ");
		System.out.println(e);
		System.out.println("");
		
		System.out.println("****************************************************************");
		System.out.println("Ejercicio: Convertir pulgadas a cm usando constantes y variables");
		System.out.println("");
		
		final double apulgadas = 2.64;
		double cm = 6;
		
		double resultado = cm / apulgadas;
		
		System.out.println("En " + cm + " cm hay " + resultado + " pulgadas");

	}

}
