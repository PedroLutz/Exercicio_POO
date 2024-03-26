package Exercicios_POO.Produto;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public void calcularValorTotal(){
        System.out.println("O valor total em estoque do produto "+this.nome+" é de R$"+this.preco*this.quantidade+".");
    }
}
