package Batalha;

public class Heroi {
    String nome;
    int vida = 100;
    int forca;

    public void atacar(Heroi alvo){
        if(this.vida > 0) {
            alvo.vida = alvo.vida - this.forca;
            if(alvo.vida > 0){
                System.out.println("A vida de " + alvo.nome + " desceu para " + alvo.vida);
            } else {
                System.out.println(alvo.nome + " foi atacado por "+this.nome+" e foi derrotado!");
            }
        } else {
            System.out.println(this.nome + " tentou atacar "+ alvo.nome +", mas está fraco demais e não causou dano!");
        }
    };
}
