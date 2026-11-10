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
		grafo.addVertice(1, "v1");
		grafo.addVertice(2, "v2");
		grafo.addVertice(3, "v3");
		grafo.addVertice(4, "v4");
		grafo.addVertice(5, "v5");
		
		// Adicionando as arestas
		grafo.addAdj(1, 2);
		grafo.addAdj(1, 3);
		grafo.addAdj(3, 2);
		grafo.addAdj(2, 4);
		grafo.addAdj(4, 5);
		
		grafo.exibirGrafo();
	}
}
