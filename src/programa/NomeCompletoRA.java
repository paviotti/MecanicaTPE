package programa;

import java.util.Scanner;

import entidades.Funileiro;
import entidades.Mecanico;
import entidades.Veiculo;

public class NomeCompletoRA {

	public static void main(String[] args) {
		int op = 0;
		Scanner sc = new Scanner(System.in);
		Veiculo veiculo = new Veiculo();
		Mecanico mecanico = new Mecanico();
		Funileiro funileiro = new Funileiro();
		/*
			System.out.println("0- Terminar programa");
			System.out.println("1- Mecânico concerta veículo");
			System.out.println("2- Funileiro concerta veículo");
			System.out.println("3- Exibir valor do concerto");
			System.out.println("4- Terminar concerto");
			System.out.println();
			
			System.out.print("Escolha a opção: ");
			op = sc.nextInt();
			sc.nextLine();
			*/
			System.out.print("Digite a placa do carro: ");
			String placa = sc.nextLine();
			veiculo.setPlaca(placa);
			mecanico.setVeiculo(veiculo);
			funileiro.setVeiculo(veiculo); //porque?

			System.out.print("Digite o nome do mecânico: ");
			String nomeMecanico = sc.nextLine();
			System.out.print("Digite o nome do funileiro: ");
			String nomeFunileiro = sc.nextLine();
			System.out.print("Digite o valor das horas trabalhada: ");
			double valorHora = sc.nextDouble();
			mecanico.setValorDaHora(valorHora);
			funileiro.setValorDaHora(valorHora);
			do {
				System.out.println("0- Terminar programa");
				System.out.println("1- Mecânico concerta veículo");
				System.out.println("2- Funileiro concerta veículo");
				System.out.println("3- Exibir valor do concerto");
				System.out.println("4- Terminar concerto");
				System.out.println();
				System.out.print("Escolha a opção: ");
				op = sc.nextInt();
				sc.nextLine();
			switch (op) {
			case 1: {// mecanico concerta
				mecanico.setNome(nomeMecanico);
				mecanico.consertar();
				System.out.print("Digite a quantidade de horas trabalhadas: ");
				int horasTrabalhadas = sc.nextInt();
				sc.nextLine();

				mecanico.registrarValor(horasTrabalhadas);
				veiculo.exibirValorDoConcerto();
				break;
			}
			case 2: {
				//funileiro concerta
				funileiro.setNome(nomeFunileiro);
				funileiro.consertar();  //erro
				System.out.print("Digite a quantidade de horas trabalhadas: ");
				int horasTrabalhadas = sc.nextInt();
				sc.nextLine();

				funileiro.registrarValor(horasTrabalhadas);
				veiculo.exibirValorDoConcerto();
				
				break;
			}
			case 3: {
				//exibe o valor do concerto
				System.out.println("Valor do concerto: " + String.format("%.2f",veiculo.getValorDoConcerto()));

				break;
			}
			case 4: {
				//termina o concerto
				veiculo.setValorDoConcerto(0.0);
				break;
			}
			}
		} while (op != 0);

		sc.close();
	}

}
