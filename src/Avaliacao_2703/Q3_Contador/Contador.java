package Avaliacao_2703.Q3_Contador;

public class Contador {
    private double valor;

    public Contador(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void incrementarValor(){
        this.valor = this.valor + 1;
    }

    public void decrementarValor(){
        this.valor = this.valor - 1;
    }
}
