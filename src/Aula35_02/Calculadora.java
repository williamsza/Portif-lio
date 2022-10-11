package Aula35_02;

import java.util.Scanner;
//2. Escreva um método recursivo e estático que receba um número inteiro
//positivo N e calcule o somatório dos números de 1 a N

public class Calculadora {
	private static int numero;
	private static int r;

	public static int Soma(int numero) {
		if (numero == 0)
			return 0;
		else
			System.out.println(numero);
		return numero + Soma(numero - 1);

//		int r = somatorio(numero - 1) + numero;
//		return r;

	}

}
