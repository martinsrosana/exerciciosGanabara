import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe sua velocidade: ");
		float velocidade = scanner.nextFloat();

		float multa = (velocidade - 80) * 5;

		if (velocidade > 80) {
			System.out.println(" Sua velocidade é de " + velocidade+  "Km/h. Você foi multado em R$:" + String.format("%.2f", multa));
		} else {
			System.out.println("Parabéns você foi prudente e não teve nenhuma multa nesta viagem!");

			scanner.close();
		}
	}
}



//Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse 
//80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba 
//o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.