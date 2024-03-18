package Contador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Contador contador = new Contador();

        System.out.println("Digite um valor para o contador:");
        contador.valor = leia.nextInt();
        contador.incrementar();
        contador.exibirValor();
        contador.incrementar();
        contador.exibirValor();
        contador.decrementar();
        contador.exibirValor();
    };
}
