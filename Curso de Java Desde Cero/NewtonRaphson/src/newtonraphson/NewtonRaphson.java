/*
 * Algoritmo para aplicar el médoto de Newton Raphson
 *
 */
package newtonraphson;

public class NewtonRaphson {
    
    public static double f(double x){
        return(x-Math.sin(x));
    }
    
    public static double g(double x){
        return(1-Math.cos(x));
    }
    
    public static double newtonRaphson(){
        int iter = 0;
        boolean t_continue = true;
        double x0 = 0.1, x1 = 0.1;
        
        while(t_continue && iter < 1000){
            x1 = x0 - (f(x0)/g(x0));
            iter++;
            if (f(x1) < 0.0001){
                t_continue = false;
                System.out.println("La raíz es: " + x1);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        newtonRaphson();
    }
}
