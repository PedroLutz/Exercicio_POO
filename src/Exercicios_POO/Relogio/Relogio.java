package Exercicios_POO.Relogio;

public class Relogio {
    public int hora = 0;
    public int minuto = 0;
    public int segundo = 0;

    public void adicionarHora(int hora){
        this.hora = this.hora + hora;
        System.out.println("Adicionada(s) "+ hora + " hora(s) ao relógio.");
    };

    public void checarMinuto(){
        if(this.minuto >= 60){
            while(this.minuto >= 60) {
                this.minuto = this.minuto - 60;
                this.hora = this.hora + 1;
            };
        };
    }

    public void adicionarMinuto(int minuto){
      this.minuto = this.minuto + minuto;
      checarMinuto();
        System.out.println("Adicionado(s) "+minuto+" minuto(s) ao relógio.");
    };

    public void adicionarSegundo(int segundo){
        this.segundo = this.segundo + segundo;
        if(this.segundo >= 60){
            while(this.segundo >= 60) {
                this.segundo = this.segundo - 60;
                this.minuto = this.minuto + 1;
            };
        };
        checarMinuto();
        System.out.println("Adicionado(s) "+segundo+" segundo(s) ao relógio");
    };

    public void exibirHorario(){
        System.out.println("A hora atual é "+
                String.format("%02d", this.hora)+":"+
                String.format("%02d", this.minuto)+":"+
                String.format("%02d", this.segundo)+".");
    };
}
