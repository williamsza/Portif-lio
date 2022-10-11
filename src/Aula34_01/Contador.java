package Aula34_01;

public class Contador {

	private static int contador;

	public static void incrementar() {
		contador++;
	}

	public static void zerar() {
		contador = 0;
	}

	public static int obterValor() {
		return contador;
	}

	public static void imprimirValor() {
		System.out.println(Contador.obterValor());
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Contador.contador = contador;
	}

}
