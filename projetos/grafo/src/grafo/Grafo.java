package grafo;

import java.util.Map;
import java.util.TreeMap;

public class Grafo {
	private Map<Integer, Vertice> vertices;
	
	public Grafo() {
		this.vertices = new TreeMap<Integer, Vertice>();
	}
	
	/**
	 * Adiciona um novo vértice ao grafo.
	 * 
	 * @param id identificador único do vértice.
	 * @param nome nome associado ao vértice.
	 */
	public void addVertice(int id, String nome) {
		this.vertices.put(id, new Vertice(id, nome));
	}
	
	/**
	 * Adiciona uma aresta entre dois vértices do grafo.
	 * A aresta é criada do vértice de origem para o vértice de destino.
	 *
	 * @param idV identificador do vértice de origem.
	 * @param idU identificador do vértice de destino.
	 */
	public void addAdj(int idV, int idU) {
		Vertice origem = this.vertices.get(idV);
		Vertice destino = this.vertices.get(idU);
				
		if (origem != null && destino != null) {
			origem.addAdj(destino);
		}
	}
	
	public void exibirGrafo() {
		for (Vertice v : this.vertices.values()) {
			System.out.println(v + " -> " + v.getAdjs());
		}
	}
}
