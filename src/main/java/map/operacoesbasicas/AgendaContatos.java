package main.java.map.operacoesbasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	private Map<String, Integer> agendaContatosMap;

	public AgendaContatos() {
		this.agendaContatosMap = new HashMap<>();
	}

	public void adicionarContato(String nome, Integer telefone) {
		agendaContatosMap.put(nome, telefone);
	}

	public void removerContato(String nome) {
		if (!agendaContatosMap.isEmpty()) {
			agendaContatosMap.remove(nome);
		}
	}

	public void exibirContatos() {
		System.out.println(agendaContatosMap);
	}

	public Integer pesquisarPorNome(String nome) {
		Integer numeroPorNome = null;
		if (!agendaContatosMap.isEmpty()) {
			numeroPorNome = agendaContatosMap.get(nome);
			if(numeroPorNome==null) {
				System.out.println("Número não encontrado na agenda");
			}else {
				System.out.println("A agenda de contato está vazia");
			}
		}
		return numeroPorNome;

	}

	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();
		agendaContatos.adicionarContato("Malu", 1234);
		agendaContatos.adicionarContato("Manu", 4444);
		agendaContatos.adicionarContato("Carlos", 25252);
		agendaContatos.adicionarContato("Benilda", 9999);
		agendaContatos.adicionarContato("Pereira", 81818);
		agendaContatos.adicionarContato("Pereira", 4444);
		agendaContatos.exibirContatos();
		
		agendaContatos.removerContato("Manu");
		agendaContatos.exibirContatos();
		
		
		System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Benilda"));
	}
	
}
