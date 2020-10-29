package br.com.caelum.apostilacapitulo12.excecoesecontroles;

public class ContaCorrente {

    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void deposita(double valor){
        this.saldo += valor;
    }

}
