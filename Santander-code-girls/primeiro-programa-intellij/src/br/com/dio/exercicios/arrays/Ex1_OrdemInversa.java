package br.com.dio.exercicios.arrays;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {0, -5, -8, 5, 10, 50};

        System.out.print("Vetor: ");

        int contador = 0;

        while (contador < (vetor.length)) {
            System.out.print(vetor[contador] + " ");
            contador++;
        }
        System.out.print("\nVetor: ");
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
