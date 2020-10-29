package br.com.caelum.apostilacapitulo11.interfaces;

public class SistemaInterno {

    public void login(Autenticavel a){
        int senha = 1234;
        boolean ok = a.autentica(senha);
    }

    public static void main(String[] args) {

        Autenticavel diretor = new Diretor();
        Autenticavel gerente = new Gerente();

        SistemaInterno sistemaInterno = new SistemaInterno();

        sistemaInterno.login(diretor);
        sistemaInterno.login(gerente);
    }
}