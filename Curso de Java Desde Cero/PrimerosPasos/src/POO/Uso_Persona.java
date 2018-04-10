package POO;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

    public static void main(String[] args) {
        persona [] lasPersonas = new persona[2];
        
        lasPersonas[0]= new Empleado1("Dorian Jaramillo", 1600000, 2018, 01, 23);
        lasPersonas[1]= new Alumno("Camila Arango", "Ing. Quimica");
        
        for(persona p:lasPersonas){
            System.out.println(p.nombre() + ", " + p.descripcion());
        }
    }
    
}

class Empleado1 extends persona{
    private double sueldo;
    private Date altaContrato;
    private static int IdSiguiente;
    private int id;
    
    //Constructor
    public Empleado1(String nom, double sue, int anio, int mes, int dia){
        super(nom);
        sueldo = sue;
        GregorianCalendar fecha = new GregorianCalendar(anio, mes-1, dia);
        altaContrato = fecha.getTime();
        ++IdSiguiente;
        id = IdSiguiente;
    }
    
    //Metodos Getter
    public double sueldo(){
        
        return sueldo;
    }
    
    public Date contrato(){
        
        return altaContrato;
    }
    
    //Metodos Setter
    public void subirSueldo(double porcentaje){
        double aumento = sueldo*porcentaje/100;
        sueldo += aumento;
    }
    
    public String descripcion(){
        return "Este empleado tiene in id = " + id + " con un sueldo de: " + sueldo;
    }
    
}

abstract class persona{
    private String nombre;
    
    public persona(String nom){
        nombre = nom;
    }
    
    public String nombre(){
        
        return nombre;
    }
    
    public abstract String descripcion();
}

class Alumno extends persona{
    private String carrera;
    
    public Alumno(String nom, String car){
        super (nom);
        carrera = car;
    }
    
    public String descripcion(){
        return "Este Alumno esta estudiando la carrera de " + carrera;
    }
}