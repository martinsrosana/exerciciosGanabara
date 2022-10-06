import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double valorImovel = 0;
		double salario = 0;
		int anos = 0;

			System.out.println("_________Simulador de Financiamento de imóvel____________");
			System.out.println("Qual o valor do imóvel ?");
			valorImovel = scanner.nextDouble();

			System.out.println("Qual sua renda mensal?");
			salario = scanner.nextDouble();

			System.out.println();
			System.out.println("Em quantos anos você irá quitar");
			anos = scanner.nextInt();
	
		scanner.close();
		double calculo = salario*0.3;
		double tempo = anos * 12;
		double parcelaMensal = (valorImovel / tempo);

		if ((parcelaMensal <= calculo)) {
			System.out.println("A prestação do seu imóvel financiado em " 
		+ anos + " anos. Será de R$ " + String.format("%.2f", parcelaMensal));

		} else {
			System.out.println("O valor da parcela seria de R$" + String.format("%.2f", parcelaMensal)
					+ " . Você não pode financiar este imóvel pois excede 30% da sua renda mensal");
		}
	}

}


//Escreva um programa para aprovar ou não o empréstimo bancário para a compra 
//de uma casa. O programa vai perguntar o valor da casa, o salário do comprador e 
//em quantos anos ele vai pagar. Calcule o valor da prestação mensal, sabendo que 
//ela não pode exceder 30% do salário ou então o empréstimo será negado.

//Para calcular o valor dos juros em uma das parcelas, faça as contas:
//
//Se a taxa de juros que consta em seu contrato é de 8% ao ano, 
//para saber a taxa mensal, dividimos 8 por 12. 
//Portanto, serão juros mensais de 0,67%
//Imaginemos que o saldo devedor em aberto é de R$ 100 mil.
//O valor dos juros na correspondente prestação mensal será: 
//R$ 100 mil x 0,0067 (o equivalente em decimais ao percentual da taxa). 
//Portanto, são R$ 670 de juros na parcela
//É importante lembrar que a maioria das operações de 
//financiamento imobiliário designa no contrato um índice de correção 
//(Taxa Referencial ou IPCA). Nesses casos, 
//o saldo devedor será mensalmente atualizado, multiplicado por esses índices 