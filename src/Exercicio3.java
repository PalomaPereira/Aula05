import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * Antes da pandemia, o rod�zio na cidade de S�o Paulo foi motivo de confus�o em
		 * uma empresa: muitos dos 150 colaboradores est�o se atrasando e alegando que o
		 * problema foi o hor�rio do rod�zio. Cansado disso, um dos diretores da empresa
		 * solicitou um programa que receba o NOME de cada um dos funcion�rios, o SETOR
		 * desses profissionais e o meio de transporte usado (CARRO ou �NIBUS). Caso o
		 * profissional use um CARRO para ir at� a empresa, deve ser solicitada a
		 * digita��o do �ltimo d�gito num�rico da placa do carro e a mensagem exibida
		 * deve ser: �Seu dia de rod�zio � � seguida do dia de rod�zio. Caso o
		 * profissional use um �NIBUS para ir at� a empresa, deve ser exibida a mensagem
		 * �rod�zio n�o se aplica�. Final da placa Dia de rod�zio 1 e 2 segunda-feira 3
		 * e 4 ter�a-feira 5 e 6 quarta-feira 7 e 8 quinta-feira 9 e 0 sexta-feira
		 */

		Scanner leitor = new Scanner(System.in);

		// Onde 1� Nome / 2� Setor / 3� Transporte / 4� Placa
		String[][] colaborador = new String[150][4];
		String meiodetransporte = new String();

		/*
		 * String[] nome = new String[50]; String[] setor = new String[50]; String[]
		 * transporte = new String[50]; int placa;
		 */

		for (int i = 0; i < colaborador.length; i++) {

			System.out.println("Informe seu nome:");
			// nome[i] = leitor.next();
			colaborador[i][0] = leitor.next();

			System.out.println("Informe seu setor:");
			// setor[i] = leitor.next();
			colaborador[i][1] = leitor.next();

			System.out.println("Informe seu meio de transporte:");
			System.out.println("1 - Carro");
			System.out.println("2 - �nibus");
			// transporte[i] = leitor.next();
			colaborador[i][2] = leitor.next();

			// if (transporte[i].equalsIgnoreCase("�NIBUS") ||
			// transporte[i].equalsIgnoreCase("ONIBUS")) {
			if (colaborador[i][2].equals("2")) {
				System.out.println("Rod�zio n�o se aplica!");
				colaborador[i][3] = "NA";

			} else if (colaborador[i][2].equals("1")) {

				System.out.println("Informe o �ltimo d�gito num�rico da placa do carro:");
				// placa = leitor.nextInt();
				colaborador[i][3] = leitor.next();

				switch (colaborador[i][3]) {
				case "0":
					System.out.println("O seu rod�zio � na sexta-feira!");
					break;
				case "1":
					System.out.println("O seu rod�zio � na segunda-feira!");
					break;
				case "2":
					System.out.println("O seu rod�zio � na segunda-feira!");
					break;
				case "3":
					System.out.println("O seu rod�zio � na ter�a-feira!");
					break;
				case "4":
					System.out.println("O seu rod�zio � na ter�a-feira!");
					break;
				case "5":
					System.out.println("O seu rod�zio � na quarta-feira!");
					break;
				case "6":
					System.out.println("O seu rod�zio � na quarta-feira!");
					break;
				case "7":
					System.out.println("O seu rod�zio � na quinta-feira!");
					break;
				case "8":
					System.out.println("O seu rod�zio � na quinta-feira!");
					break;
				case "9":
					System.out.println("O seu rod�zio � na sexta-feira!");
					break;

				default:
					System.out.println("C�digo inv�lido! O Cadastro ir� recome�ar!");
					for (int coluna = 0; coluna < colaborador[0].length; coluna++) {
						colaborador[i][coluna] = "";
					}
					i--;
					break;
				}
			} else {
				System.out.println("C�digo inv�lido! O Cadastro ir� recome�ar!");
				for (int coluna = 0; coluna < colaborador[0].length; coluna++) {
					colaborador[i][coluna] = "";
				}
				i--;
			}

		}

		leitor.close();

		for (int j = 0; j < colaborador.length; j++) {

			if (colaborador[j][2].equals("1")) {
				meiodetransporte = "carro";
			} else {
				meiodetransporte = "�nibus";
			}

			System.out.println("O colaborador " + colaborador[j][0] + ", do setor " + colaborador[j][1] + ", vem de "
					+ meiodetransporte + ".");

		}
	}

}
