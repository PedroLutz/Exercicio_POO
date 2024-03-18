package Temperatura;

public class Main {
    public static void main(String[] args) {
        Temperatura temperatura = new Temperatura();
        double temp1 = temperatura.celsiusParaFahrenheit(0);
        System.out.println(temp1);
        double temp2 = temperatura.fahrenheitParaCelsius(212);
        System.out.println(temp2);
    }
}
