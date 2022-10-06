import java.util.Scanner;

public class Exercicio23 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("____________Desconto da Semana das mulheres____________");

		System.out.println("Nome do cliente: ");
		String nome = scanner.nextLine();

		System.out.println();
		System.out.println(" Sexo: [1] Feminino [2] Masculino");
		int sexo = scanner.nextInt();

		System.out.println();
		System.out.println(" Valor total das compras R$: ");
		double compras = scanner.nextDouble();
		
		double descontof = (compras / 100) * 13;
		double faturaf = compras - descontof;
		double descontom = (compras / 100) * 5;
		double faturam = compras - descontom;
		
		if (sexo == 1) {
			System.out.println (nome + ", você teve um desconto de R$  " 
			+ descontof + ", sua fatura será de R$ " + faturaf);
			
		} else {
			System.out.println(nome + ", você teve um desconto de R$  " 
			+ descontom + ", sua fatura será de R$ " + faturam);

		}

		scanner.close();
	}
}

//Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos 
//para todos, mas especialmente para mulheres. Faça um programa que leia nome, 
//sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo 
//que:
//- Homens ganham 5% de desconto
//- Mulheres ganham 13% de desconto