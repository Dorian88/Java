/*
 * Interpolacion
 * 
 */
package app;

/**
 *
 * @author Dorian
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x0, x1, x2, x3, fx0, fx1, fx2, fx3;
        
        x0 = 2.3112;
        x1 = 2.3275;
        x2 = 2.3340;
        fx0 = 4*x0-1.8*Math.pow(x0, 2)+1.2*Math.pow(x0, 3)-0.3*Math.pow(x0, 4);
        fx0 = Math.rint(fx0*10000)/10000;
        System.out.println("fx0 = " + fx0);
        fx1 = 4*x1-1.8*Math.pow(x1, 2)+1.2*Math.pow(x1, 3)-0.3*Math.pow(x1, 4);
        fx1 = Math.rint(fx1*10000)/10000;
        System.out.println("fx1 = " + fx1);
        fx2 = 4*x2-1.8*Math.pow(x2, 2)+1.2*Math.pow(x2, 3)-0.3*Math.pow(x2, 4);
        fx2 = Math.rint(fx2*10000)/10000;
        System.out.println("fx2 = " + fx2);
        x3 = (fx0*(Math.pow(x1, 2)-Math.pow(x2, 2))+fx1*(Math.pow(x2, 2)-Math.pow(x0, 2))+fx2*(Math.pow(x0, 2)-Math.pow(x1, 2)))/(2*fx0*(x1-x2)+2*fx1*(x2-x0)+2*fx2*(x0-x1));
        x3 = Math.rint(x3*10000)/10000;
        System.out.println("x3 = " + x3);
        fx3 = 4*x3-1.8*Math.pow(x3, 2)+1.2*Math.pow(x3, 3)-0.3*Math.pow(x3, 4);
        fx3 = Math.rint(fx3*10000)/10000;
        System.out.println("fx3 = " + fx3);
    }
    
}
