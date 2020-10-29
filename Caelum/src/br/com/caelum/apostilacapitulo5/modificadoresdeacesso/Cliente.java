package br.com.caelum.apostilacapitulo5.modificadoresdeacesso;

public class Cliente {
        private String nome;
        private String sobrenome;
        private String cpf;
        private String endereco;

        public void validaCPF(String cpf){
                if (cpf.isEmpty() || cpf.length() < 11) System.out.println("Preencha CPF adequadamente.");
                else this.cpf = cpf;
        }

        @Override
        public String toString() {
                return "Cliente{" +
                        "nome='" + nome + '\'' +
                        ", sobrenome='" + sobrenome + '\'' +
                        ", cpf='" + cpf + '\'' +
                        '}';
        }
}
