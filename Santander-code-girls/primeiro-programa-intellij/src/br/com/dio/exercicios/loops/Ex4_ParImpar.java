package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex4_ParImpar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros;
        int numero;
        int numPares = 0;
        int numImpares = 0;

        System.out.print("Quantidade de números: ");
        quantidadeNumeros = scan.nextInt();

        int contador = 0;

        do {
            System.out.print("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) numPares++;//numPares = numPares + 1;
            else numImpares++; //numImpares = numImpares + 1;

            contador = contador + 1;
        } while (contador < quantidadeNumeros);

        System.out.println("Quantidade de números Pares: " + numPares);
        System.out.println("Quantidade de números ímpares: " + numImpares);

    }
}
