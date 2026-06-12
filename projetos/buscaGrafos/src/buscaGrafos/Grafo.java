package buscaGrafos;

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
	
	/**
	 * Verifica se existe um caminho entre dois vértices do grafo
	 * utilizando a Busca em Profundidade (DFS).
	 *
	 * @param idV identificador do vértice de origem
	 * @param idU identificador do vértice de destino
	 * @return true se existir um caminho entre os vértices;
	 *         false caso contrário
	 */
	public boolean buscar(int idV, int idU) {
	    boolean[] visitados = new boolean[this.vertices.size()];
	    return dfs(idV, idU, visitados);
	}

	/**
	 * Executa a Busca em Profundidade (DFS) de forma recursiva.
	 *
	 * @param idOrigem vértice atualmente visitado
	 * @param idDestino vértice que se deseja encontrar
	 * @param visitados vetor que controla quais vértices já foram visitados
	 * @return true se o vértice destino for encontrado;
	 *         false caso contrário
	 */
	private boolean dfs(int idOrigem, int idDestino, boolean[] visitados) {
	    visitados[idOrigem] = true;

	    // Caso base: o destino foi encontrado
	    if (idOrigem == idDestino) {
	        return true;
	    }

	    Vertice origem = this.vertices.get(idOrigem);

	    for (Vertice adj : origem.getAdjs()) {
	        if (!visitados[adj.getId()]) {
	            if (dfs(adj.getId(), idDestino, visitados)) {
	                return true;
	            }
	        }
	    }
	    return false;
	}
}