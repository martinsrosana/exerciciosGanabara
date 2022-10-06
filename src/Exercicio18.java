import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Qual ano você nasceu?  ");
		int anoNascimento = scanner.nextInt();
		
		int anoAtual = 2022;
		int idade = anoAtual - anoNascimento;
		
		if ( idade >= 16) {
			System.out.println("Você tem " + idade+ " anos e está apto a tirar seu titulo de eleitor e exercer seu direito ao voto.");
		} else {
			System.out.println("Você tem " + idade +  " anos e ainda não tem idade para exercer o direito ao voto.");
		}
		
		scanner.close();
	}

}
// leia o ano de nascimento de uma pessoa, calcule a idade 
//dela e depois mostre se ela pode ou não votar