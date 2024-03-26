package Exercicios_POO.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.depositar(1);
        contaBancaria.depositar(5);
        contaBancaria.sacar(7);
        contaBancaria.sacar(6);
    }
}
