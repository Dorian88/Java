package primerospasos;

import java.util.*;

public class Uso_empleado {

    public static void main(String[] args) {
        
        Empleado []misEmpleados = new Empleado[3];
        
        /*Empleado empleado1 = new Empleado("Dorian Jaramillo", 2500000, 2010, 9, 23);
        Empleado empleado2 = new Empleado("Diana Betancur", 2400000, 2012, 12, 11);
        Empleado empleado3 = new Empleado("Javier Restrepo", 1600000, 2008, 1, 31);
        
        empleado1.subirSueldo(5);
        empleado2.subirSueldo(5);
        empleado3.subirSueldo(5);
        
        System.out.println("Nombre: " + empleado1.nombre() + " Sueldo: " + empleado1.sueldo() + " Fecha de Contrato: " + empleado1.contrato());
        System.out.println("Nombre: " + empleado2.nombre() + " Sueldo: " + empleado2.sueldo() + " Fecha de Contrato: " + empleado2.contrato());
        System.out.println("Nombre: " + empleado3.nombre() + " Sueldo: " + empleado3.sueldo() + " Fecha de Contrato: " + empleado3.contrato());*/
        
        misEmpleados[0] = new Empleado("Dorian Jaramillo", 2500000, 2010, 9, 23);
        misEmpleados[1] = new Empleado("Diana Betancur", 2400000, 2012, 12, 11);
        misEmpleados[2] = new Empleado("Javier Restrepo", 1600000, 2008, 1, 31);
        
        for(int i = 0; i<misEmpleados.length; i++){
            misEmpleados[i].subirSueldo(5);
        }
        
        for(int j = 0; j<misEmpleados.length; j++){
            System.out.println("Nombre: " + misEmpleados[j].nombre() + " Sueldo: " + misEmpleados[j].sueldo() + " Fecha de Contrato: " + misEmpleados[j].contrato());
        }
    }
}

class Empleado{
    private String nombre;
    private double sueldo;
    private Date altaContrato;
    
    public Empleado(String nom, double sue, int anio, int mes, int dia){
        nombre = nom;
        sueldo = sue;
        GregorianCalendar fecha = new GregorianCalendar(anio, mes-1, dia);
        altaContrato = fecha.getTime();
    }
    
    //Metodos Getter
    public String nombre(){
        
        return nombre;
    }
    
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
    
}