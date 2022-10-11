package Aula35_02;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int numero;
		System.out.print("Digite o termo do Somatório: ");
		numero = ler.nextInt();
		System.out.print("Resultado: " + Calculadora.Soma(numero));

	}

}
