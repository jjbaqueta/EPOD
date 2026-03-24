package ordenacaoElementar;

import java.util.Random;

public class Main {

	private static final CasoTipo CASO = CasoTipo.MELHOR;
	private static final int TAMANHO = 1000;
	
	/**
	 * Função que implementa o algoritmo Insertion Sort.
	 * @param vet - vetor de inteiros
	 */
	public static void insertionSort(int[] vet) {
		for (int i = 1; i < vet.length; ++i) {
			int chave = vet[i];
			int j = i - 1;

			// Move os elementos de vet[0 .. i - 1] que são maiores que a chave para frente
			while (j >= 0 && vet[j] > chave) {
				vet[j + 1] = vet[j];
				j = j - 1;
			}
			vet[j + 1] = chave;
		}
	}
	
	/**
	* Função que implementa o algoritmo Selection Sort.
	* @param vet - vetor de inteiros
	*/
	public static void selectionSort(int[] vet) {
		for (int i = 0; i < vet.length - 1; i++) {
			// Encontra o menor elemento da parte não ordenada
			int indice = i;
			for (int j = i + 1; j < vet.length; j++) {
				if (vet[j] < vet[indice]) {
					indice = j;
				}
			}
			// Troca o menor elemento com o elemento i da parte ordenada
			if (vet[i] > vet[indice]) {
				int aux = vet[indice];
				vet[indice] = vet[i];
				vet[i] = aux;            	
			}
		}
	}
	
	/**
	* Função para inicializar o vetor (vet) com valores ordenados de forma crescente, onde vet[i] = i + 1.
	* @param vet - vetor de inteiros
	*/
	public static void gerarMelhorCaso(int[] vet) {
		for (int i = 0; i < vet.length; i++) {
			vet[i] = i + 1;
		}
	}
	
	/**
	* Função para inicializar o vetor (vet) com valores aleatórios, onde vet[i] = random.[0 .. vet.length - 1].
	* @param vet - vetor de inteiros
	*/
	public static void gerarCasoMedio(int[] vet) {
		Random rand = new Random();
		for (int i = 0; i < vet.length; i++) {
			vet[i] = rand.nextInt(vet.length);
		}
	}
	
	/**
	* Função para inicializa o vetor (vet) com valores ordenados de forma decrescente, onde vet[i] = vet.length - i.
	* @param vet - vetor de inteiros
	*/
	public static void gerarPiorCaso(int[] vet) {
		for (int i = 0; i < vet.length; i++) {
			vet[i] = vet.length - i;
		}
	}
	
	public static void main(String[] args) {
		int[] vetorA = new int[TAMANHO];
				
		switch (CASO) {
			case MELHOR:
				gerarMelhorCaso(vetorA);
				break;
			case MEDIO:
				gerarCasoMedio(vetorA);
				break;
			case PIOR:
				gerarPiorCaso(vetorA);
				break;
		}
				
		// Inicializando o vetor B, sendo esse uma cópia do A
		int[] vetorB = vetorA.clone();
				
		// Rotinas para ordenar os vetores
		long inicio = System.currentTimeMillis();
		insertionSort(vetorA);
		System.out.println("Insertion Sort - tempo de execução (ms):" + (System.currentTimeMillis() - inicio));

		inicio = System.currentTimeMillis();
		selectionSort(vetorB);
		System.out.println("Selection Sort - tempo de execução (ms):" + (System.currentTimeMillis() - inicio));
	}
}