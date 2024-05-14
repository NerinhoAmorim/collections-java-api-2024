package main.java.set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	private Set<Convidado> convidadoSet;

	public ConjuntoConvidados() {
		this.convidadoSet = new HashSet<>();
	}

	public void adicionarConvidado(String nome, int codigoConvite) {
		convidadoSet.add(new Convidado(nome, codigoConvite));
	}

	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		Convidado convidadoParaRemover = null;
		for (Convidado c : convidadoSet) {
			if (c.getCodigoConvite() == codigoConvite) {
				convidadoParaRemover = c;
				break;
			}
		}
		convidadoSet.remove(convidadoParaRemover);

	}

	public int contarConvidados() {
		return convidadoSet.size();
	}

	public void exibirConvidados() {
		System.out.println(convidadoSet);
	}

	public static void main(String[] args) {
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
		conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
		conjuntoConvidados.adicionarConvidado("Convidado 2", 4321);
		conjuntoConvidados.adicionarConvidado("Convidado 3", 5678);
		conjuntoConvidados.adicionarConvidado("Convidado 4", 5678);
		System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do set de Convidados");
		conjuntoConvidados.exibirConvidados();
		
		conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
		System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do set de Convidados");
		conjuntoConvidados.exibirConvidados();
		
	}

}
