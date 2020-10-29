package br.com.caelum.apostilacapitulo5.modificadoresdeacesso;

public class TestaAcessoDireto {
    public static void main(String[] args) throws Exception {
        Conta minhaConta = new Conta();
        //minhaConta.saldo = 1000; -> Ao alterar o modificador de acesso dos atributos de "default",
        // para "private", não é mais possível acessar os atributos fora da classe

        minhaConta.deposita(1000);
        System.out.println("Saldo: " + minhaConta.pegaSaldo());

        minhaConta.setData(new Data(29, 02, 2012));
        System.out.println(minhaConta.getData());
    }
}
