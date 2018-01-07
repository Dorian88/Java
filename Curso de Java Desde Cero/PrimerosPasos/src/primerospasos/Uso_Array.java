/*
 * Usando los datos de tipo array
 */
package primerospasos;

import javax.swing.*;
public class Uso_Array {
    
    public void usoArray(){
        //Array unidimesional
        System.out.println("ARRAYS UNIDIMENSIONALES");
        int [] mi_vector = {5, 38, -15,92, 71};
        String [] paises = new String [8];
        int [] aleatorios = new int [150];
        
        for(int i = 0; i < mi_vector.length; i++){
            System.out.println("valor de indice " + i + " es " + mi_vector[i]);
        }
        System.out.println();
        
        for(int i = 0; i < paises.length; i++){
            paises[i] = JOptionPane.showInputDialog("Introduce el nombre de un pais " + (i+1));
        }
        
        //ciclo for each o ciclo for mejorado 
        for (String elemento:paises){
            System.out.println(elemento);
        }
        System.out.println();
        
        for (int k = 0; k < aleatorios.length; k++){
            aleatorios[k] = (int) Math.round(Math.random()*100);
        }
        
        for (int numero:aleatorios){
            System.out.print(numero + " ");
        }
        System.out.println();
        //Array Bidimensional
        System.out.println("ARRAYS BIDIMENSIONALES");
        int [][] matriz = new int [4][5];
        int [][] matriz1 = {
            {10, 15, 18, 19, 21},
            {5, 25, 37, 41, 15},
            {7, 19, 32, 14, 90},
            {85, 2, 7, 40,27},
        };
        
        matriz[0][0]=15;
        matriz[0][1]=21;
        matriz[0][2]=18;
        matriz[0][3]=9;
        matriz[0][4]=15;
        
        matriz[1][0]=10;
        matriz[1][1]=52;
        matriz[1][2]=17;
        matriz[1][3]=19;
        matriz[1][4]=7;
        
        matriz[2][0]=19;
        matriz[2][1]=2;
        matriz[2][2]=19;
        matriz[2][3]=17;
        matriz[2][4]=7;
        
        matriz[3][0]=92;
        matriz[3][1]=13;
        matriz[3][2]=13;
        matriz[3][3]=32;
        matriz[3][4]=41;
        
        for(int i=0; i<4; i++){
            for(int j=0; j<5; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.print("\n");
        }
        
        System.out.print("\n");
        //Usando el foreach
        for (int []fila:matriz1){
            for (int k:fila){
                System.out.print(k + "\t");
            }
            System.out.print("\n");
        }
        
        System.out.println("EJEMPLO USANDO ARRAYS BIDIMENSIONALES");
        
        double acumulado, interes = 0.10;
        double [][] saldo = new double [6][5];
        
        for(int l=0; l<6; l++){
            saldo [l][0] =  10000;
            acumulado = 10000;
            for(int m=1; m<5; m++){
                acumulado = acumulado + (acumulado * interes);
                saldo[l][m] = acumulado;
            }
            interes = interes + 0.01;
        }
        
        for(int n=0; n<6; n++){
            for(int o=0; o<5; o++){
                System.out.printf("%1.2f", saldo[n][o]);
                System.out.print("\t");
            }
            System.out.print("\n");
        }
    }
}