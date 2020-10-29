package br.com.caelum.apostilacapitulo15.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestaComparadorPorTamanho {
    public static void main(String[] args) {
        List<String> lista = new ArrayList();
        lista.add("Sergio");
        lista.add("Paulo");
        lista.add("Guilherme");

//        ComparadorPorTamanho comparador = new ComparadorPorTamanho();
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        };


        System.out.println(lista);
//        Collections.sort(lista, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return Integer.compare(o1.length(), o2.length());
//            }
//        });

        lista.sort(((o1, o2) -> Integer.compare(o1.length(), o2.length())));

        System.out.println(lista);
    }

}
