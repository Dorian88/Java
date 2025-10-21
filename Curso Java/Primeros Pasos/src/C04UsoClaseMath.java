
public class C04UsoClaseMath {

	public static void main(String[] args) {
		double raiz, num1, num2, base, exp;
		int res;
		
		num1 = 9;
		num2 = 5.86;
		base = 5;
		exp = 3;
		
		System.out.println("Calculando raices (Método sqrt) usando la Clase Math");
		raiz = Math.sqrt(num1);
		System.out.println("La raiz de " + num1 + " es " + raiz);
		System.out.print("\n");
		
		System.out.println("Redondeando numeros  usando el método round la Clase Math");
		res = (int)Math.round(num2); //Hace un casting a la variabel 
		System.out.println("El número redondeado de " + num2 + " es " + res);
		System.out.print("\n");
		
		System.out.println("Calculando la potenciación (Método pow) usando la Clase Math");
		res = (int)Math.pow(base, exp);
		System.out.println( "El resultado " + base + " elevado a " + exp + " es " + res);
		System.out.print("\n");

	}

}
