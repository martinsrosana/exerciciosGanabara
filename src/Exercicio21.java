import java.util.Calendar;
import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Informe o ano: ");
		int ano = scanner.nextInt ();
		 
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, ano);
		
		// se a quantidade de dias do ano for maior que 365, é bissexto
		System.out.println(cal.getActualMaximum(Calendar.DAY_OF_YEAR) > 365); // true
		
		
scanner.close();
	}

}
//Faça um algoritmo que leia um determinado ano e mostre se ele é ou não 
//BISSEXTO