package main.java.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
	private Set<Contato> contatoSet;

	public AgendaContatos() {
		this.contatoSet = new HashSet<>();
	}

	public void adicionarContato(String nome, int numero) {
		contatoSet.add(new Contato(nome, numero));
	}

	public void exibirContato() {
		System.out.println(contatoSet);
	}

	public Set<Contato> pesquisarPorNome(String nome) {
		Set<Contato> contatoPorNome = new HashSet<>();
		for (Contato c : contatoSet) {
			if (c.getNome().startsWith(nome))
				;
			contatoPorNome.add(c);
		}
		return contatoPorNome;
	}

	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		Contato contatoAtualizado = null;
		if (!contatoSet.isEmpty()) {
			for (Contato c : contatoSet) {
				if (c.getNome().equalsIgnoreCase(nome)) {
					c.setNumero(novoNumero);
					contatoAtualizado = c;
					break;
				}
			}
			return contatoAtualizado;
		} else {
			throw new RuntimeException("O conjunto está vazio!");
		}
	}

	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();
		agendaContatos.adicionarContato("Nerinho", 739993767);
		agendaContatos.adicionarContato("Nerinho", 5678);
		agendaContatos.adicionarContato("Nerinho Wakanda", 9809);
		agendaContatos.adicionarContato("Nerinho Amorim", 739813767);
		agendaContatos.adicionarContato("Gil Nascimento", 73988);

		agendaContatos.exibirContato();

		System.out.println(agendaContatos.pesquisarPorNome("Nerinho"));
		
		Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Gil Nascimento", 44443333);
		System.out.println("Contato atualizado: " + contatoAtualizado);
		
		System.out.println("Contatos na agenda após atualização:");
	    agendaContatos.exibirContato();

	}

}
