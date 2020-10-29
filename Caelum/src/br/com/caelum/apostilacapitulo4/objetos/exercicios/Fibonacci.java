package br.com.caelum.apostilacapitulo4.objetos.exercicios;

public class Fibonacci {
    static int valorAnterior = 1;
    public static void main(String[] args) {
        System.out.println("Implementação Recursiva: ");
        for (int i = 1; i <= 6; i++) {
            int resultado = calculaFibonacci(i);
            System.out.println(resultado);
        }
        System.out.println("Implementação Ternária: ");
        for (int i = 1; i <= 6; i++) {
            int resultado = calculaFibonacci2(i);
            System.out.println(resultado);
        }
    }

    public static int calculaFibonacci(int i){
        if (i < 2) return i;
        else return calculaFibonacci(i-1) + calculaFibonacci(i-2);
    }

    public static int calculaFibonacci2(int i){
        return (i < 2) ? i : calculaFibonacci2(i-1) + calculaFibonacci(i-2);
    }

}
