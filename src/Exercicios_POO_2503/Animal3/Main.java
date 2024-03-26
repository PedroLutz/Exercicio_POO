package Exercicios_POO_2503.Animal3;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Tobi", "Dobermann");
        Gato gato = new Gato("Mimi", "Tabby");
        cachorro.emitirSom();
        gato.emitirSom();
    }
}
