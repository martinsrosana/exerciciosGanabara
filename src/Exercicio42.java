import java.util.Scanner;

public class Exercicio42 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um número inteiro e positivo: ");
		int valor = scanner.nextInt();
//		int i= valor;
//		for(i = 1; i<=valor;i++ )
//			System.out.println(i);
//		int i =valor;
		while (valor <= valor) {
			System.out.println(valor);
			valor = valor++;

		}

	}
}

//Faça um algoritmo que pergunte ao usuário um número inteiro e positivo 
//qualquer e mostre uma contagem até esse valor:
//Ex: Digite um valor: 35
//Contagem: 1 2 3 4 5 6 7 ... 33 34 35 Acabou!