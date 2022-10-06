import java.util.Scanner;

public class Exercicio39 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int i= 10; i>=3; i --) {
			System.out.println(" Lista: " + i);
		}
		
		System.out.print("Acabou a contagem!! ");
		scanner.close();
    }    
}
//Faça um algoritmo que mostre na tela a seguinte contagem:
//10 9 8 7 6 5 4 3 Acabou!