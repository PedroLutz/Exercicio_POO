package Estudante2;

public class Estudante {
    public String nome;
    public double nota1, nota2;

    public double media;

    public void calcularMedia(){
        this.media = (this.nota1 + this.nota2)/2;
        System.out.println("A média é do aluno "+this.nome+" é: "+this.media+".");
    }

    public void checarAprovacao(){
        if(this.media >= 7) {
            System.out.println("O aluno " + this.nome + " está aprovado!");
        } else {
            System.out.println("O aluno "+ this.nome+" não está aprovado!");
        };
    }
}
