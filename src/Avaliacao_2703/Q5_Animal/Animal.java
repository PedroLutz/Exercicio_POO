package Avaliacao_2703.Q5_Animal;

public class Animal {
    private String nome;
    private String tipo;
    private int idade;

    public Animal(String nome, String tipo, int idade) {
        this.nome = nome;
        this.tipo = tipo;
        if(idade < 0){
            System.out.println("Esse valor de idade é inválido! Idade definida automaticamente para 1.");
            this.idade = 1;
        } else {
            this.idade = idade;
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade < 0){
            System.out.println("Esse valor de idade é inválido! Idade inalterada.");
        } else {
            this.idade = idade;
        }
    }

    public void emitirSom(String som) {
        System.out.println(this.nome+" está fazendo '"+som+"'!");
    }
}
