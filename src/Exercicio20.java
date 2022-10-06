import java.util.Scanner;

public class Exercicio20 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(" Informe um numero: ");
		int numero = scanner.nextInt();

		if (numero % 2 == 0) {
			System.out.println("O número " + numero + " é Par.");
		} else
		System.out.println("O número " + numero + " é Impar.");

		scanner.close();
	}
}
