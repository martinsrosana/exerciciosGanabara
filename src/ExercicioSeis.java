import java.util.Scanner;

public class ExercicioSeis {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int numero = scanner.nextInt();
		
		int antecessor = numero - 1;
		int sucessor = numero + 1;
		
		System.out.println( "O antecessor de " + numero + " é " +antecessor);
		System.out.println("O antecessor de " + numero + " é " +sucessor);

		scanner.close();
	}

	
	}


//Faça um programa que leia um número inteiro e mostre o seu antecessor e seu 
//sucessor.
//Ex: 
//Digite um número: 9
//O antecessor de 9 é 8
//O sucessor de 9 é 10