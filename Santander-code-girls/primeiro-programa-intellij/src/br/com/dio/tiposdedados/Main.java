package br.com.dio.tiposdedados;

public class Main {

    public static void main(String[] args){

        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        //short s2 = 40000; maior que pode suportar

        //int i1 = -10000000000; muito menor que pode suportar
        int i2 = 28500;

        long l1 = 1000000000000000000L;
        long l2 = 200400500050005000L;

        //float f1 = 4.5;
        float f2 = 10.65F;

        double d1 = 85.69;
        double d2 = 99.04d;

        char c1 = 'w';
        //char c2 = 'Tw';
        char c3 = '\u0057';

        String st1 = "Fulano";
        String st2 = "Cicrano";

       // String dt1 = "08/03/2009";

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        //System.out.println(dt1);
        System.out.println(bo1);
        System.out.println(bo2);
    }
}
