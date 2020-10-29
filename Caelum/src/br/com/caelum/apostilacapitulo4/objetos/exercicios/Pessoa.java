package br.com.caelum.apostilacapitulo4.objetos.exercicios;

public class Pessoa {
    //Programa 1
    String nome = "Duke";
    int idade = 25;

    void fazAniversario(){
        this.idade+=1;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        System.out.println(pessoa);
        pessoa.fazAniversario();
        System.out.println(pessoa);
    }

}
