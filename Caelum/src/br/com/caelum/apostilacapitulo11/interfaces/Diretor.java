package br.com.caelum.apostilacapitulo11.interfaces;

public class Diretor extends Funcionario implements Autenticavel {

    @Override
    public boolean autentica(int senha) {
        return false;
    }
}
