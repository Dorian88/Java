import java.util.*;

public class C18UsoTallas {
	
	//enum talla {Pequeño, Mediano, Grande, Muy_Grande};
	
	enum Talla{
		
		PEQUEÑO("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
		private Talla(String abreviatura) {
			this.abreviatura = abreviatura;
		}
		
		public String dameAbreviatura() {
			
			return abreviatura;
		}
		
		private String abreviatura;
	}

	public static void main(String[] args) {
		
		/*talla s = talla.Pequeño;
		talla m = talla.Mediano;
		talla l = talla.Grande;
		talla l = talla.Grande;
		talla xl = talla.Muy_Grande;*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe una talla: PEQUEÑO, MEDIANO, GRANDE, MUY_GRANDE");
		
		String entradaDatos = entrada.next().toUpperCase();
		
		Talla laTalla = Enum.valueOf(Talla.class, entradaDatos);
		
		System.out.println("Talla = " + laTalla);
		System.out.println("Abreviatura = " + laTalla.dameAbreviatura());
	}

}
