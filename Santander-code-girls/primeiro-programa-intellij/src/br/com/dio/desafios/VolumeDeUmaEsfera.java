package br.com.dio.desafios;

import java.util.Scanner;

public class VolumeDeUmaEsfera {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double pi = 3.14159;
        int R = scan.nextInt();
        double volume = ( 4.0/3f) * pi * (Math.pow(R, 3.0));
        System.out.printf("VOLUME = %.3f%n", volume);
    }

}
