import java.util.Scanner;

public class Exercicio22 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Informe o ano de nascimento: ");
		int anoNascimento = scanner.nextInt();
		int anoAtual = 2022;
		
		int idade = anoAtual - anoNascimento;
		int anoParaAlistar = (18 - idade);
		int anoPassaramAlistar = (idade - 18);
		
		if(idade == 18) { 
			System.out.println("Este ano você deve se alistar!");
			
		} else if (idade < 18) {
			System.out.println(" Falta " +anoParaAlistar + " anos para se alistar!");
			
		} else if (idade > 18) {
			System.out.println(" Passaram  " +anoPassaramAlistar + " anos da sua data de alistamento");
		}
		
		scanner.close();
	}

}



//Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua 
//situação em relação ao alistamento militar.
// - Se estiver antes dos 18 anos, mostre em quantos anos faltam para o 
//alistamento.
// - Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do 
//alistamento.
