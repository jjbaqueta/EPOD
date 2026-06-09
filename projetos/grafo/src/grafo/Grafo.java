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
		vertices.put(id, new Vertice(id, nome));
	}
	
	/**
	 * Adiciona uma aresta entre dois vértices do grafo.
	 * A aresta é criada do vértice de origem para o vértice de destino.
	 *
	 * @param idU identificador do vértice de origem.
	 * @param idV identificador do vértice de destino.
	 */
	public void addAresta(int idU, int idV) {
		Vertice origem = this.vertices.get(idU);
		Vertice destino = this.vertices.get(idV);
		
		if (origem != null && destino != null) {
			this.vertices.get(idU).getAdjs().add(destino);
		}
	}
	
	public void exibirGrafo() {
		for (Vertice v : this.vertices.values()) {
			System.out.println(v + " -> " + v.getAdjs());
		}
	}
}