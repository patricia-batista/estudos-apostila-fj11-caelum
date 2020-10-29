package br.com.caelum.apostilacapitulo15.collections;

import br.com.caelum.apostilacapitulo5.modificadoresdeacesso.Conta;

import java.util.HashMap;
import java.util.Map;

public class TestaConta {

    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.deposita(1000);
        Conta conta2 = new Conta();
        conta2.deposita(2000);

        Map<String, Conta> mapaDeConta = new HashMap<>();

        mapaDeConta.put("diretor", conta1);
        mapaDeConta.put("gerente", conta2);

        Conta diretor = mapaDeConta.get("gerente");
        System.out.println(diretor.getSaldo());

    }
}
