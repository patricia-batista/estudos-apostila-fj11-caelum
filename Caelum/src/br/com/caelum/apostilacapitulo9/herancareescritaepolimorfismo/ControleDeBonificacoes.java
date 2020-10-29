package br.com.caelum.apostilacapitulo9.herancareescritaepolimorfismo;

public class ControleDeBonificacoes {
    private double totalDeBonificacoes = 0;

    public void registra(Funcionario funcionario){ //Polimorfismo - Recebe qualquer funcionário
        this.totalDeBonificacoes += funcionario.getBonificacao();
    }

    public double getTotalDeBonificacoes() {
        return totalDeBonificacoes;
    }
}
