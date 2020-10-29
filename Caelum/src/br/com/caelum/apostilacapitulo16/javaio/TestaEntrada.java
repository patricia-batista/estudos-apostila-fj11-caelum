package br.com.caelum.apostilacapitulo16.javaio;

import java.io.*;

public class TestaEntrada {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String b = br.readLine();

        while (b != null){
            System.out.println(b);
            b = br.readLine();
        }
    }
}
