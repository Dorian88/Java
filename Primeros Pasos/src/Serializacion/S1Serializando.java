package Serializacion;

import java.io.*;
import java.util.*;

public class S1Serializando {

	public static void main(String[] args) {
		
		Administrador jefe = new Administrador("Dorian", 80000, 2005, 12, 15);
		Empleado[] personal = new Empleado[3];
		
		jefe.setIncentivo(5000);
		personal[0] = jefe;
		personal[1] = new Empleado("Diana", 25000, 2008, 10, 1);
		personal[2] = new Empleado("Luisa", 18000, 2012, 9, 15);
		
		try {
			
			ObjectOutputStream escribiendoArchivo = new ObjectOutputStream(new FileOutputStream("C:\\Users\\USUARIO\\Documents\\Curso Java\\Primeros Pasos\\src\\Archivos\\Empleado.txt"));
			escribiendoArchivo.writeObject(personal);
			escribiendoArchivo.close();
			
			ObjectInputStream recuperandoArchivo = new ObjectInputStream(new FileInputStream("C:\\Users\\USUARIO\\Documents\\Curso Java\\Primeros Pasos\\src\\Archivos\\Empleado.txt"));
			Empleado[] personalRecuperado = (Empleado[]) recuperandoArchivo.readObject();
			recuperandoArchivo.close();
			
			for(Empleado e: personalRecuperado) {
				
				System.out.println(e);
			}
			
		}catch(Exception e) {
			
		}
		

	}

}

//-------------------------------------------------------------------------------------------------------------------------------------------

class Empleado implements Serializable{
	
	//private static final long serialVersionUID = 1L;
	
	public Empleado(String n, double s, int agno, int mes, int dia) {
		
		nombre = n;
		sueldo = s;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes, dia);
		
		fechaContrato = calendario.getTime();
	}
	
	public String getNombre() {
		
		return nombre;
		
	}
	
	public double getSueldo() {
		
		return sueldo;
		
	}
	
	public Date getFechaContrato() {
		
		return fechaContrato;
		
	}
	
	public void subirSueldo(double porcentaje) {
		
		double aumento = sueldo * porcentaje/100;
		
		sueldo += aumento;
	}
	
	public String toString() {
		
		return "El nombre es: " + nombre + ". Su sueldo es: " + sueldo + ". La fecha de contrato es: " + fechaContrato;
		
	}
	
	private String nombre;
	private double sueldo;
	private Date fechaContrato;
	
}

//-------------------------------------------------------------------------------------------------------------------------------------------

class Administrador extends Empleado{

	private static final long serialVersionUID = 1L;

	public Administrador(String n, double s, int agno, int mes, int dia) {
		
		super(n, s, agno, mes, dia);
		
		incentivo = 0;
	}
	
	public double getSueldo() {
		
		double sueldoBase = super.getSueldo();
		
		return sueldoBase + incentivo;
	}
	
	public void setIncentivo(double b) {
		
		incentivo = b;
		
	}
	
	public String toString() {
		
		return super.toString() + ". Con un incentivo de: " + incentivo;
	}
	
	private double incentivo;
}