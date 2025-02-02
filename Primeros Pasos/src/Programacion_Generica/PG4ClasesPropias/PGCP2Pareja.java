package Programacion_Generica.PG4ClasesPropias;

public class PGCP2Pareja<T> {
	
	public PGCP2Pareja() {
		
		primero = null;
	}
	
	public void setPrimero(T nuevoValor) {
		
		primero = nuevoValor;
		
	}
	
	public T getPrimero() {
		
		return primero;
		
	}
	
	private T primero;

}
