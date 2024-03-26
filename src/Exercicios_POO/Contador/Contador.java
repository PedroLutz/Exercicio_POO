package Exercicios_POO.Contador;

public class Contador {
    public int valor = 0;

    public void incrementar(){
        this.valor++;
    };

    public void decrementar(){
        this.valor--;
    }

    public void exibirValor(){
        System.out.println("O valor atual é "+this.valor+".");
    }
}
