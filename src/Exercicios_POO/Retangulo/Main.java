package Exercicios_POO.Retangulo;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.largura = 10;
        retangulo.altura = 20;
        retangulo.calcularArea();
        System.out.println(retangulo.area);
    }
}
