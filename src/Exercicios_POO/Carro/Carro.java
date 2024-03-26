package Exercicios_POO.Carro;

public class Carro {
    String modelo;
    String marca;
    int ano;

    public void exibirInfo(){
        System.out.println(
                "Modelo: " + this.modelo + "\nMarca: " + this.marca + "\nAno: " + this.ano
        );
    }
}
