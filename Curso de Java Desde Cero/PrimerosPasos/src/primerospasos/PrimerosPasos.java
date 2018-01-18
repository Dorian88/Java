/*
 * El primer programa
 * Despliega el mensaje Hola Mundo
 */
package primerospasos;

public class PrimerosPasos {

    public static void main(String[] args) {
        /*System.out.println("----------Primer programa: Hola Mundo----------");
        Hola_Mundo holaMundo = new Hola_Mundo();
        holaMundo.hola();
        System.out.print("\n");
        
        System.out.println("----------Manejo de Variables----------");
        Variables var = new Variables();
        var.manejoVariables();
        System.out.print("\n");
        
        System.out.println("----------Manejo de las constantes y operadores----------");
        Constante_operadores consOpe = new Constante_operadores();
        consOpe.constanteOperadores();
        System.out.print("\n");
        
        System.out.println("----------Usando la libreria Math----------");
        Calculos_conMath calMath = new Calculos_conMath();
        calMath.calculoMath();
        System.out.print("\n");
        
        System.out.println("----------Manipulando Cadenas (Clase String)----------");
        Manipulacion_cadenas manCad = new Manipulacion_cadenas();
        manCad.manipulaCadenas();
        System.out.print("\n");
        
        System.out.println("----------Entrada y salida de datos (Scanner)----------");
        Entrada_ejemplo1 cadenas = new Entrada_ejemplo1();
        cadenas.entradaEjemplo1();
        System.out.print("\n");
        
        System.out.println("----------Entrada y salida de datos (JOptionPane)----------");
        Entrada_ejemplo2 cadenas1 = new Entrada_ejemplo2();
        cadenas1.entradaEjemplo2();
        System.out.print("\n");
        
        System.out.println("----------Uso del condicional if/else----------");
        Evalua_edad cond = new Evalua_edad();
        cond.evaluaEdad();
        System.out.print("\n");
        
        System.out.println("----------Uso del condicional switch----------");
        Areas area = new Areas();
        area.area();
        System.out.print("\n");
        
        System.out.println("----------Uso del ciclo while----------");
        Acesso_aplicacion acApp = new Acesso_aplicacion();
        acApp.accesoAplicacion();
        System.out.print("\n");
        
        Adivina_Numero juego = new Adivina_Numero();
        juego.adivinaNumero();
        System.out.print("\n");
        
        System.out.println("----------Uso del ciclo do/while----------");
        Peso_ideal peso = new Peso_ideal();
        peso.pesoIdeal();
        System.out.print("\n");
        
        System.out.println("----------Uso del ciclo for----------");
        Uso_Ciclo_For ejem = new Uso_Ciclo_For();
        ejem.usoFor();
        System.out.print("\n");
        
        Comprobar_Email correo = new Comprobar_Email();
        correo.comprobarEmail();
        System.out.print("\n");
        
        Factorial fac = new Factorial();
        fac.factorial();
        System.out.print("\n");
        
        System.out.println("----------Usando los Arrays----------");
        Uso_Array arreglos = new Uso_Array();
        arreglos.usoArray();
        System.out.print("\n");*/
        
        System.out.println("----------Programación Orientada a Objetos----------");
        Carro miCarro = new Carro();
        System.out.println(miCarro.datosGenerales());
        miCarro.color("Rojo");
        System.out.println(miCarro.mostrarColor());
        miCarro.asiento("no");
        System.out.println(miCarro.confirmaAsiento());
        miCarro.configura_climatizador("no");
        System.out.println(miCarro.mostrarClimatizador());
        System.out.println(miCarro.pesoTotalCarro());
        System.out.println("El precio total del carro es: " + miCarro.precioCarro() + " Euros");
        System.out.print("\n");
    }
    
}
