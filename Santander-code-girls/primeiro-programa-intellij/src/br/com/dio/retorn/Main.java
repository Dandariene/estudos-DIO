package br.com.dio.retorn;

public class Main {
    public static void main(String[] args){

        System.out.println("Exercício retorno");

        double areaQuadrado = Quadrilatero.area(6);
        System.out.println("Area do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5,5);
        System.out.println("Area do retângulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7,8,9);
        System.out.println("Area do trapézio: " + areaTrapezio);

    }
}
