package br.com.caelum.apostilacapitulo5.modificadoresdeacesso;

public class TestaContaEstouro1 {
    public static void main(String[] args) throws Exception {
        Conta conta = new Conta();
         //conta.saldo = 1000;
        conta.saca(5000);
        conta.deposita(100);
        conta.setData(new Data(28, 2, 2000));
        System.out.println(conta.getSaldo());
        System.out.println(conta);

        Conta conta1 = new Conta(123, "Zuleide");
        //conta1.saldo = -200;
        System.out.println(conta1);
        System.out.println("Total de contas: " + Conta.getTotalDeContas());
    }
}
