package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {

        int numero;

        Scanner scan = new Scanner(System.in);
        System.out.println("Tabuada: ");
        numero = scan.nextInt();

        System.out.println("Tabuada de " + numero);

        for(int i = 1 ; i <= 10 ; i++){
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
