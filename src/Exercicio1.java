import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * Receba um n�mero inteiro do usu�rio e calcule e exiba a tabuada deste n�mero
		 */

		Scanner leitor = new Scanner(System.in);
		int numero, multiplicacao;

		System.out.println("Entre com um n�mero:");
		numero = leitor.nextInt();

		System.out.println("A tabuada deste n�mero �:");

		for (int i = 1; i <= 10; i++) {
			multiplicacao = numero * i;
			System.out.println(numero + " x " + i + " = " + multiplicacao);
		}

		leitor.close();

	}

}
