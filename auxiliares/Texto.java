package auxiliares;
/**
 * 
 * @author douglas.justino
 *
 */

import java.util.Scanner;

public class Texto {
	
	public void menuPrincipal() {		
		System.out.println("\n\n/////////////////////////\n" + "      Menu Principal     \n" + 
		"/////////////////////////\n\n");
		System.out.println("1 - Inserir Novo Aluno");
		System.out.println("2 - Buscar Aluno");
		System.out.println("3 - Remover Aluno");
		System.out.println("4 - Exibir Tabela Hash");
		System.out.println("5 - Equipe Responsável");
		System.out.println("6 - Encerrar Sistema");
		System.out.print("Selecione uma opção: ");
	}
	
	public void continuar() {
		System.out.println("O que deseja fazer agora?");
		System.out.println("0 - Menu Principal");
		System.out.println("1 - Sair da Aplicacao");
	}
	
	public void equipe() {
		System.out.println("Projeto idealizado por:\n1710017920 - Douglas A.M.A Justino\n1710018255 - Karoline Lyra de Vasconcelos");
	}

}
