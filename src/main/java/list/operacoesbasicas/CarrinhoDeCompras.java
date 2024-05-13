package main.java.list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	private List<Item> itens;

	public CarrinhoDeCompras() {
		this.itens = new ArrayList<>();
	}

	public void adicionarItem(String nome, double preco, int quantidade) {
		itens.add(new Item(nome, preco, quantidade));
	}

	public void removerItem(String nome) {
		this.itens.removeIf(item -> item.getNome().equals(nome));
	}

	public double calcularValorTotal() {
		double total = 0;
		for (Item item : this.itens) {
			total += item.getPreco() * item.getQuantidade();
		}
		return total;

	}

	public void exibirItens() {
		for (Item item : this.itens) {
			System.out.println("Nome: " + item.getNome() + ", Preço: " + item.getPreco() + ", Quantidade: "
					+ item.getQuantidade());
		}
	}

	public static void main(String[] args) {
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		System.out.println("Itens no carrinho de compras: ");
		carrinhoDeCompras.adicionarItem("Livro", 29.90, 2);
		carrinhoDeCompras.adicionarItem("Caneta", 9.90, 1);
		carrinhoDeCompras.adicionarItem("Caderno", 19.90, 2);
		carrinhoDeCompras.adicionarItem("Lápis", 2.90, 2);
		carrinhoDeCompras.removerItem("Caneta");
		carrinhoDeCompras.exibirItens();

		double total = carrinhoDeCompras.calcularValorTotal();
		System.out.println("Valor total do carrinho: " + total);
		
}
}
