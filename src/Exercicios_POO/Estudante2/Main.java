package Exercicios_POO.Estudante2;

public class Main {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome="Pedro";
        estudante.nota1=8;
        estudante.nota2=6;
        estudante.calcularMedia();
        estudante.checarAprovacao();
    }
}
