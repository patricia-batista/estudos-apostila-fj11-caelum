package br.com.caelum.apostilacapitulo16.javaio;

import java.io.*;

public class TestaSaida {
    public static void main(String[] args) throws IOException {
        FileOutputStream os = new FileOutputStream("arquivo.txt");
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("paçoca");
        bw.close();
    }
}
