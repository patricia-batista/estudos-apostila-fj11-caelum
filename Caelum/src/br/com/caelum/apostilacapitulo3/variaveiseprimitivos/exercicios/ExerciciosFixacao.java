package br.com.caelum.apostilacapitulo3.variaveiseprimitivos.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExerciciosFixacao {
    public static void main(String[] args) {
        fazExercicio1();
        fazExercicio2();
        fazExercicio3();
        fazExercicio4();
        fazExercicio5();
        fazExercicio6();
        fazExercicio7();
        fazExercicio8();
    }

    private static void fazExercicio1(){
        System.out.println("Atividade: 1.	 Imprima	todos	os	números	de	150	a	300.");
        int i = 150;
        do {
            System.out.println(i);
            i++;
        } while (i <= 300);
    }

    private static void fazExercicio2(){
        System.out.println("\nAtividade: 2.	 Imprima	a	soma	de	1	até	1000.");
        int j = 2;
        for (int i = 1; i <= 10; i++) {
            j += i;
            System.out.println(i + " + " + (j - i) + " = " + j);
        }
    }

    private static void fazExercicio3(){
        System.out.println("\nAtividade: 3.	 Imprima	todos	os	múltiplos	de	3,	entre	1	e	100.");
        int i = 0;
        while (i <= 100){
            int j = ++i;
            if (j % 3 == 0){
                System.out.println(i);
                i++;
            }
        }
    }

    private static void fazExercicio4(){
        System.out.println("\nAtividade: 4. Imprima os fatoriais de 1 a 10.");
        int fatorial = 10;
        int aux = 0;
        for (int i = fatorial-1; i >= 1; i--) {
            aux = fatorial;
            fatorial *= i;
            System.out.println(i + " * " + aux + " = " + fatorial);
        }
    }

    private static void fazExercicio5(){
        System.out.println("\nAtividade: 5.	 No	código	do	exercício	anterior, " +
                "aumente	a	quantidade	de	números	que	terão	os	fatoriais	impressos, \n" +
                "até	20,	30,	40.	Em	um	determinado	momento,	além	desse	cálculo	demorar, " +
                "vai	começar	a	mostrar respostas	completamente	erradas. \nPor	quê? " +
                "Mude	de		int		para		long		para	ver	alguma	mudança.");
        long fatorial = 20L;
        for (long i = fatorial-1; i >= 1L; i--) {
            long aux = fatorial;
            fatorial *= i;
            System.out.println(i + " * " + aux + " = " + fatorial);
        }
    }

    private static void fazExercicio6(){
        System.out.println("\nAtividade: 6.	 (opcional)	 Imprima	 os	 primeiros	 números " +
                "da	 série	 de	 Fibonacci	 até	 passar	 de	 100.	");
        List<Integer> f = new ArrayList<>();
        f.add(0);
        f.add(1);
        int j = 1;
        int fibonacci = 150;
        for(int i = 1; i <= fibonacci;){
            f.add(i);
            i += f.get(j);
            j++;
        }
        System.out.println(f);
    }

    private static void fazExercicio7() {
        System.out.println("\nAtividade: 7.	 (opcional)	 Escreva	 um	 programa	 que, " +
                "dada	 uma	 variável	 	x		 com	 algum	 valor	 inteiro,\n" +
                "temos	 um novo		x		de	acordo	com	a	seguinte	regra:");
        Scanner scan = new Scanner(System.in);
        int x = 0;
        System.out.print("Digite um valor : ");
        x = scan.nextInt();
        do {
            if (x % 2 == 0) {
                x = x / 2;
            } else {
                x = 3 * x + 1;
            }
            System.out.print(x + " -> ");
        } while (x != 1);
    }

    private static void fazExercicio8() {
        System.out.println("\nAtividade: 8.	 (opcional)	Imprima	a	seguinte	tabela, " +
                "usando		for	s	encadeados: ");
        int  qtdeColunas = 0;
        for (int linha = 1; linha <= 8; linha++) {
            System.out.print(linha);
            int tabuadaInicia = 2;
            for (int coluna = 0; coluna < qtdeColunas; coluna++) {
                System.out.print("\t" + linha * tabuadaInicia);
                tabuadaInicia++;
            }
            System.out.print("\n");
            qtdeColunas++;
        }
    }
}