
public class C05UsandoCadenasDeCaracteres {

	public static void main(String[] args) {
		String nombre = "Dorian", cadena1, cadena2, cadena3, cadena4;
		String frase = "Hay tres tipos de mentiras: las mentiras, la malditas mentiras y la estadística";
		String fraseResumen = frase.substring(28, 79);
		
		cadena1 = "Mentira";
		cadena2 = "Mentira";
		cadena3 = "Verdad";
		cadena4 = "verdad";
		
		System.out.println("La frase es: " + frase + ".\n");
		System.out.println("La cadena 1 es: " + cadena1 + ". \nLa cadena 2 es: " + cadena2 + ". \nLa cadena 3 es: " + cadena3 + ". \nLa cadena 4 es: " + cadena4 +".\n");

		System.out.println("Manipulando cadenas de caracteres con la clase String \n");
		System.out.println("Mi nombre es: " + nombre);
		System.out.println("Longitud de la cadena de caracteres con el mÃ©todo length ");
		System.out.println("Tiene: " + nombre.length() + " caracteres.");
		System.out.print("\n");
		
		System.out.println("Extrayendo caracteres de la cadena con el mÃ©todo sharAt ");
		System.out.println("La primera letra de mi nombre es: " + nombre.charAt(0) + ".");
		System.out.println("La última letra de mi nombre es: " + nombre.charAt(nombre.length() - 1) + ".");
		System.out.print("\n");
		
		System.out.println("Otros usos de la clase String \n");
		System.out.println("Extrayendo partes de la cadena de caracteres con el metodo substring ");
		System.out.println(fraseResumen);
		System.out.print("\n");
		
		System.out.println("modificando la cadena de caracteres con el metodo substring ");
		System.out.println(fraseResumen + " son " + frase.substring(4, 26));
		System.out.print("\n");
		
		System.out.println("Comparando cadenas de caracteres usando el metodo equals");
		System.out.println("Comparando cadena 1 con cadena 2");
		System.out.println(cadena1.equals(cadena2));
		System.out.println("Comparando cadena 1 con cadena 3");
		System.out.println(cadena1.equals(cadena3));
		System.out.println("Comparando cadena 2 con cadena 3");
		System.out.println(cadena2.equals(cadena3));
		System.out.print("\n");
		
		System.out.println("Comparando cadena 3 con cadena 4 usando equalsIgnoreCase");
		System.out.println(cadena3.equalsIgnoreCase(cadena4));
		System.out.print("\n");

	}

}
