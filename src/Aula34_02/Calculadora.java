package Aula34_02;

import java.util.Scanner;

public class Calculadora {

	private static double num1, num2;
	private static Scanner scan = new Scanner(System.in);

	public static double somar() {
		double totalSoma = 0;
		System.out.println("Você escolheu a opção SOMA.");
		System.out.println("----------------------------");
		System.out.println("Digite o primeiro número: ");
		num1 = scan.nextDouble();
		System.out.println("Digite o segundo número: ");
		num2 = scan.nextDouble();
		totalSoma = num1 + num2;

		double x = (double) (Math.round(totalSoma * 100.0) / 100.0);
		System.out.println("O total da soma de: " + num1 + " e " + num2 + " é de: " + x);
		return totalSoma;
	}

	public static double subtrair() {
		double totalSubtracao = 0;
		System.out.println("Você escolheu a opção SUBTRACAÇÃO.");
		System.out.println("----------------------------");
		System.out.println("Digite o primeiro número: ");
		num1 = scan.nextDouble();
		System.out.println("Digite o segundo número: ");
		num2 = scan.nextDouble();
		totalSubtracao = num1 - num2;

		double x = (double) (Math.round(totalSubtracao * 100.0) / 100.0);
		System.out.println("O total da subtração de: " + num1 + " e " + num2 + " é de: " + x);
		return totalSubtracao;
	}

	public static double multiplicar() {
		double totalMultiplicacao = 0;
		System.out.println("Você escolheu a opção MULTIPLICAÇÃO.");
		System.out.println("----------------------------");
		System.out.println("Digite o primeiro número: ");
		num1 = scan.nextDouble();
		System.out.println("Digite o segundo número: ");
		num2 = scan.nextDouble();
		totalMultiplicacao = num1 * num2;

		double x = (double) (Math.round(totalMultiplicacao * 100.0) / 100.0);
		System.out.println("O total da multiplicação de: " + num1 + " e " + num2 + " é de: " + x);
		return totalMultiplicacao;
	}

	public static double dividir() {
		double totalDivisao = 0;
		System.out.println("Você escolheu a opção DIVISÃO.");
		System.out.println("----------------------------");
		System.out.println("Digite o primeiro número: ");
		num1 = scan.nextDouble();
		System.out.println("Digite o segundo número: ");
		num2 = scan.nextDouble();
		totalDivisao = num1 / num2;

		double x = (double) (Math.round(totalDivisao * 100.0) / 100.0);
		System.out.println("O total da divisão de: " + num1 + " e " + num2 + " é de: " + x);
		return totalDivisao;
	}

	public static double exponenciacao() {
		double totalExponenciacao = 0;
		System.out.println("Você escolheu a opção EXPONENCIAÇÃO.");
		System.out.println("----------------------------");
		System.out.println("Digite o número: ");
		num1 = scan.nextDouble();
		System.out.println("Elevado a potência: ");
		num2 = scan.nextDouble();
		totalExponenciacao = Math.pow(num1, num2);

		double x = (double) (Math.round(totalExponenciacao * 100.0) / 100.0);
		System.out.println("O total da exponenciação de: " + num1 + " e " + num2 + " é de: " + x);
		return totalExponenciacao;
	}

	public static double getNum1() {
		return num1;
	}

	public static void setNum1(double num1) {
		Calculadora.num1 = num1;
	}

	public static double getNum2() {
		return num2;
	}

	public static void setNum2(double num2) {
		Calculadora.num2 = num2;
	}

}
