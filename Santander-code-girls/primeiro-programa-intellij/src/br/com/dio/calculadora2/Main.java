package br.com.dio.calculadora2;

import br.com.dio.calculadora2.Calculadora2;

public class Main {
    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercício calculadora");
        Calculadora2.soma(8, 10);
        Calculadora2.subtracao(10, 1.5);
        Calculadora2.multiplicacao(5, 6);
        Calculadora2.divisao(15, 3);

        //Saudações
        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(2);

        // Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000,5);
    }

}
