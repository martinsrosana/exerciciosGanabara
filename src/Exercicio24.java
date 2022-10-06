import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
	Scanner scanner	= new Scanner (System.in);
	System.out.println(" Qual a distância que você deseja percorrer em Km: ");
	double distancia = scanner.nextDouble();
	
	double passagemEconomica = distancia * 0.50; 
	double passagemNormal = distancia * 0.45;
	
	if (distancia <= 200) {
		
		System.out.println(" Você optou por um destino econômico, o valor da sua passagem é de R$ " 
		+ String.format("%.2f", passagemEconomica));
		
	} else {
		System.out.println(" Você optou por um destino com preços normais, o valor da sua passagem é de R$ " 
				+ String.format("%.2f", passagemNormal));
	}
	scanner.close();
		
	}

}
//Faça um algoritmo que pergunte a distância que um passageiro deseja
//percorrer em Km. Calcule o preço da passagem, cobrando R$0.50 por Km para
//viagens até 200Km e R$0.45 para viagens mais longas.