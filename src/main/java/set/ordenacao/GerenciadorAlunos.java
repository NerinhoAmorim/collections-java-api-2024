package main.java.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
	private Set<Aluno> alunoSet;

	public GerenciadorAlunos() {
		this.alunoSet = new HashSet<>();
	}

	public void adicionarAluno(String nome, Long matricula, double media) {
		alunoSet.add(new Aluno(nome, matricula, media));
	}

	public void removerAluno(long matricula) {
		Aluno alunoPraRemover = null;
		if (!alunoSet.isEmpty()) {
			for (Aluno a : alunoSet) {
				if (a.getMatricula() == matricula) {
					alunoPraRemover = a;
					break;
				}
			}
			alunoSet.remove(alunoPraRemover);
		} else {
			throw new RuntimeException("O conjunto está vazio!");
		}
		if (alunoPraRemover == null) {
			System.out.println("Matrícula não encontrada");
		}

	}

	public void exibirAlunosPorNome() {
		Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
		if (!alunoSet.isEmpty()) {
			System.out.println(alunosPorNome);
		} else {
			System.out.println("O conjunto está vazio");
		}
	}

	public void exibirAlunosPorNota() {
		Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorNota());
		if (!alunoSet.isEmpty()) {
			alunosPorNota.addAll(alunoSet);
			System.out.println(alunosPorNota);
		} else {
			System.out.println("O conjunto está vazio");
		}
	}
	public static void main(String[] args) {
		GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
		gerenciadorAlunos.adicionarAluno("João", 1L, 7);
		gerenciadorAlunos.adicionarAluno("Maria", 3L, 7.5);
		gerenciadorAlunos.adicionarAluno("José", 14L, 9);
		gerenciadorAlunos.adicionarAluno("Jota", 5L, 9.8);
		
		System.out.println("Alunos por gerenciador:");
		System.out.println(gerenciadorAlunos.alunoSet);
		
		gerenciadorAlunos.removerAluno(14L);
		gerenciadorAlunos.removerAluno(15L);
		
		System.out.println(gerenciadorAlunos.alunoSet);
		
		gerenciadorAlunos.exibirAlunosPorNome();
		gerenciadorAlunos.exibirAlunosPorNota();
	}
	
	
	

}

