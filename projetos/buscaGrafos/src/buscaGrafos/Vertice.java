package buscaGrafos;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Vertice implements Comparable<Vertice> {
	private Integer id;
	private String nome;
	private Set<Vertice> adjs;
	
	public Vertice(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
		this.adjs = new TreeSet<Vertice>();
	}
	
	public void addAdj(Vertice v) {
		this.adjs.add(v);
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Set<Vertice> getAdjs() {
		return adjs;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vertice other = (Vertice) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "(" + id + ": " + nome + ")";
	}

	@Override
	public int compareTo(Vertice o) {
		return this.id.compareTo(o.id);
	}
}