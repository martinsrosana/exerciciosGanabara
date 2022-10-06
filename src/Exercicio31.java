import java.util.Random;
import java.util.Scanner;

public class Exercicio31 {
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numeroUsuario = 0;
		int escolhaComputador= 0;
		int pontosUsuario = 0;
		int pontosComputador = 0;
		for (int i = 0; i < 5; i++) {

		
		System.out.println("Faça sua escolha de 1 a 3: [1]Pedra [2] Papel [3] tesoura");
		numeroUsuario = scanner.nextInt();

		Random aleatorio = new Random();
		 escolhaComputador = aleatorio.nextInt(3) + 1;
		
			switch (escolhaComputador) {
			case 1:
				System.out.println("O computador escolheu Pedra");
				break;
			case 2:
				System.out.println("O computador escolheu Papel");
				break;
			case 3:
				System.out.println("O computador escolheu Tesoura");
				break;
			}

			if (numeroUsuario == escolhaComputador) {
				System.out.println("Empate!");
			} else if ((numeroUsuario - escolhaComputador == -1) || (numeroUsuario - escolhaComputador == 2)) {
				System.out.println("Você venceu a partida!!!");
				pontosUsuario++;
			} else {
				System.out.println("Computador venceu a partida!!!");
				pontosComputador++;
			}

		}
		if (pontosUsuario > pontosComputador) {
			System.out.println("Você venceu o jogo! Com " + pontosUsuario + " pontos.");
		} else if (pontosComputador > pontosUsuario) {
			System.out.println("Computador venceu o jogo!Com " + pontosComputador + " pontos.");
		} else {
			System.out.println("O jogo empatou!");
		
			scanner.close();
		}
		
	}

}
