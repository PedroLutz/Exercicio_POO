package Exercicios_POO_2503.Data;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    private void imprimir(int diaMaximo){
        if(dia > diaMaximo){
            System.out.println("O dia dessa data é inválido, considerando o mês ou o ano que está.");
        } else {
            System.out.println("O dia está ok!");
        }
    };

    public void validarData(){
        System.out.println("Data: "+ dia + "/" + mes + "/" + ano + ".");
        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            imprimir(31);
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            imprimir(30);
        } else if (mes == 2){
            if (ano % 4 == 0){
                imprimir(29);
            } else {
                imprimir(28);
            }
        } else if (mes < 0 || mes > 12){
            System.out.println("O mês é inválido.");
        }
    }

    @Override
    public String toString() {
        return "Data{" + dia + "/" + mes + "/" + ano + "}";
    }
}
