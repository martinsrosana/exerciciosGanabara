import java.util.Scanner;

public class Exerciciosete {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        System.out.println("Digite um número: ");
        double numero = scanner.nextDouble();
        
        double dobro = numero * 2;
        System.out.println("O dobro do número " + numero+ " é : " + dobro);
        
        double tercaParte = numero / 3;
        System.out.printf("A terça parte do número %f é : %.4f ",  numero , tercaParte);
		
		scanner.close();
	}

}

//leia um número real e mostre na tela o seu dobro e a 
//sua terça parte.
//Ex: 
//Digite um número: 3.5
//O dobro de 3.5 é 7.0
//A terça parte de 3.5 é 1.16666