public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        System.out.println(pessoa1);

        pessoa1.nome = "Filipe";
        pessoa1.sobrenome = "Da Cas";
        pessoa1.idade = 38;

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Pedro Gui";
        pessoa2.sobrenome = "Rosa Lutz";
        pessoa2.idade = 18;

        PessoaFisica pessoaFisica1 = new PessoaFisica();
        pessoaFisica1.nome = "Pedro Gui";
        pessoaFisica1.sobrenome = "Rosa Lutz";
        pessoaFisica1.idade = 18;
        pessoaFisica1.cpf = "macacada";

        pessoaFisica1.exibirDetalhes();
    }
}