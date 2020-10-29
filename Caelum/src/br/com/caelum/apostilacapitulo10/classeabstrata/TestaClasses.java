package br.com.caelum.apostilacapitulo10.classeabstrata;

public class TestaClasses {
    public static void main(String[] args) {
        ControleDeBonificacoes controle = new ControleDeBonificacoes();

        Funcionario gerente = new Gerente(); //Gerente É UM Funcionario - Conceito de Herança
        gerente.nome = "Percival";
        gerente.salario = 5000;
        controle.registra(gerente); //polimorfismo*

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Joaquino";
        funcionario.salario = 2000;
        controle.registra(funcionario);//polimorfismo*
        //*Podendo passar assim por parametro qualquer objeto que seja um Funcionário

        System.out.println(controle.getTotalDeBonificacoes());

        /*Gerente gerente = new Gerente();
        gerente.nome = "Percival";
        gerente.setSenha(123);
        System.out.println("Gerente: " + gerente.nome + " \nSenha: " + gerente.autentica(123));*/
    }
}
