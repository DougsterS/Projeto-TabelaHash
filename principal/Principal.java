package principal;

import java.util.Scanner;

import auxiliares.Texto;

public class Principal {
	
	public static void main(String[] args) {
		Texto m = new Texto();
		Operacoes op = new Operacoes();
		int option = 0;
		Scanner leitor = new Scanner(System.in);

		while (option == 0) {
			m.menuPrincipal();
			option = leitor.nextInt();
			
			switch(option) {
			case 1:
				op.adicaoAluno();
				m.continuar();
				option = leitor.nextInt();
			break;
			
			case 2:
				op.procurarAluno();
				m.continuar();
				option = leitor.nextInt();
			break;
			
			case 3:
				op.removerAluno();
				m.continuar();
				option = leitor.nextInt();
			break;
			
			case 4:
				op.exibir();
				option = 0;
			break;
			
			case 5:
				m.equipe();
				option=0;
			break;
			
			case 6:
				System.out.println("Obrigado por utilizar nossos servicos");
			break;
			
			default:
				System.out.println("O valor inserido nao corresponde a nenhuma das opcoes\nPor favor, insira um valor válido");
				option=0;
			}
		}
	}
}
