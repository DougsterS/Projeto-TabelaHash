package auxiliares;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TabelaHash {
	
	private final int M=11;
	
	public TabelaHash() {
		super();
		for(int i=0;i<M;i++) {
			this.tabelaHash.add(new LinkedList<Aluno>());
		}
	}
	
	private ArrayList<LinkedList> tabelaHash = new ArrayList<LinkedList>(M);
	
	public int funcaoHash(int codigo) {
		return codigo%M;
	}
	
	public boolean insert(Aluno aluno) {
		List<Aluno> listinha;
		listinha = this.tabelaHash.get(funcaoHash(aluno.getMatricula()));
		for(Aluno estudante : listinha) {
			if(estudante.getMatricula() == aluno.getMatricula()) {
				System.out.println("Nao foi possivel adicionar este aluno, pois\nesta matricula ja esta cadastrada");
				return false;
			}
		}
		listinha.add(aluno);
		System.out.println("Aluno " + aluno.getNome() + " Cadastrado com sucesso");
		return true;
	}
	
	public void exibicao() {
		for  (int i =0 ; i< M;i++) {
			LinkedList<Aluno> estudante = tabelaHash.get(i);
			for (Aluno aluno: estudante) {
				System.out.println("//"+i+"//" + "Matricula: " + aluno.getMatricula() + " Nome: " + aluno.getNome() + " Idade: " + aluno.getIdade());
			}
		}
	}
	
	public boolean remocao(int codigo) {
		List<Aluno> listinha;
		listinha=this.tabelaHash.get(funcaoHash(codigo));
		for(Aluno estudante : listinha) {
			if(estudante.getMatricula()==codigo) {
				System.out.println(estudante.getNome() + " removido do Sistema");
				listinha.remove(estudante);
				return true;
			}
		}
		System.out.println("Essa matricula nao esta listada no sistema");
		return false;
	}
	
	public void buscarAluno(int codigo) {
		List<Aluno> listinha;
		listinha=tabelaHash.get(funcaoHash(codigo));
		for(Aluno estudante:listinha) {
			if(estudante.getMatricula() == codigo) {
				System.out.println("O estudante correspondente a esse numero de matricula e:");
				System.out.println("Matricula: " + estudante.getMatricula());
				System.out.println("Nome: " + estudante.getNome());
				System.out.println("Idade: " + estudante.getIdade());
				return ;
			} 
		}
		System.out.println("Essa matricula nao corresponde a nenhum aluno cadastrado");
	}
}
