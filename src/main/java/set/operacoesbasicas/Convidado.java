package main.java.set.operacoesbasicas;

import java.util.Objects;

public class Convidado {
	private String nome;

	private int CodigoConvite;

	public Convidado(String nome, int codigoConvite) {
		this.nome = nome;
		CodigoConvite = codigoConvite;
	}

	public String getNome() {
		return nome;
	}


	public int getCodigoConvite() {
		return CodigoConvite;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(CodigoConvite);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Convidado other = (Convidado) obj;
		return CodigoConvite == other.CodigoConvite;
	}

	@Override
	public String toString() {
		return "Convidado [nome=" + nome + ", CodigoConvite=" + CodigoConvite + "]";
	}
}
