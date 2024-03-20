package Circulo;

public class Circulo {
    public double raio;

    public void calcularArea(){
        double area = raio * raio * 3.14;
        System.out.println("A área desse círculo é "+area+".");
    };

    public void calcularPerimetro(){
        double perimetro = raio * 3.14 * 2;
        System.out.println("O perímetro desse círculo é "+perimetro+".");
    }
}
