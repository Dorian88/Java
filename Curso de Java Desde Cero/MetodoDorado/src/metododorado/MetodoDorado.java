/*
 * Algoritmo de la sección de la búsqueda dorada
 */
package metododorado;

public class MetodoDorado {
    
    public static double funcion(double x){
        double fun;
        
        fun = 2+Math.sin(x)-(Math.pow(x, 2)/10);
        fun = redondeo(fun);
        return fun;
    }
    
    public static double redondeo(double red){
        double redondear;
        redondear = Math.rint(red*10000)/10000;
        return redondear;
    }

    public static void main(String[] args) {
        double xl, xu, x1, x2, fl, fu, f1, f2, d, R;
        int i = 0;
        
        R = redondeo((Math.sqrt(5)-1)/2);
                
        xl = 0;
        xu = 4;
        
        System.out.println("i" + "\t" + "xl" + "\t" + "fl" + "\t" + "x2" + "\t" + "f2" +
                             "\t" + "x1" + "\t" + "f1" + "\t" + "xu" + "\t" + "fu" +
                             "\t" + "d");
        
        do{
            d = redondeo(R*(xu - xl));
            x1 = redondeo(xl + d);
            x2 = redondeo(xu - d);
            
            fu = redondeo(funcion(xu));
            fl = redondeo(funcion(xl));
            f1 = redondeo(funcion(x1));
            f2 = redondeo(funcion(x2));
            
            System.out.println(i++ + "\t" + xl + "\t" + fl + "\t" + x2 + "\t" + f2 +
                             "\t" + x1 + "\t" + f1 + "\t" + xu + "\t" + fu +
                             "\t" + d);
            
            if (f1 > f2){
                xl = x2;
            }else{
                xu = x1;
            }
        }while(d > 0.001);
    }
}