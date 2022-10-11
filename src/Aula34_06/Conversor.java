package Aula34_06;

public class Conversor {

	public static int minutosParaSegundos(int minutos) {
		System.out.print("Um minuto: " + minutos + " convertidos em segundos: ");
		return minutos * 60;
	}

	public static int horasParaMinutos(int horas) {
		System.out.print("Uma hora: " + horas + " convertidas para minutos: ");
		return horas * 60;
	}

	public static int diasParaHoras(int dias) {
		System.out.print("Um dia: " + dias + " convertidos para horas: ");
		return dias * 24;
	}

	public static int semanasParaDias(int semanas) {
		System.out.print("Uma semana: " + semanas + " convertidas para dias: ");
		return semanas * 7;
	}

	public static int mesesParaDias(int meses) {
		System.out.print("Um mes: " + meses + " convertidos para dias: ");
		return meses * 30;
	}

	public static int anoParaDias(int ano) {
		System.out.print("Um ano: " + ano + " convertidos para dias: ");
		return (int) (ano * 365.25);
	}

}
