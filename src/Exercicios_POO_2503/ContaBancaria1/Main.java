package Exercicios_POO_2503.ContaBancaria1;

import Exercicios_POO_2503.Pessoa1.Pessoa1;

public class Main {
    public static void main(String[] args) {
        Pessoa1 pessoa = new Pessoa1("Pedro", 18, "100");
        ContaBancaria contaBancaria = new ContaBancaria(1, pessoa);
        contaBancaria.depositar(100);
        contaBancaria.sacar(50);
        contaBancaria.sacar(70);
        System.out.println(contaBancaria.toString());
    }
}
