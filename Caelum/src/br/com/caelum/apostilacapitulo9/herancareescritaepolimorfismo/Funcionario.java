package br.com.caelum.apostilacapitulo9.herancareescritaepolimorfismo;

public class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;

    public double getBonificacao(){
        return this.salario * 0.10;
    }
}
