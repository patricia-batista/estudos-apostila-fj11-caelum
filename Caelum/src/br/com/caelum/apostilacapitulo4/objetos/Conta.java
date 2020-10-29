package br.com.caelum.apostilacapitulo4.objetos;

public class Conta {
    int numero;
    String titular1;
    Cliente titular = new Cliente(); //quando chamar new Conta, automaticamente construirá um "new Cliente()"
    double saldo;
    Data dataAbertura;

    boolean saca(double valor){
        if (this.saldo < valor) return false;
        else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }

    void deposita(double valor){
        this.saldo += valor;
    }

    boolean transferePara(Conta destino, double valor) {
        if (!this.saca(valor)) return false;
        else {
            destino.deposita(valor);
            return true;
        }
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", titular=" + titular +
                ", saldo=" + saldo +
                '}';
    }
}
