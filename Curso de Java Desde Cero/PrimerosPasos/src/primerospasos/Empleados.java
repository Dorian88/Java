package primerospasos;

public class Empleados {
    
    private final String nombre;
    private String seccion;
    private int id;
    private static int idSiguiente = 1;
    
    public Empleados(String nom){
        
        nombre = nom;
        seccion = "Administracion";
        id = idSiguiente;
        idSiguiente++;
    }
    
    //Métodos Setter
    public void cambioSeccion(String sec){
        this.seccion = sec;
    }
        
    //Métodos Getter
    public String devuelveDatos(){
        return "El nombre es: " + nombre + ". Tiene una identificación de " + id + ". Y la sección es: " + seccion;
    }
    
    public static String proxId(){
        return "El próximo Id es: " + idSiguiente;
    }
}
