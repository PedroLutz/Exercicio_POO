package Exercicios_POO_2503.ContaBancaria1;

import Exercicios_POO_2503.Pessoa1.Pessoa1;

public class ContaBancaria {
    private int numero;
    private double saldo;
    private Pessoa1 titular;

    public ContaBancaria(int numero, Pessoa1 titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo += valor;
        System.out.println("Saldo atual: "+saldo);
    }

    public void sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            System.out.println("Saldo atual: "+saldo);
        } else {
            System.out.println("Não é possível sacar esse valor.");
        }
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                ", titular=" + titular +
                '}';
    }
}
