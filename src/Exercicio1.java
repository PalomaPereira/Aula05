import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * Receba um número inteiro do usuário e calcule e exiba a tabuada deste número
		 */

		Scanner leitor = new Scanner(System.in);
		int numero, multiplicacao;

		System.out.println("Entre com um número:");
		numero = leitor.nextInt();

		System.out.println("A tabuada deste número é:");

		for (int i = 1; i <= 10; i++) {
			multiplicacao = numero * i;
			System.out.println(numero + " x " + i + " = " + multiplicacao);
		}

		leitor.close();

	}

}
