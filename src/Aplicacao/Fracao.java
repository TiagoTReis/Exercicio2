package Aplicacao;

import java.util.Scanner;

public class Fracao {
    private int numerador;
    private int denominador;

    // Construtor
    public Fracao(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("Denominador não pode ser zero.");
        }
        this.numerador = numerador;
        this.denominador = denominador;
        simplificar();
    }

    // Método estático para calcular o Máximo Divisor Comum (MDC)
    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // Método para simplificar a fração
    private void simplificar() {
        int gcd = gcd(numerador, denominador);
        numerador /= gcd;
        denominador /= gcd;
    }

    // Método para somar frações
    public Fracao soma(Fracao outra) {
        int novoNumerador = this.numerador * outra.denominador + outra.numerador * this.denominador;
        int novoDenominador = this.denominador * outra.denominador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    // Método para subtrair frações
    public Fracao subtracao(Fracao outra) {
        int novoNumerador = this.numerador * outra.denominador - outra.numerador * this.denominador;
        int novoDenominador = this.denominador * outra.denominador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    // Método para multiplicar frações
    public Fracao multiplicacao(Fracao outra) {
        int novoNumerador = this.numerador * outra.numerador;
        int novoDenominador = this.denominador * outra.denominador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    // Método para dividir frações
    public Fracao divisao(Fracao outra) {
        if (outra.numerador == 0) {
            throw new ArithmeticException("Divisão por zero.");
        }
        int novoNumerador = this.numerador * outra.denominador;
        int novoDenominador = this.denominador * outra.numerador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    // Método para representar a fração como string

    public String toString() {
        return numerador + "/" + denominador;
    }

    // Método principal para interação com o usuário
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numerador da primeira fração: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o denominador da primeira fração: ");
        int den1 = scanner.nextInt();

        System.out.print("Digite o numerador da segunda fração: ");
        int num2 = scanner.nextInt();
        System.out.print("Digite o denominador da segunda fração: ");
        int den2 = scanner.nextInt();

        Fracao f1 = new Fracao(num1, den1);
        Fracao f2 = new Fracao(num2, den2);

        System.out.println("Primeira fração: " + f1);
        System.out.println("Segunda fração: " + f2);

        Fracao resultadoSoma = f1.soma(f2);
        Fracao resultadoSubtracao = f1.subtracao(f2);
        Fracao resultadoMultiplicacao = f1.multiplicacao(f2);
        Fracao resultadoDivisao = f1.divisao(f2);

        System.out.println("Soma: " + resultadoSoma);
        System.out.println("Subtração: " + resultadoSubtracao);
        System.out.println("Multiplicação: " + resultadoMultiplicacao);
        System.out.println("Divisão: " + resultadoDivisao);
    }
}
