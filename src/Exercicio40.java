import java.util.Scanner;

public class Exercicio40 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	int i =0;
		while ( i <= 18) {
			System.out.println(i);
			i = i+3;
			scanner.close();
		}
	}
}

//Crie um aplicativo que mostre na tela a seguinte contagem:
//0 3 6 9 12 15 18 Acabou!