package Aula34_02;

import java.util.Scanner;

public class Teste {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int ler = 0;
		do {
			ler = gerarMenuPrincipal();
			switch (ler) {
			case 1:
				soma();
				break;

			case 2:
				subtracao();
				break;

			case 3:
				multiplicacao();
				break;

			case 4:
				divisao();
				break;

			case 5:
				expoente();
				break;
			}

		} while (ler != 6);
	}

	private static void soma() {
		Calculadora.somar();
	}

	private static void subtracao() {
		Calculadora.subtrair();
	}

	private static void multiplicacao() {
		Calculadora.multiplicar();
	}

	private static void divisao() {
		Calculadora.dividir();
	}

	private static void expoente() {
		Calculadora.exponenciacao();
	}

	private static int gerarMenuPrincipal() {
		System.out.println("-----ESCOLHA A OPERAÇÃO MATEMÁTICA DESEJADA-----");
		System.out.println("1- Soma.");
		System.out.println("2- Subtração.");
		System.out.println("3- Multiplicação.");
		System.out.println("4- Divisão.");
		System.out.println("5- Exponenciação.");
		return scanner.nextInt();
	}
}
