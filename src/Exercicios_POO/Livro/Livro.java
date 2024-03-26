package Exercicios_POO.Livro;

public class Livro {
    public String titulo;
    public String autor;
    public int ano;
    public double preco;

    public void aplicarDesconto(double desconto){
        double valorDescontado = this.preco*(1 - desconto/100);
        System.out.println("\nDesconto de "+desconto+"% aplicado!\n" +
                "Preço final: R$"+valorDescontado+".");
    };

    public void exibirInfo(){
        System.out.println(
                "\nTítulo: "+this.titulo+
                        "\nAutor: " + this.autor+
                        "\nAno de lançamento: " + this.ano +
                "\nValor unitário: " + this.preco
        );
    }
}
