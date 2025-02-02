package Programacion_Generica;

public class PG8Pareja <T>{
	
	public PG8Pareja() {
		
		primero = null;
	}
	
	public void setPrimero(T nuevoValor) {
		
		primero = nuevoValor;
		
	}
	
	public static void imprimirTrabajador(PG8Pareja<? extends PG6Empleado> p) {
		
		PG6Empleado primero = p.getPrimero();
		
		System.out.println(primero);
	}
	
	public T getPrimero() {
		
		return primero;
		
	}
	
	private T primero;
}
