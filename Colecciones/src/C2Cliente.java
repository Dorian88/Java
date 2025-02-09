import java.util.Objects;

public class C2Cliente {
	
	public C2Cliente(String nombre, String numeroCuenta, double saldo) {
		
		this.nombre = nombre;
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		
	}
	
	//Metodos getters
	public String getNombre() {
		return nombre;
	}
	
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	//Metodos setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public int hashCode() {
		
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroCuenta == null)? 0: numeroCuenta.hashCode());
		return result;
		
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			
			return true;
			
		}
		if (obj == null) {
			
			return false;
		
		}
		if (getClass() != obj.getClass()) {
			
			return false;
		
		}
		
		C2Cliente other = (C2Cliente) obj;
		
		if(numeroCuenta == null) {
			
			if (other.numeroCuenta != null) {
				
				return false;
			
			}
		}
		
		return true;
	}




	private String nombre, numeroCuenta;
	private double saldo;

}
