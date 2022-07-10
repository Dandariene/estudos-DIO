package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a,b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();

        double somar = somar(a, b);
        double subtrair = subtrair(a, b);
        double multiplicar = multiplicar(a, b);
        double dividir = dividir(a, b);

        System.out.println("soma: "+ somar);
        System.out.println("subtração: "+ subtrair);
        System.out.println("multiplicação: "+ multiplicar);
        System.out.println("divisão: "+ dividir);

    }

    public static double somar(int a, int b){
        return a + b;
    }

    public static double subtrair(int a, int b){
        return a - b;
    }

    public static double multiplicar(int a, int b){
        return a * b;
    }

    public static double dividir(int a, int b) {
        return a / b;
    }
}
