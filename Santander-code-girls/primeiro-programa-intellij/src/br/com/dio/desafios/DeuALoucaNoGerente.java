package br.com.dio.desafios;

import java.util.Scanner;

public class DeuALoucaNoGerente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int desconto = scan.nextInt();
        int precoAntigo = scan.nextInt();

        int precoNovo = precoAntigo - (desconto * precoAntigo) / 100;
        System.out.println(precoNovo);
    }
}
