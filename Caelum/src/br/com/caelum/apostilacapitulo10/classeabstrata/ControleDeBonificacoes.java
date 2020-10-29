package br.com.caelum.apostilacapitulo10.classeabstrata;

public class ControleDeBonificacoes {
    private double totalDeBonificacoes = 0;

    public void registra(Funcionario funcionario){ //Polimorfismo - recebe qualquer referência do tipo Funcionario
        System.out.println("Adicionando	bonificação	do	funcionario:	"	+	funcionario.nome);
        this.totalDeBonificacoes += funcionario.getBonificacao();
    }

    public double getTotalDeBonificacoes() {
        return totalDeBonificacoes;
    }
}
