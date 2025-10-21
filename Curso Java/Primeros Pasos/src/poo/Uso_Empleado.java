package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		
		Jefatura jefeRRHH = new Jefatura("Dorian", 55000, 2024, 2, 5);
		Empleado []misEmpleados = new Empleado[6];
		
		misEmpleados[0] = new Empleado("Andres", 75000, 2024, 3, 29);
		misEmpleados[1] = new Empleado("Alexander", 80000, 2024, 6, 5);
		misEmpleados[2] = new Empleado("Lucia", 85000, 2024, 7, 29);
		misEmpleados[3] = new Empleado("Ana");
		misEmpleados[4] = jefeRRHH; //Poliformismo. Principio de sustitucion.
		misEmpleados[5] = new Jefatura ("Maria", 95000, 1999, 5, 26);
		
		Jefatura jefeFinanzas = (Jefatura) misEmpleados[5];
		
		jefeRRHH.estableceIncentivo(2570);
		jefeFinanzas.estableceIncentivo(55000);
		
		/*Empleado directorComercial = new Jefatura("Sandra", 85000, 2012, 05, 05);
		Comparable ejemplo = new Empleado ("Elizabeth", 95000, 2011, 06, 07);
		
		if (directorComercial instanceof Empleado) {
			System.out.println("directorComercial es de tipo Jefatura");
		}
		
		if (ejemplo instanceof Comparable) {
			System.out.println("ejemplo es de tipo Comparable\n");
		}*/
		
		System.out.println(jefeFinanzas.tomarDecisiones("Dar más días de vacaciones a los empleados"));
		System.out.println("El jefe " + jefeFinanzas.dameNombre() + " tiene un bonus de: " + jefeFinanzas.estableceBonus(500));
		System.out.println(misEmpleados[3].dameNombre() + " tiene un bonus de: " + misEmpleados[3].estableceBonus(200) + "\n");
		
		for(Empleado e : misEmpleados) {
			e.subeSueldo(5);
		}
		
		Arrays.sort(misEmpleados);
		
		for(Empleado e : misEmpleados) {
			System.out.println("Nombre: " + e.dameNombre() + ". Sueldo: " + e.dameSueldo() + ". Fecha de alta:" + e.dameFechaContrato());
		}
	}

}

class Empleado implements Comparable, Trabajadores{
	
	public Empleado(String nom, double sue, int anio, int mes, int dia) {
		nombre = nom;		
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);
		altaContrato = calendario.getTime();
		++idSiguiente;
		id = idSiguiente;
	}
	
	public Empleado(String nom) {
		this(nom, 30000, 2000, 01, 01);
	}
	
	public double estableceBonus (double gratificacion) {
		return Trabajadores.bonusBase + gratificacion;
	}
	
	public String dameDescripcion() {
		
		return "Este empleado tiene un Id = " + id + " con un sueldo = " + sueldo;
	}
	
	//Métodos Getters
	public String dameNombre() {
		return nombre + " ID: " + id;
	}
	
	public double dameSueldo() {
		return sueldo;
	}
	
	public Date dameFechaContrato() {
		return altaContrato;
	}
	
	//Métodos Setter
	public void subeSueldo(double porcentaje) {
		double aumento = sueldo*porcentaje/100;
		sueldo += aumento;
	}
	
	public int compareTo(Object miObjeto) {
		
		Empleado otroEmpleado = (Empleado) miObjeto;
		
		if (this.id < otroEmpleado.id) {
			return -1;
		}
		
		if (this.id > otroEmpleado.id) {
			return 1;
		}
		
		return 0;
	}
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private static int idSiguiente;
	private int id;
}

class Jefatura extends Empleado implements Jefes{
	
	public Jefatura(String nom, double sue, int anio, int mes, int dia) {
		super(nom, sue, anio, mes, dia);
	}
	
	public String tomarDecisiones(String decision) {
		return "Un miembro de la direccion ha tomado la decision de: " + decision;
	}
	
	public double estableceBonus (double gratificacion) {
		double prima = 2000;
		
		return Trabajadores.bonusBase + gratificacion + prima;
	}
	
	//Método Setter
	public void estableceIncentivo(double b) {
		incentivo = b;
	}
	
	//Método Getter
	public double dameSueldo() {
		double sueldoJefe = super.dameSueldo();
		
		return sueldoJefe + incentivo;
	}
	
	private double incentivo;
}