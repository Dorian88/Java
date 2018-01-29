package primerospasos;

public class Empleados {
    
    private final String nombre;
    private String seccion;
    
    public Empleados(String nom){
        
        nombre = nom;
        seccion = "Administracion";
    }
    
    //Métodos Setter
    public void cambioSeccion(String sec){
        this.seccion = sec;
    }
        
    //Métodos Getter
    public String devuelveDatos(){
        return "El nombre es: " + nombre + ". Y la sección es: " + seccion;
    }
}
