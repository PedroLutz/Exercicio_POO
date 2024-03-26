package Exercicios_POO_2503.Animal2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Nome do cachorro: ");
        String nome = leia.next();
        System.out.println("Idade: ");
        int idade = leia.nextInt();
        Cachorro cachorro = new Cachorro(nome, idade);
        cachorro.exibirDetalhes();

        System.out.println("Nome do gato: ");
        String nomeGato = leia.next();
        System.out.println("Idade: ");
        int idadeGato = leia.nextInt();
        Gato gato = new Gato(nomeGato, idadeGato);
        System.out.println("Digite o som do gato: ");
        String som = leia.next();
        gato.emitirSom(som);
        gato.exibirDetalhes();
    }
}
