package br.com.caelum.apostilacapitulo16.javaio;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class TestaComScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            PrintStream ps = new PrintStream("arquivo.txt");
            while (scan.hasNextLine()){
                ps.println(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

}
