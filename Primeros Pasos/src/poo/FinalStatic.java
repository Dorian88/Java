package poo;

public class FinalStatic {

	public static void main(String[] args) {
		
		Empleados trabajador1 = new Empleados("Edwin");
		Empleados trabajador2 = new Empleados("Sara");
		Empleados trabajador3 = new Empleados("Santiago");
		Empleados trabajador4 = new Empleados("Sandra");
		
		trabajador1.cambiaSeccion("RRHH");
		
		System.out.println(trabajador1.devuelveDatos() + "\n" + trabajador2.devuelveDatos() + "\n" + trabajador3.devuelveDatos() + "\n" + trabajador4.devuelveDatos());
		
		System.out.println(Empleados.dameIdSiguiente());

	}

}

class Empleados{
	
	public Empleados(String nom) {
		nombre = nom;
		seccion = "Administracion";
		id = idSiguiente;
		idSiguiente++;
	}
	
	//Método Setter
	public void cambiaSeccion(String seccion) {
		
		this.seccion = seccion;
	}
	
	//Método Getter
	
	public String devuelveDatos() {
		
		return "El nombre es: " + nombre + ",  la sección es " + seccion + " y el id es " + id;
	}
	
	public static String dameIdSiguiente() {
		
		return "El id siguiente es: " + idSiguiente;
	}
	
	private final String nombre;
	private String seccion;
	private int id;
	private static int idSiguiente = 1;
}