package Avaliacao_2703.Q2_Funcionario;

public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;

    public Funcionario(String nome, String departamento, double salario) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentarSalario(double porcentagem){
        if(porcentagem == 0){
            System.out.println("Insira uma porcentagem de acréscimo válida!");
        } else {
            double salarioAntigo = this.salario;
            this.salario = this.salario*(1 + porcentagem/100);
            System.out.println("Salário antigo: R$"+salarioAntigo);
            System.out.println("Salário após acréscimo de "+porcentagem+"%: R$"+this.salario);
        }
    }
}
