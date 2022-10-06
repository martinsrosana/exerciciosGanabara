import java.util.Scanner;
public class Exercicio19 {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Informe a nota da primeira prova: ");
			double primeiraProva = scanner.nextDouble();
			System.out.print("Informe a nota da segunda prova: ");
			double segundaProva = scanner.nextDouble();
			
			double media = (primeiraProva+segundaProva) / 2;
			System.out.println("A média entre as notas " + primeiraProva+ " e " +segundaProva+ " é igual a: " +media );

			if ((media>= 7) && (media <=10)) {
				System.out.println("O aluno teve um excelente aproveitamento e foi aprovado");
			}else if ( (media >=5) && (media <=6)) {
				System.out.println("Aluno com média de : " + media+ " , em Recuperação.");
			}
			else {
				System.out.println("Aluno Reprovado");
			}
			scanner.close();
		}
	}

//Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua 
//média e mostre na tela. No final, analise a média e mostre se o aluno teve ou 
//não um bom aproveitamento (se ficou acima da média 7.0)