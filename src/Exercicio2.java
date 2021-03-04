import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * Refazer o exerc�cio 08 usando FOR Um professor quer saber quantos alunos de
		 * uma sala de 50 tiveram nota maior do que a m�dia. Fa�a um programa onde o
		 * professor informe a m�dia e as notas de cada um dos 50 alunos e, ao final,
		 * seja exibido quantos alunos tiveram nota superior � m�dia e quantos tiveram
		 * nota inferior � m�dia.
		 */

		Scanner leitor = new Scanner(System.in);

		double media, nota;
		int notasup = 0, notainf = 0;

		System.out.println("Informe a m�dia da sala:");
		media = leitor.nextDouble();

		for (int i = 1; i <= 50; i++) {

			System.out.println("Informe a nota do " + i + "� Aluno:");

			nota = leitor.nextDouble();

			if (nota < media) {
				notainf++;
			} else {
				notasup++;
			}

		}

		leitor.close();

		System.out.println("Do total de 50 alunos, " + notainf + " tiveram notas abaixo da m�dia e " + notasup
				+ " tiveram notas acimas da m�dia.");
	}

}
