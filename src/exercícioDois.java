import java.util.Scanner;

public class exercícioDois {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Declarando uma variavel do tipo Usuario
		Usuario usuarioInstanciado;
		//instanciar um novo objeto:
		usuarioInstanciado = new Usuario();//parenteses chama aqui o construtor
		
		System.out.println("Qual o seu nome?" );
		usuarioInstanciado.nome = scanner.nextLine();
		System.out.printf("Olá, "+ usuarioInstanciado.nome + " é um prazer te conhecer!");

		scanner.close();
	}

}
