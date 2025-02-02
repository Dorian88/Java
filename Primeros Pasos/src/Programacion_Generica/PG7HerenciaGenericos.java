package Programacion_Generica;

public class PG7HerenciaGenericos {

	public static void main(String[] args) {
		
		//Caso herencia convencional
		/*PG6Empleado administrativa = new PG6Empleado("Diana", 35, 1500);
		PG9Jefe directoraComercial = new PG9Jefe("Luisa", 37, 3500);
		PG6Empleado nuevoEmpleado = directoraComercial;*/
		
		//Herencia generica.
		PG8Pareja<PG6Empleado> administrativa = new PG8Pareja<PG6Empleado>();
		PG8Pareja<PG9Jefe> directoraComercial = new PG8Pareja<PG9Jefe>();
		//PG8Pareja<PG6Empleado> nuevoEmpleado = directoraComercial;
		PG8Pareja.imprimirTrabajador(administrativa);
		PG8Pareja.imprimirTrabajador(directoraComercial);

	}

}
