package Estudante;

import java.util.ArrayList;
import java.util.List;

public class Estudante {
    public String nome;
    List<Double> notas = new ArrayList<Double>();

    public void adicionarNota(double nota){
        this.notas.add(nota);
        System.out.println("Notas de "+this.nome+": "+notas);
    }

    public void calcularMedia(){
        double media, soma = 0;
        for (int i = 0; i < notas.size(); i++){
            soma = soma + notas.get(i);
        };
        media = soma/notas.size();
        System.out.println("A média de "+this.nome+" é: "+media+".");
    }


}
