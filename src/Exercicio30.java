import java.util.Scanner;
public class Exercicio30 {

	public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);

			System.out.println("Informe o lado A: ");
			int ladoA = scanner.nextInt();
			System.out.println("Informe o lado B: ");
			int ladoB = scanner.nextInt();
			System.out.println("Informe o lado C: ");
			int ladoC = scanner.nextInt();

			if( (ladoA==ladoB) && (ladoB==ladoC) ){
				System.out.println("É possível formar um triângulo Equilátero!");
			} else if ( (ladoA!=ladoB) && (ladoA!=ladoC) && (ladoB!=ladoC) ) {
				System.out.println("É possível formar um triângulo Escaleno!");
			} else {
				System.out.println("É possível formar um triângulo Isósceles!");
				scanner.close();
			}

		}
	}


//Refaça o algoritmo 25, acrescentando o recurso de mostrar que tipo 
//de triângulo será formado: 
//- EQUILÁTERO: todos os lados iguais
//- ISÓSCELES: dois lados iguais
//- ESCALENO: todos os lados diferentes