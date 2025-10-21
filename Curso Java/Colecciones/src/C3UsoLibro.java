
public class C3UsoLibro {

	public static void main(String[] args) {
		
		C4Libro libro1 = new C4Libro("P en Java", "Juan", 25);
		C4Libro libro2 = new C4Libro("P en Java", "Juan", 15);
		
		//libro1 = libro2;
		
		if (libro1.equals(libro2)) {
			
			System.out.println("Es el mismo libro");
			System.out.println(libro1.hashCode());
			System.out.println(libro2.hashCode());
			
		}else {
			
			System.out.println("Es no es el mismo libro");
			System.out.println(libro1.hashCode());
			System.out.println(libro2.hashCode());
			
		}

	}

}
