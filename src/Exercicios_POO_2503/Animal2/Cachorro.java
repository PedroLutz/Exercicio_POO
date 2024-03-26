package Exercicios_POO_2503.Animal2;

public class Cachorro implements Animal{
    private String nome;
    private int idade;

    public Cachorro(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public void emitirSom(String som) {
        System.out.println("Cachorro faz" + som);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
    }
}
