import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe a largura do terreno em metros: ");
		int largura = scanner.nextInt();
		if (largura <= 0) {
			System.out.println("Esse número não é válido, digite outro");
		} else {
			System.out.println("Qual o comprimento do terreno?");

			System.out.println("Informe o comprimento do terreno em metros: ");
			int comprimento = scanner.nextInt();
			if (comprimento <= 0) {
				System.out.println("Esse número não é válido, digite outro");
			} else {

				int tamanhoTerreno = (largura * comprimento);
				scanner.close();
				if ((tamanhoTerreno >= 4) && (tamanhoTerreno < 100)) {
					System.out.println("O terreno tem " + tamanhoTerreno + " metros e é Popular!");
				} else if ((tamanhoTerreno >= 100) && (tamanhoTerreno <= 500)) {
					System.out.println("O terreno tem " + tamanhoTerreno + " metros e é Master!");
				} else {
					System.out.println("O terreno tem " + tamanhoTerreno + " metros e é Vip!");
				}
			}

		}

	}
}

//Faça um programa que leia a largura e o comprimento de um terreno 
//retangular, calculando e mostrando a sua área em m². O programa também 
//devemostrar a classificação desse terreno, de acordo com a lista abaixo:
//- Abaixo de 100m² = TERRENO POPULAR
//- Entre 100m² e 500m² = TERRENO MASTER
//- Acima de 500m² = TERRENO VIP