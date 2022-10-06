import java.util.Random;
import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um número de 1 a 5.");
			int palpite = scanner.nextInt();
			Random aleatorio = new Random();
			int numeroSorteado = aleatorio.nextInt(5) + 1;

		
			if (palpite == numeroSorteado) {
				System.out.println("Parabéns você acertou! O numero sorteado foi : " + numeroSorteado);
			} else {
				System.out.println("Você errou o número sorteado foi:  " + numeroSorteado + " e você escolheu o número "
						+ palpite);
			}
		}scanner.close();

	}
}

//Crie um jogo onde o computador 
//vai sortear um número entre 1 e 5 o 
//jogador vai tentar descobrir qual foi o valor sorteado