package Exercicios_POO_2503.Animal3;

public class Cachorro extends Animal{
    public Cachorro(String nome, String especie) {
        super(nome, especie);
    }

    @Override
    public void emitirSom(){
        System.out.println("AuAu");
    }
}
