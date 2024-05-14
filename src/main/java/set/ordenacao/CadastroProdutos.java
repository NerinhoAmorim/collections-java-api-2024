package main.java.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	private Set<Produto> produtoSet;

	public CadastroProdutos() {
		this.produtoSet = new HashSet<>();
	}

	public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
		produtoSet.add(new Produto(codigo, nome, preco, quantidade));
	}

	public Set<Produto> exibirProdutosPorNome() {
		Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
		return produtoPorNome;
	}

	public Set<Produto> exibirProdutosPorPreco() {
		Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
		produtoPorPreco.addAll(produtoSet);
		return produtoPorPreco;
	}
	
	
	public static void main(String[] args) {
		CadastroProdutos cadastroProdutos = new CadastroProdutos();
		cadastroProdutos.adicionarProduto(001L, "Biscoito", 1.99, 03);
		cadastroProdutos.adicionarProduto(001L, "Chocolate", 3.99, 01);
		cadastroProdutos.adicionarProduto(002L, "Laranja", 4.99, 12);
		cadastroProdutos.adicionarProduto(003L, "Coca-cola", 7.99, 03);
		cadastroProdutos.adicionarProduto(004L, "Leite", 8.99, 04);
		cadastroProdutos.adicionarProduto(005L, "Frango", 8.99, 13);
		
		System.out.println(cadastroProdutos.produtoSet);
		System.out.println(cadastroProdutos.exibirProdutosPorNome());
		System.out.println(cadastroProdutos.exibirProdutosPorPreco());
	}
	

}
