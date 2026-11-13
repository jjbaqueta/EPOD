package buscaGrafos;

/**
 * Exercício
 * 
 * Com base na implementação de um dígrafo, realizada na última aula, desenvolva uma rotina para verificar se dois vértices, u e v, estão conectados.
 * 
 * Por exemplo, no grafo abaixo, o vértice 0 (“v0”) está conectado ao vértice 3 (“v3”), mas não ao vértice 5 (“v5”). 
 * 
 * Sua rotina deve receber os IDs dos vértices u e v e retornar se eles estão conectados, ou seja, se existe um caminho entre eles.
 * 
 * grafo:
 * 
 * "v0"(0) -> ["v1"(1), "v2"(2)]
 * "v1"(1) -> ["v3"(3)]
 * "v2"(2) -> ["v1"(1)]
 * "v3"(3) -> []
 * "v4"(4) -> ["v5"(5), "v6"(6)]
 * "v5"(5) -> []
 * "v6"(6) -> []
 */

public class Main {

	public static void main(String[] args) {
		
		// Criando o grafo
		Grafo grafo = new Grafo();

		// Adicionando os vértices
		grafo.addVertice(0, "v0");
		grafo.addVertice(1, "v1");
		grafo.addVertice(2, "v2");
		grafo.addVertice(3, "v3");
		grafo.addVertice(4, "v4");
		grafo.addVertice(5, "v5");
		grafo.addVertice(6, "v6");
		
		// Adicionando as arestas
		grafo.addAdj(0, 1);
		grafo.addAdj(0, 2);
		grafo.addAdj(1, 3);
		grafo.addAdj(2, 1);
		grafo.addAdj(4, 5);
		grafo.addAdj(4, 6);
		
		grafo.exibirGrafo();
		
		// Verifica se é possível alcançar o vértice de destino a partir da origem.
		System.out.println(grafo.buscar(0, 3));
	}
}
