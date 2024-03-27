package Avaliacao_2703.Q3_Contador;

public class Main {
    public static void main(String[] args) {
        Contador contador = new Contador(10);
        contador.incrementarValor();
        contador.incrementarValor();
        contador.decrementarValor();
        System.out.println(contador.getValor());
    }
}
