package br.com.caelum.apostilacapitulo10.classeabstrata;

public class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;

    public double getBonificacao(){
        return this.salario * 0.10;
    }
}
