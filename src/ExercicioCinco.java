import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Qual a Disciplina?");
		String materia = scanner.nextLine();
		System.out.print("Informe a nota da primeira prova: ");
		double primeiraProva = scanner.nextDouble();
		System.out.print("Informe a nota da segunda prova: ");
		double segundaProva = scanner.nextDouble();
		
		double soma = (primeiraProva+segundaProva) / 2;
		System.out.println("A média entre as notas " + primeiraProva+ " e " +segundaProva+ " da disciciplina " +materia+ " é igual a: " +soma );

		scanner.close();
	}

}
//leia as duas notas de um aluno em uma matéria e mostre 
//na tela a sua média na disciplina.
//Ex: 
//Nota 1: 4.5
//Nota 2: 8.5
//A média entre 4.5 e 8.5 é igual a 6.5