/*
 * Manipulacion de la clase String
 * 
 */
package primerospasos;

public class Manipulacion_cadenas {

    public void manipulaCadenas() {
        String nombre = "Dorian";
        String frase = "Hoy es un dia muy frio";
        
        System.out.println("Mi nombre es " + nombre);
        
        System.out.println("\nUSANDO ALGUNOS METODOS DE LA CLASE STRING\n");
        System.out.println("EL METODO LENGTH (CALCULA LA LONGITUD DEL STRING)");
        System.out.println("Mi nombre tiene " + nombre.length() + " caracteres");
                
        System.out.println("EL METODO CHARAT (DEVUELVE LA POSICION DE UN CARACTER DENTRO DEL STRING)");
        System.out.println("La primera letra de mi nombre es la " + nombre.charAt(0));
                
        System.out.println("PARA AVERIGUAR LA ULTIMA LETRA DE UNA CADENA SIN IMPORTAR CUAL ES, SE USA LOS METODOS ANTERIORES");
        int ultimaLetra;
        ultimaLetra = nombre.length();
        System.out.println("La ultima letra de mi nombre es la " + nombre.charAt(ultimaLetra-1));
        
        System.out.println("EL METODO SUBSTRING (DEVUELVE UN DETERMINADO NUMERO DE CARACTERES DE UNA CADENA)");
        String fraseResumen = frase.substring(10, 22);
        System.out.println(fraseResumen);
        
        System.out.println("EL METODO EQUALS (COMPARA CADENAS DE CARACTERES)");
        String alumno1, alumno2;
        alumno1 = "Diana";
        alumno2 = "diana";
        System.out.println(alumno1.equalsIgnoreCase(alumno2));
        System.out.println(alumno1.equals(nombre));
        
    }
    
}
