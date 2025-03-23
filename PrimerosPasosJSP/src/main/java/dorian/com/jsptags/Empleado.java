package dorian.com.jsptags;

public class Empleado {
	
	private String nombre, apellido, puesto;
	private double salario;
	
	//Constructor
	public Empleado(String nombre, String apellido, String puesto, double salario) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.puesto = puesto;
		this.salario = salario;
	}
	
	//Metodos Getters

	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public String getPuesto() {
		return puesto;
	}
	
	public double getSalario() {
		return salario;
	}
	
	//Metodos Setters

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
