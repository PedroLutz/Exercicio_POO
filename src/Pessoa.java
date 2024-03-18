public class Pessoa {
    //atributos
    String nome;
    String sobrenome;
    int idade;

    //Métodos são funções
    public void correr(){
        System.out.println("Está correndo!");
    }

    public void exibirDetalhes(){
        System.out.println("Nome: " + this.nome + ". Sobrenome: " + this.sobrenome + ". Idade: " + this.idade);
    }
}
