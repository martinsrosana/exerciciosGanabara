import java.util.Scanner;

public class ExercicioOito {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("________ CONVERSOR DE DISTÂNCIA __________ ");
		System.out.println("Informe uma distância em metros: ");
		double  mts = scanner.nextDouble();

		double km = mts / 1000;
		double  hm = mts / 100;
		double  dam = mts / 10;
		double  dm = mts * 10;
		double cm = mts * 100;
		double  mm = mts * 1000;

		System.out.println(" A distância de " + mts+ " metros em Quilômetros é: " + String.format("%.2f", km));
		
		System.out.println(" A distância de " + mts+ " metros em Hectômetros é: " + String.format("%.2f", hm));
	    
	    System.out.println(" A distância de " + mts+ " metros em Decâmetros é: " + String.format("%.2f", dam));
	    
	    System.out.println(" A distância de " + mts+ " metros em Decímetros é: " + String.format("%.2f", dm));
	 
	    System.out.println(" A distância de " + mts+ " metros em Centímetros é: " + String.format("%.2f", cm));

	    System.out.println(" A distância de " + mts+ " metros em Milímetros é: " + String.format("%.2f", mm));
	    
	    
		scanner.close();
	}

}
//Desenvolva um programa que 
//leia uma distância em metros e mostre os valores 
//relativos em outras medidas.
//Ex: 
//Digite uma distância em metros: 185.72
//A distância de 85.7m corresponde a:
//0.18572Km
//1.8572Hm
//18.572Dam
//1857.2dm
//18572.0cm
//185720.0mm

