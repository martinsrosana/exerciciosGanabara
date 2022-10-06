import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);

	System.out.println("Digite o primeiro número: ");
	int primeiroNumero = scanner.nextInt();
		
	System.out.println("Digite o segundo número: ");
	int segundoNumero = scanner.nextInt();
	
	if (primeiroNumero == segundoNumero) {
		System.out.println("Os números são iguais");
	}else if (primeiroNumero > segundoNumero) {
		System.out.println("O primeiro número é maior que o segundo");
	}else {
		System.out.println("O segundo número é maior que o primeiro");
	}
	scanner.close();
	}

}
//Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando
//na tela uma das mensagens abaixo:
// - O primeiro valor é o maior
// - O segundo valor é o maior
// - Não existe valor maior, os dois são iguais