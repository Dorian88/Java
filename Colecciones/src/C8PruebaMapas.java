import java.util.*;

public class C8PruebaMapas {

	public static void main(String[] args) {
		
		HashMap<String, Empleado> personal = new HashMap<String, Empleado>();
		
		personal.put("145", new Empleado("Dorian"));
		personal.put("146", new Empleado("Diana"));
		personal.put("147", new Empleado("Alexander"));
		personal.put("148", new Empleado("Francisco"));
		personal.put("149", new Empleado("Luisa"));
		
		System.out.println(personal);
		
		System.out.println("Se borra el elemento con llave 148");
		personal.remove("148");
		
		System.out.println(personal);
		
		System.out.println("Se sustituye el elemento con llave 147");
		personal.put("147", new Empleado("Camilo"));
		
		System.out.println(personal);
		
		System.out.println(personal.entrySet());
		
		for (Map.Entry<String, Empleado> entrada: personal.entrySet()) {
			
			String clave = entrada.getKey();
			Empleado valor = entrada.getValue();
			
			System.out.println("Clave: " + clave + ", valor: " + valor);
		}

	}

}

class Empleado{
	
	public Empleado(String n) {
		
		nombre = n;
		sueldo = 2000;
	}
	
	public String toString() {
		
		return "[Nombre: " + nombre + ", sueldo: " + sueldo + "]";
		
	}
	
	private String nombre;
	private double sueldo;
	
}