public class PessoaFisica extends Pessoa{
    String cpf;

    @Override
    public void exibirDetalhes() {
        System.out.println("CPF: "+this.cpf);
    }
}
