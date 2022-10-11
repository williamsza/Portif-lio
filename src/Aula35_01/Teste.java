package Aula35_01;

import java.util.Scanner;
//1. Escreva um método recursivo e estático que calcule e retorne o N-ésimo
//termo da sequência Fibonacci. Alguns números desta sequência são: 0, 1,
//1, 2, 3, 5, 8, 13, 21, 34, 55, 89...

public class Teste {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;
		System.out.println("Digite o termo Fibonacci:  ");
		numero = ler.nextInt();

		for (int i = 1; i <= numero; i++) {
			System.out.println(Fibonacci.fibonacci(i) + "");

		}

	}

}
