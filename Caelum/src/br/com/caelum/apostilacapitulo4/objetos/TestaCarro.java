package br.com.caelum.apostilacapitulo4.objetos;

public class TestaCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.cor = "Preto";
        carro.modelo = "Fuscão";
        carro.velocidadeAtual = 0;
        carro.velocidadeMaxima = 80;

        carro.liga();

        carro.acelera(50);

        System.out.println(carro.pegaMarcha());
    }
}
