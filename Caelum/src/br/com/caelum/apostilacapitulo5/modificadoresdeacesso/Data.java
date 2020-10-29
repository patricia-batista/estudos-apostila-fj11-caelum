package br.com.caelum.apostilacapitulo5.modificadoresdeacesso;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) throws Exception {
        if (dia > 31 || mes > 12) {
            throw new Exception("Dia inválido.");
        } else if (mes == 2) {
            if (dia > 29) {
                throw new Exception("Fevereiro tem apenas 28 a 29 dias. Insira uma data válida.");
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia > 30) {
                throw new Exception("Mês com apenas 30 dias. Insira uma data válida.");
            }
        }
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Data{" +
                "dia=" + dia +
                ", mes=" + mes +
                ", ano=" + ano +
                '}';
    }
}
