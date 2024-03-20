package ContaBancaria;

public class ContaBancaria {
    public String titular;
    double saldo = 0;

    public void depositar(double valor){
        this.saldo = this.saldo + valor;
        System.out.println("\nSaldo atual: " + this.saldo);
    }

    public void sacar(double valor){
        if(valor > this.saldo){
            System.out.println("\nVocê não tem esse valor para sacar!" +
                    "\nSaque requisitado: R$"+valor+
                    "\nSaldo atual: R$"+this.saldo);
        } else {
            this.saldo = this.saldo - valor;
            System.out.println("\nSaldo atual: " + this.saldo);
        }


    }
}
