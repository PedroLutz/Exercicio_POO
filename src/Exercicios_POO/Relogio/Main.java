package Exercicios_POO.Relogio;

public class Main {
    public static void main(String[] args) {
        Relogio relogio = new Relogio();
        relogio.adicionarHora(10);
        relogio.adicionarMinuto(150);
        relogio.adicionarSegundo(250);
        relogio.exibirHorario();
    }
}
