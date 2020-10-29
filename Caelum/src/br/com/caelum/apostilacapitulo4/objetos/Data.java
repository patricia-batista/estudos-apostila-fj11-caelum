package br.com.caelum.apostilacapitulo4.objetos;

public class Data {
    int dia;
    int mes;
    int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Data{" +
                dia +"/"+ mes +"/"+ ano +
                '}';
    }
}
