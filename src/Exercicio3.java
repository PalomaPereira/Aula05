import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * Antes da pandemia, o rodízio na cidade de São Paulo foi motivo de confusão em
		 * uma empresa: muitos dos 150 colaboradores estão se atrasando e alegando que o
		 * problema foi o horário do rodízio. Cansado disso, um dos diretores da empresa
		 * solicitou um programa que receba o NOME de cada um dos funcionários, o SETOR
		 * desses profissionais e o meio de transporte usado (CARRO ou ÔNIBUS). Caso o
		 * profissional use um CARRO para ir até a empresa, deve ser solicitada a
		 * digitação do último dígito numérico da placa do carro e a mensagem exibida
		 * deve ser: “Seu dia de rodízio é “ seguida do dia de rodízio. Caso o
		 * profissional use um ÔNIBUS para ir até a empresa, deve ser exibida a mensagem
		 * “rodízio não se aplica”. Final da placa Dia de rodízio 1 e 2 segunda-feira 3
		 * e 4 terça-feira 5 e 6 quarta-feira 7 e 8 quinta-feira 9 e 0 sexta-feira
		 */

		Scanner leitor = new Scanner(System.in);

		String[] nome = new String[50];
		String[] setor = new String[50];
		String[] transporte = new String[50];
		int placa;

		for (int i = 1; i <= 4; i++) {

			System.out.println("Informe seu nome:");
			nome[i] = leitor.next();

			System.out.println("Informe seu setor:");
			setor[i] = leitor.next();

			System.out.println("Informe seu meio de transporte (CARRO ou ÔNIBUS):");
			transporte[i] = leitor.next();

			if (transporte[i].equalsIgnoreCase("ÔNIBUS") || transporte[i].equalsIgnoreCase("ONIBUS")) {

				System.out.println("Rodízio não se aplica!");

			} else {

				System.out.println("Informe o último dígito numérico da placa do carro:");
				placa = leitor.nextInt();

				switch (placa) {
				case 0:
					System.out.println("O seu rodízio é na sexta-feira!");
					break;
				case 1:
					System.out.println("O seu rodízio é na segunda-feira!");
					break;
				case 2:
					System.out.println("O seu rodízio é na segunda-feira!");
					break;
				case 3:
					System.out.println("O seu rodízio é na terça-feira!");
					break;
				case 4:
					System.out.println("O seu rodízio é na terça-feira!");
					break;
				case 5:
					System.out.println("O seu rodízio é na quarta-feira!");
					break;
				case 6:
					System.out.println("O seu rodízio é na quarta-feira!");
					break;
				case 7:
					System.out.println("O seu rodízio é na quinta-feira!");
					break;
				case 8:
					System.out.println("O seu rodízio é na quinta-feira!");
					break;
				case 9:
					System.out.println("O seu rodízio é na sexta-feira!");
					break;

				default:
					break;
				}
			}

		}

		leitor.close();
	}

}
