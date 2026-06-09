package grafo;

/**
 * Exercício
 * 
 * Implemente uma lista de adjacência para representar um grafo direcionado e
 * ponderado, onde cada vértice é definido por dois atributos:
 * - id: um inteiro que identifica unicamente um vértice
 * - nome: uma string associada ao vértice
 * Instancie e exiba o seguinte grafo ao percorrer as listas de adjacências:
 * 
 * grafo:
 * 
 * "v1"(1) -> ["v2"(2), "v3"(3)]
 * "v2"(2) -> ["v4"(4)]
 * "v3"(3) -> ["v2"(2)]
 * "v4"(4) -> ["v5"(5)]
 * "v5"(5) -> []
 */

public class Main {

	public static void main(String[] args) {
		// Criando o grafo
		Grafo grafo = new Grafo();
		
		// Adicionando os vértices
		grafo.addVertice(1, "V1");
		grafo.addVertice(2, "V2");
		grafo.addVertice(3, "V3");
		grafo.addVertice(4, "V4");
		grafo.addVertice(5, "V5");
		
		// Adicionando as arestas
		grafo.addAresta(1, 2);
		grafo.addAresta(1, 3);
		grafo.addAresta(2, 4);
		grafo.addAresta(3, 2);
		grafo.addAresta(4, 5);
		
		grafo.exibirGrafo();
	}
}