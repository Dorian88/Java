package Introspeccion;

public class I1UsoEmpleado {

	public static void main(String[] args) {
		
		Persona Dorian = new Persona("Dorian");
		Empleado Diana = new Empleado("Diana", 35000);
		Class cl1 = Dorian.getClass();
		Class cl2;
		String nombreClase = "Introspeccion.Empleado";
				
		System.out.println(Dorian.getNombre());
		System.out.println(Diana.getNombre());
		System.out.println(Diana.getSalario() + "\n");
		
		//System.out.println(Dorian.getClass());
		//System.out.println(cl1.getName());
		
		try {
			
			cl2 = Class.forName(nombreClase);
			
			System.out.println(cl2.getName());
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		
		}

	}

}

class Persona{
	
	public Persona(String nombre) {
		
		this.nombre = nombre;
	}
	
	public String getNombre() {
		
		return nombre;
		
	}
	
	private String nombre;

}

class Empleado extends Persona{

	public Empleado(String nombre, double salario) {
		
		super(nombre);
		
		this.salario = salario;
	}
	
	public void incentivo(double incentivo) {
		
		salario = salario + incentivo;
		
	}
	
	public String getSalario() {
		
		return "El salario es: " + salario;
		
	}
	
	private double salario;
}