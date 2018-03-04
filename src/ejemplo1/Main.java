package ejemplo1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Resultado suma = new Resultado();
        long t0 = (new Date()).getTime(); //t0 = instante de inicio de los cálculos
        Calculador p1 = new Calculador(1,10000000,suma);
        p1.start();
        try
        {
            p1.join();
        } catch (InterruptedException e) {}
        long t1 = (new Date()).getTime(); //t1=instante de final de los cálculos
        System.out.println("La suma de los números primos hasta 10000000 es: " + suma.getSuma() + " calculado en " + (t1-t0) + " miliseg. ");
    }
}
