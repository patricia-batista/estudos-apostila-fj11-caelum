package br.com.caelum.apostilacapitulo4.objetos;

public class Carro {
    String cor;
    String modelo;
    double velocidadeAtual;
    double velocidadeMaxima;
    Motor motor;

//liga o carro
    void liga(){
        System.out.println("O carro está ligado.");
    }

    void acelera(double velocidade){
        this.velocidadeAtual = this.velocidadeAtual + velocidade;
    }

    int pegaMarcha(){
        if (this.velocidadeAtual < 0) return -1;
        if (this.velocidadeAtual >= 0 && this.velocidadeAtual < 40) return 1;
        if (this.velocidadeAtual >= 40 && this.velocidadeAtual < 80) return 2;
        else return 3;
    }
}