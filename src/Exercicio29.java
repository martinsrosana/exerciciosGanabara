import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner (System.in);
		
		System.out.println("Qual seu nome?");
		String nome = scanner.next();
		System.out.println();
		
		System.out.println("Qual seu salário?");
		double salario = scanner.nextDouble();
		
		System.out.println("Quantos anos você trabalha na empresa?");
		double anosEmpresa = scanner.nextDouble();
		
		double salarioReajustado;
		
		scanner.close();
		if (anosEmpresa <=3) {
			salarioReajustado = (salario * (1 + 0.03));
			System.out.println(  nome + " seu salário reajustado será de R$ " + String.format("%.2f", salarioReajustado));
		} else if ((anosEmpresa >4) && (anosEmpresa <10)) {
			salarioReajustado = (salario * (1 + 0.125));
			System.out.println( nome + " seu salário reajustado será de R$ " + String.format("%.2f", salarioReajustado) );
		} else {
			salarioReajustado = (salario * (1 + 0.20));
			System.out.println( nome + " seu salário reajustado será de R$ " + String.format("%.2f", salarioReajustado));
	}
		
		
	}

}
//Desenvolva um programa que leia o nome de um funcionário, seu salário, 
//quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de 
//acordo com a tabela a seguir:
// - Até 3 anos de empresa: aumento de 3%
// - entre 3 e 10 anos: aumento de 12.5%
// - 10 anos ou mais: aumento de 20%