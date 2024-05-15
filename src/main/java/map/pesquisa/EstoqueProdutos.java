package main.java.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
	private Map<Long, Produto> estoqueProdutosMap;

	public EstoqueProdutos() {
		this.estoqueProdutosMap = new HashMap<>();
	}

	public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
		estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
	}

	public void exibirProdutos() {
		System.out.println(estoqueProdutosMap);
	}

	public double calcularValorTotalEstoque() {
		double valorTotalEstoque = 0d;
		if (!estoqueProdutosMap.isEmpty()) {
			for (Produto p : estoqueProdutosMap.values()) {
				valorTotalEstoque += p.getQuantidade() * p.getPreco();
			}
		}
		return valorTotalEstoque;
	}

	public Produto obterProdutoMaisCaro() {
		Produto produtoMaisCaro = null;
		double maiorPreco = Double.MIN_VALUE;
		if(!estoqueProdutosMap.isEmpty()) {
			for(Produto p : estoqueProdutosMap.values()) {
				if(p.getPreco()> maiorPreco) {
					produtoMaisCaro = p;
				}
			}
		}
		return produtoMaisCaro;
	}
public static void main(String[] args) {
	EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
	estoqueProdutos.exibirProdutos();
	
	estoqueProdutos.adicionarProduto(1L, "Produto A", 01, 3.99);
	estoqueProdutos.adicionarProduto(2L, "Produto B", 02, 4.99);
	estoqueProdutos.adicionarProduto(3L, "Produto C", 03, 5.99);
	estoqueProdutos.adicionarProduto(4L, "Produto D", 04, 6.99);
	
	estoqueProdutos.exibirProdutos();
	
	System.out.println("Valor total do estoque: R$" + estoqueProdutos.calcularValorTotalEstoque());
	System.out.println("Valor mais caro: " + estoqueProdutos.obterProdutoMaisCaro());
	
}
}
