package Avaliacao_2703.Q4_Pet;

public class Pet {
    private String nome;
    private String especie;
    private int idade;

    public Pet(String nome, String especie, int idade) {
        this.nome = nome;
        this.especie = especie;
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

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
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

    public void exibirInfo(){
        System.out.println(
                "\nNome do pet: "+this.nome+
                        "\nEspécie do pet: "+this.especie+
                        "\nIdade do pet: "+this.idade
        );
    }
}
