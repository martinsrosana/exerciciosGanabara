import java.util.Scanner;

public class Exercício37 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	
	System.out.println("_____________Reajuste Salário Anual________________");
	

	System.out.println();
	System.out.println("Qual seu salario atual?");
	int salarioAtual = scanner.nextInt();
	
	System.out.println("Qual genero você se identifica? [1]Feminino [2]Masculino");
	int genero = scanner.nextInt();
	
	System.out.println("Quantos anos você trabalha na empresa? ");
	int tempo = scanner.nextInt();
	scanner.close();
	
	switch (genero) {
	case 1:
		if(tempo<= 15) {
		double femAteQuinzeAnos = (salarioAtual *0.5) + salarioAtual;
			System.out.println("Você tem " + tempo+ " anos de empresa e seu novo salário "
					+ "será de R$" + String.format("%.2f",femAteQuinzeAnos ));
			break;
		}else if (tempo>=16 && tempo<=20) {
			double femAteVinteAnos = (salarioAtual *0.12)+ salarioAtual;
			System.out.println("Você tem " + tempo+ " anos de empresa e seu novo salário "
					+ "será de R$" + String.format("%.2f",femAteVinteAnos ));
			break;
			
		}else{
			
			double femMaisVinteAnos = (salarioAtual *0.23) + salarioAtual;
			System.out.println("Você tem " + tempo+ " anos de empresa e seu novo salário "
					+ "será de R$" + String.format("%.2f", femMaisVinteAnos ));
			break;
		}
			
		case 2:
			
			if(tempo<= 19) {
			double mascMenosVinteAnos = (salarioAtual * 0.3) + salarioAtual;
				System.out.println("Você tem " + tempo+ " anos de empresa e seu novo salário "
						+ "será de R$" + String.format("%.2f",mascMenosVinteAnos ));
				break;
			}else if (tempo>=20 && tempo<=30) {
				double mascAcimaVinteAnos = (salarioAtual * 0.13) + salarioAtual;
				System.out.println("Você tem " + tempo+ " anos de empresa e seu novo salário "
						+ "será de R$" + String.format("%.2f",mascAcimaVinteAnos));
				break;
			}
			else{
				double mascmaisTrintaAnos = (salarioAtual *0.25) + salarioAtual;
				System.out.println("Você tem " + tempo+ " anos de empresa e seu novo salário "
						+ "será de R$" + String.format("%.2f", mascmaisTrintaAnos));
			
				}
			}
		}
}
//Uma empresa precisa reajustar o salário dos seus funcionários, dando um 
//aumento de acordo com alguns fatores. Faça um programa que leia o salário atual, 
//o gênero do funcionário e há quantos anos esse funcionário trabalha na empresa. 
//No final, mostre o seu novo salário, baseado na tabela a seguir:
//- Mulheres
// - menos de 15 anos de empresa: +5%
// - de 15 até 20 anos de empresa: +12%
// - mais de 20 anos de empresa: +23%
//- Homens
// - menos de 20 anos de empresa: +3%
// - de 20 até 30 anos de empresa: +13%
// - mais de 30 anos de empresa: +25%