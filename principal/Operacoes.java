package principal;

import java.util.Scanner;

import auxiliares.Aluno;
import auxiliares.TabelaHash;

public class Operacoes {
	
	private TabelaHash rexi = new TabelaHash();
	
	public void adicaoAluno() {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Por favor, insira a matricula do aluno:");
		int matricula = leitor.nextInt();
		leitor.nextLine();
		System.out.println("Por favor, insira o nome do aluno:");
		String nome = leitor.nextLine();
		System.out.println("Por favor, insira a idade do aluno:");
		int idade = leitor.nextInt();
		this.rexi.insert(new Aluno(matricula,nome,idade));
	}
	
	public void exibir() {
		System.out.println("--Listagem de Alunos Cadastrados--");
		this.rexi.exibicao();
	}
	
	public void removerAluno() {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe, por favor, qual a matricula do aluno\nque deve ser removido do sistema:");
		int matricula = leitor.nextInt();
		this.rexi.remocao(matricula);
	}
	
	public void procurarAluno() {
		Scanner leitor = new Scanner(System.in);
		System.out.println("--Guia de Busca--");
		System.out.println("Por favor, informe a matricula que deseja averiguar:");
		int matricula = leitor.nextInt();
		this.rexi.buscarAluno(matricula);
		
	}

}
