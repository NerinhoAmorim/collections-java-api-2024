package main.java.map.operacoesbasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
	private Map<String, String> dicionarioMap;

	public Dicionario() {
		this.dicionarioMap = new HashMap<>();
	}

	public void adicionarPalavra(String palavra, String definicao) {
		dicionarioMap.put(palavra, definicao);
	}

	public void removerPalavra(String palavra) {
		if (!dicionarioMap.isEmpty()) {
			dicionarioMap.remove(palavra);
		} else {
			System.out.println("O dicionário está vazio");
		}
	}

	public void exibirPalavras() {
		System.out.println(dicionarioMap);
	}

	public String pesquisarPorPalavra(String palavra) {
		String definicao = dicionarioMap.get(palavra);
		if (definicao != null) {
			return definicao;
		}
		return "Palabra não encontrada no dicionario";
	}

	public static void main(String[] args) {
		Dicionario dicionario = new Dicionario();
		dicionario.adicionarPalavra("Saudade", "Sentimento nostálgico");
		dicionario.adicionarPalavra("Cafuné", "Carinho feito com os dedos");
		dicionario.adicionarPalavra("Bossa Nova", "Gênero musical popular");
		dicionario.adicionarPalavra("Samba", "Dança popular brasileira");
		dicionario.adicionarPalavra("Caipirinha", "Bebida alcoólica brasileira feita com cachaça");
		dicionario.exibirPalavras();

		dicionario.removerPalavra("Caipirinha");
		dicionario.exibirPalavras();

		System.out.println("A palavra significa:  " + dicionario.pesquisarPorPalavra("Saudade"));

	}

}
