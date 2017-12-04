/*
 * Newton
 * 
 */
package app1;

/**
 *
 * @author Dorian
 */
public class App1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x1, x2, f, df1, df2;
        
        x1 = 2.3264;
        df1 = 4-3.6*x1+3.6*Math.pow(x1, 2)-1.2*Math.pow(x1, 3);
        df1 = Math.rint(df1*10000)/10000;
        System.out.println("df1 = " + df1);
        df2 = -3.6+7.2*x1-3.6*Math.pow(x1, 2);
        df2 = Math.rint(df2*10000)/10000;
        System.out.println("df2 = " + df2);
        f = 4*x1-1.8*Math.pow(x1, 2)+1.2*Math.pow(x1, 3)-0.3*Math.pow(x1, 4);
        f = Math.rint(f*10000)/10000;
        System.out.println("f = " + f);
        x2 = x1 - (df1/df2);
        x2 = Math.rint(x2*10000)/10000;
        System.out.println("x2 = " + x2);
        
    }
    
}
