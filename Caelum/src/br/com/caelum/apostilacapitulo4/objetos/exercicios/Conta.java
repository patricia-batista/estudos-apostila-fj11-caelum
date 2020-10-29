package br.com.caelum.apostilacapitulo4.objetos.exercicios;

import br.com.caelum.apostilacapitulo4.objetos.Data;

public class Conta {
//Página 54 - {Apostila do Curso FJ-11 - Java e Orientação a Objetos}
    String titular;
    int numero;
    String agencia;
    double saldo;
    Data data;

    void saca(double valor){
        if (valor > this.saldo) System.out.println("Valor acima do saldo disponível.");
        else this.saldo -= valor;
    }

    void deposita(double valor){
        this.saldo += valor;
    }

    double calculaRendimento(){
        return saldo * 0.1;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "titular='" + titular + '\'' +
                ", numero=" + numero +
                ", agencia='" + agencia + '\'' +
                ", saldo=" + saldo +
                ", data=" + data +
                '}';
    }

    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.titular = "Duke";
        conta.agencia = "12345-0";
        conta.numero = 123;
        conta.data = new Data(28, 06, 2015);

        System.out.println(conta);

        conta.deposita(100);
        System.out.println("Saldo atual: " + conta.saldo);
        System.out.println("Rendimento mensal: " + conta.calculaRendimento());

        conta.saca(1000);

        Conta conta1 = new Conta();
        conta1.titular = "Duke";
        conta.saldo = 100;

        Conta conta2 = conta1;

        if (conta1 == conta2) System.out.println("Iguais!");
        else System.out.println("Diferentes!");

    }
}
