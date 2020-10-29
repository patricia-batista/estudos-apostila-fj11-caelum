package br.com.caelum.apostilacapitulo10.classeabstrata;

public class Gerente extends Funcionario { //Herança
    private int senha;
    private int numeroDeFuncionariosGerenciados;

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumeroDeFuncionariosGerenciados() {
        return numeroDeFuncionariosGerenciados;
    }

    public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }

    public boolean autentica(int senha){
        return this.senha == senha ? true : false;
    }

    @Override
    public double getBonificacao() {
        //Sobrescrita de método
        double bonificacaoComMaisMilReais = 1000;
        //return this.senha * 0.15;
        return super.getBonificacao() + bonificacaoComMaisMilReais;
    }
}
