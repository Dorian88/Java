package POO;

import primerospasos.*;

public class Carro {
    private int llantas, largo, ancho, motor, peso_plataforma, peso_total;
    private String color;
    private boolean asientoCuero, climatizador;
    
    //Método constructor
    public Carro(){
        llantas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_plataforma = 500;
    }
    
    //Método Getter
    public String datosGenerales(){
        String leyenda1, leyenda2, leyenda3, leyenda4, leyenda5;
        leyenda1 = "La plataforma del vehículo tiene ";
        leyenda2 = " lantas. mide ";
        leyenda3 = " metros de largo, con un ancho de ";
        leyenda4 = " cm y un peso de plataforma de ";
        leyenda5 = " Kg";
        return leyenda1 + llantas + leyenda2 + largo/1000 + leyenda3 + ancho + leyenda4 + peso_plataforma + leyenda5;
    }
    
    public String mostrarColor(){
        return "El color del carro es: " + color;
    }
    
    public String confirmaAsiento(){
        if (asientoCuero == true){
            return "El Carro tiene asientos de cuero";
        }else{
            return "El Carro tiene asientos de serie";
        }
    }
    
    public String mostrarClimatizador(){
        if (climatizador == true){
            return "El Carro incorpora climatizador";
        }else{
            return "El Carro tiene aire acondicionado";
        }
    }
    
    public int precioCarro(){
        int precioFinal = 10000;
        if(asientoCuero == true){
            precioFinal += 2000;
        }
        if(climatizador == true){
            precioFinal += 1500;
        }
        return precioFinal;
    }
    
    //Métodos Setter
    public void color(String colorCarro){
        color = colorCarro;
    }
    
    public void asiento(String asiento_cuero){
        if(asiento_cuero == "si"){
            asientoCuero = true;
        }else{
            asientoCuero = false;
        }
    }
    
    public void configura_climatizador(String clima){
        if (clima == "si"){
            climatizador = true;
        }else{
            climatizador = false;
        }
    }
    
    //Otros Métodos
    public String pesoTotalCarro(){
        int pesoCarroceria = 500;
        peso_total = peso_plataforma + pesoCarroceria;
        
        if (asientoCuero == true){
            peso_total = peso_total + 50;
        }
        if (climatizador == true){
            peso_total = peso_total + 20;
        }
        
        return "El peso del carro es " + peso_total;
    }
}