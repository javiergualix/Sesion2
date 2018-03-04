package ejemplo2;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Resultado suma = new Resultado();
        long t0 = (new Date()).getTime(); //t0 = instante de inicio de los cálculos
        Calculador p1 = new Calculador(1,2000000,suma);
        Calculador p2 = new Calculador(2000000,4000000,suma);
        Calculador p3 = new Calculador(4000000,6000000,suma);
        Calculador p4 = new Calculador(6000000,8000000,suma);
        Calculador p5 = new Calculador(8000000,10000000,suma);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();

        try
        {
            p1.join();
            p2.join();
            p3.join();
            p4.join();
            p5.join();

        } catch (InterruptedException e) {}
        long t1 = (new Date()).getTime(); //t1=instante de final de los cálculos
        System.out.println("La suma de los números primos hasta 10000000 es: " + suma.getSuma() + " calculado en " + (t1-t0) + " miliseg. ");
    }
}
