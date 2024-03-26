package Exercicios_POO.Calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double soma = calculadora.somar(1,10);
        double subtracao = calculadora.subtrair(1,10);
        double produto = calculadora.multiplicar(11,2);
        double divisao = calculadora.dividir(10,3);

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(produto);
        System.out.println(divisao);
    }
}
