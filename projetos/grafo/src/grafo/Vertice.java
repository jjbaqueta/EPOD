package grafo;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Vertice implements Comparable<Vertice>{
	private Integer id;
	private String nome;
	private Set<Vertice> adjs;
	
	public Vertice(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
		this.adjs = new TreeSet<Vertice>();
	}
	
	
	public void addAdj(Vertice u) {
		this.adjs.add(u);
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Set<Vertice> getAdjs() {
		return Collections.unmodifiableSet(this.adjs);
	}

	@Override
	public int compareTo(Vertice arg0) {
		return this.id.compareTo(arg0.id);
	}

	@Override
	public String toString() {
		return "v(id=" + id + ", nome=" + nome + ")";
	}
}
