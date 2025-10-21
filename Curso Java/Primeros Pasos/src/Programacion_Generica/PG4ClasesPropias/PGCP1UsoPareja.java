package Programacion_Generica.PG4ClasesPropias;

public class PGCP1UsoPareja {

	public static void main(String[] args) {
		
		PGCP2Pareja<String> una = new PGCP2Pareja<String>();
		Persona per1 = new Persona("Diana");
		PGCP2Pareja<Persona> otra  = new PGCP2Pareja<Persona>();
		
		una.setPrimero("Dorian");
		otra.setPrimero(per1);
		
		System.out.println(una.getPrimero());
		System.out.println(otra.getPrimero());

	}

}

class Persona{
	
	public Persona(String nombre) {
		
		this.nombre = nombre;
		
	}
	
	public String toString() {
		
		return nombre;
	}
	
	private String nombre;
	
}