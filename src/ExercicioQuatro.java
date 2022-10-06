import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Vamos somar?");
		System.out.println("Informe um número");
		int primeiroNumero = scanner.nextInt();
		System.out.println("Informe outro número");
		int segundoNumero= scanner.nextInt();
	
		int soma = primeiroNumero+segundoNumero;
		System.out.println(" O resultado do calculo é: " +soma);
	
		scanner.close();
	}

}
//Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório 
//entre eles.
//Ex:
//Digite um valor: 8
//Digite outro valor: 5
//A soma entre 8 e 5 é igual a 13