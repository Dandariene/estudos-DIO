package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {

        int numero;
        Scanner scan = new Scanner(System.in);
        System.out.println("Fatorial: ");
        numero = scan.nextInt();

        int multiplicacao = 1;

        for (int i = numero; i >= 1 ; i--) {
            multiplicacao = multiplicacao * i;
        }
        System.out.println(numero + "! = "+ multiplicacao);
    }
}
