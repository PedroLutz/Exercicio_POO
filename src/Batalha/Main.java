package Batalha;

public class Main {
    public static void main(String[] args) {
        Heroi caraDoBem = new Heroi();
        caraDoBem.nome = "Carlinhos";
        caraDoBem.forca = 25;

        Heroi caraDoMal = new Heroi();
        caraDoMal.nome = "Carlão";
        caraDoMal.forca = 20;

        caraDoBem.atacar(caraDoMal);
        caraDoMal.atacar(caraDoBem);
        caraDoBem.atacar(caraDoMal);
        caraDoMal.atacar(caraDoBem);
        caraDoBem.atacar(caraDoMal);
        caraDoMal.atacar(caraDoBem);
        caraDoBem.atacar(caraDoMal);
        caraDoMal.atacar(caraDoBem);
    };
}
