import java.util.Scanner;

public class Exercicio41 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int i = 100;
		while (i > 0) {
			System.out.println(i);
			i = i - 5;

//		for (int i= 100; i>=0; i -=5) {
//			System.out.println(" Lista: " + i);
//		}
//		
//		System.out.print("Acabou a contagem!! ");
			scanner.close();
		}
	}
}

//Desenvolva um programa que mostre na tela a seguinte contagem:
//100 95 90 85 80 ... 0 Acabou