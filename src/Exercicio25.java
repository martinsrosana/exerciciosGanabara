import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o lado A: ");
		int ladoA = scanner.nextInt();
		System.out.println("Informe o lado B: ");
		int ladoB = scanner.nextInt();
		System.out.println("Informe o lado C: ");
		int ladoC = scanner.nextInt();

		if ((ladoA < (ladoB + ladoC)) && (ladoB < (ladoA + ladoC)) && (ladoC < (ladoA + ladoB))) {
			System.out.println("É possível formar um triângulo!");
		} else {
			System.out.println("NÃO é possível formar um triângulo!");
		}

	}
}
