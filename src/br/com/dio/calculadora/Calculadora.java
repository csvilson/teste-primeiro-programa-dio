package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		
		Scanner imprime = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Insira o primeiro número");
		a = imprime.nextInt();
		
		System.out.println("Insira o segundo número");
		b = imprime.nextInt();
		
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		int multiplicacao = multiplicacao(a,b);
		double divisao = divisao(a,b);
		
		System.out.println("resultado da soma " +soma);
		System.out.println("resultado da subtracao " +subtracao);
		System.out.println("resultado da multiplicacao " +multiplicacao);
		System.out.println("resultado da divisao " +divisao);
	}
	
	public static int soma(int a, int b) {
		return a + b;
	}
	public static int subtracao(int a, int b) {
		return a - b;
	}
	public static int multiplicacao(int a, int b) {
		return a * b;
	}
	public static double divisao(double a, double b) {
		return a / b;
	}

}//Calculadora

