import java.util.Objects;

public class C4Libro {
	
	public C4Libro (String titulo, String autor, int isbn) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
	}
	
	public String getDatos() {
		
		return "El titulo es: " + titulo + ". El autor es: " +  autor + ". Y el ISBN es: " + isbn + "." ;
	}
	
	/*public boolean equals(Object obj) {
		
		if(obj instanceof C4Libro) {
			
			C4Libro otro = (C4Libro) obj;
			
			if(this.isbn == otro.isbn) {
				
				return true;
			}else {
				
				return false;
			}
		}else {
			
			return false;
			
		}
	}*/
	
	public int hashCode() {
		
		final int prime = 31;
		int result = 1;
		result = prime * result + isbn;
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

		return true;
	}
	
	private String titulo, autor;
	private int isbn;

}
