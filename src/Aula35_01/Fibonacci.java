package Aula35_01;

public class Fibonacci extends Teste {
	public static int fibonacci(int n) {
		int i;
		int fibonacci[] = new int[n + 2];

		fibonacci[0] = 0;
		fibonacci[1] = 1;

		for (i = 2; i <= n; i++) {

			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		}
		return fibonacci[n];
	}

}
