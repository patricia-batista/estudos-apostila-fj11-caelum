package br.com.caelum.apostilacapitulo4.objetos;

public class Cliente {
        String nome;
        String sobrenome;
        String cpf;

        @Override
        public String toString() {
                return "Cliente{" +
                        "nome='" + nome + '\'' +
                        ", sobrenome='" + sobrenome + '\'' +
                        ", cpf='" + cpf + '\'' +
                        '}';
        }
}
