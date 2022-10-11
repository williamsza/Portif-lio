package Aula34_06;

public class Teste {

	public static void main(String[] args) {
		mostrarTela(Conversor.minutosParaSegundos(1));
		mostrarTela(Conversor.horasParaMinutos(1));
		mostrarTela(Conversor.diasParaHoras(1));
		mostrarTela(Conversor.semanasParaDias(1));
		mostrarTela(Conversor.mesesParaDias(1));
		mostrarTela(Conversor.anoParaDias(1));

	}

	static void mostrarTela(int num) {
		System.out.println(num);
	}
}
