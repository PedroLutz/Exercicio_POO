package Estudante1;

public class Main {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Pedro";
        estudante.adicionarNota(10);
        estudante.adicionarNota(9);
        estudante.adicionarNota(7);
        estudante.calcularMedia();
    }
}
