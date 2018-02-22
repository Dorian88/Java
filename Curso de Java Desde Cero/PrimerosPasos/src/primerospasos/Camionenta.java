package primerospasos;

public class Camionenta extends Carro{
    private int capCarga, asientosExtras;
    
    //Constructor
    public Camionenta(int capCarga, int asientosExtras){
        super(); //Llama el constructor de la clase padre
        this.capCarga = capCarga;
        this.asientosExtras = asientosExtras;
    }
    
    public String estadoCamioneta(){
        return "La capacidad de carga es: " + capCarga + ". Y los asientos son: " + asientosExtras;
    }
}
