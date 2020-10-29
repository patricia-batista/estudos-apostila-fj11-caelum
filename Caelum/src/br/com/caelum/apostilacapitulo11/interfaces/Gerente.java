package br.com.caelum.apostilacapitulo11.interfaces;

public class Gerente extends Funcionario implements Autenticavel{

    private int senha;

    @Override
    public boolean autentica(int senha) {
        if(this.senha != senha){
            return false;
        }
        return true;
    }
}
