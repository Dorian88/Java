package primerospasos;

public class ConstantesOperadores {
    
    public void constantesOperadores(){
        int a = 5, b, c, op1, op2, res;
        float res1;
        
        op1 = 8;
        op2 = 7;
        b = 7;
        
        c = a + b;
        System.out.println("El valor de c es: " + c);
        c++;
        System.out.println("El valor de c con el incremento c++ es: " + c);
        c+=6;
        System.out.println("El valor de c con el incremento c= aumentado en 6 es: " + c);
        c--;
        System.out.println("El valor de c con el decremento c-- es: " + c);
        c-=6;
        System.out.println("El valor de c con el decremento c= disminuido en 6 es: " + c + "\n");
        
        res = op1 + op2;
        System.out.println("El resultado de la suma es: " + res);
        res = op1 - op2;
        System.out.println("El resultado de la resta es: " + res);
        res = op1 * op2;
        System.out.println("El resultado de la multiplicación es: " + res);
        res1 = op1 / op2;
        System.out.println("El resultado de la division es: " + res1);
        
    }
}