import java.util.Scanner;

public class Exercicio35 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Qual tipo de carro deseja alugar? "
				+ "[1]carroPopular ou [2] carroDeLuxo");
		double tipoCarro = scanner.nextDouble();

		System.out.println("Quantos dias de aluguel?");
		double dias = scanner.nextDouble();

		System.out.println("Quantos km percorridos?");
		double kmPercorrido = scanner.nextDouble();

		double carroPopular = (dias * 90);
		double taxa100Km = (kmPercorrido * 0.10);
		double taxaPopAcima100Km = (kmPercorrido * 0.20);
		double calculo100KmPopular = carroPopular + taxa100Km;
		double calculoPopAcima100Km = carroPopular + taxaPopAcima100Km;

		double carroDeLuxo = (dias * 150);
		double taxa200Km = (kmPercorrido * 0.30);
		double taxaLuxoAcima200Km = (kmPercorrido * 0.25);
		double calculo200KmLuxo = carroDeLuxo + taxa200Km;
		double calculoLuxoAcima200Km = carroDeLuxo + taxaLuxoAcima200Km;

		if ((kmPercorrido <= 100) && (tipoCarro == 1)) {
			System.out.printf("Você optou por um carro Popular e percorreu " +kmPercorrido + " Km. O valor do aluguel será de R$ %.2f", calculo100KmPopular);
		} else if ((kmPercorrido > 100) && (tipoCarro == 1)) {
			System.out.printf("Você optou por um carro Popular e percorreu " +kmPercorrido + " Km. O valor do aluguel será de R$ %.2f", calculoPopAcima100Km );
		} else if ((kmPercorrido < 200) && (tipoCarro == 2)) {
			System.out.printf("Você optou por um carro de Luxo e percorreu " +kmPercorrido + " Km. O valor do aluguel será de R$ %.2f", calculo200KmLuxo);
		} else if ((kmPercorrido < 200) && (tipoCarro == 2)) {
			System.out.printf("Você optou por um carro de Luxo e percorreu " +kmPercorrido + " Km. O valor do aluguel será de R$ %.2f", calculoLuxoAcima200Km);
			scanner.close();
		} else {
			System.out.println("Escolha um tipo de carro válido!");
		}
	}

}

//Uma empresa de aluguel de carros precisa cobrar pelos seus serviços. O 
//aluguel de um carro custa R$90 por dia para carro popular e R$150 por dia para 
//carro de luxo. Além disso, o cliente paga por Km percorrido. Faça um programa
//que leia o tipo de carro alugado (popular ou luxo), quantos dias de aluguel e 
//quantos Km foram percorridos. No final mostre o preço a ser pago de acordo com a 
//tabela a seguir:
// - Carros populares (aluguel de R$90 por dia)
// - Até 100Km percorridos: R$0,20 por Km
// - Acima de 100Km percorridos: R$0,10 por Km
// - Carros de luxo (aluguel de R$150 por dia)
// - Até 200Km percorridos: R$0,30 por Km
// - Acima de 200Km percorridos: R$0,25 por Km