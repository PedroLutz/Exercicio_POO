package Exercicios_POO.Livro;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.autor="Machado de Assis";
        livro.ano=1881;
        livro.titulo="Memórias Póstumas de Brás Cubas";
        livro.preco=40;

        livro.aplicarDesconto(10);
        livro.exibirInfo();
    }
}
