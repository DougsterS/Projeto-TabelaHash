package auxiliares;

public class Aluno {
	
	private int matricula;
	private int idade;
	private String nome;
	
	public Aluno(int matricula, String nome, int idade) {
		setMatricula(matricula);
		setNome(nome);
		setIdade(idade);
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
