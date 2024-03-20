package Produto;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome="Tapete";
        produto.preco=100;
        produto.quantidade=20;
        produto.calcularValorTotal();
    }
}
