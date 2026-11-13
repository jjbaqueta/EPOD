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
	
	/**
	 * Verifica se existe um caminho entre dois vértices do grafo
	 * utilizando a Busca em Profundidade (DFS).
	 *
	 * @param idOrigem identificador do vértice de origem.
	 * @param idDestino identificador do vértice de destino.
	 * @return true se existir um caminho entre os vértices;
	 *         false caso contrário.
	 */
	public boolean buscar(int idOrigem, int idDestino) {
		boolean[] visitados = new boolean[this.vertices.size()];
		return dfs(idOrigem, idDestino, visitados);
	}
	
	/**
	 * Executa a Busca em Profundidade (DFS) de forma recursiva.
	 *
	 * @param idOrigem vértice atualmente visitado.
	 * @param idDestino vértice que se deseja encontrar.
	 * @param visitados vetor que controla quais vértices já foram visitados
	 * @return true se o vértice destino for encontrado;
	 *         false caso contrário.
	 */
	private boolean dfs(int idOrigem, int idDestino, boolean[] visitados) {
		visitados[idOrigem] = true;
		
		// Caso base: o destino foi encontrado
		if (idOrigem == idDestino) {
			return true;
		}
		
		// Recursão
		Vertice origem = this.vertices.get(idOrigem);
		
		for (Vertice v : origem.getAdjs()) {
			if (!visitados[v.getId()]) {
				if (dfs(v.getId(), idDestino, visitados)) {
					return true;
				}
			}
		}
		return false;
	}
}
