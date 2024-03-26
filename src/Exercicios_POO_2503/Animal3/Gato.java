package Exercicios_POO_2503.Animal3;

public class Gato extends Animal {
    public Gato(String nome, String especie) {
        super(nome, especie);
    }

    @Override
    public void emitirSom(){
        System.out.println("Mial");
    }
}
