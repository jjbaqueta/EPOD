package ordenacao;

import java.util.Arrays;
import java.util.Random;

public class Main {

	private static final int TAMANHO_VETOR = 100000;
	
	/**
     * Função que embaralha um vetor de inteiros utilizando o algoritmo de Fisher-Yates.
     * Esse algoritmo garante um embaralhamento uniforme dos elementos.
     *
     * @param vetor - vetor de inteiros a ser embaralhado
     */
    public static void embaralha(int[] vetor) {
        Random rand = new Random();

        // Percorre o vetor de trás para frente
        for (int i = vetor.length - 1; i >= 0; i--) {
            
            // Gera um índice aleatório entre 0 e i (inclusive)
            int indice = rand.nextInt(i + 1);
            
            // Troca o elemento na posição i com o elemento na posição aleatória
            int aux = vetor[i];
            vetor[i] = vetor[indice];
            vetor[indice] = aux;
        }
    }
        
    public static void inicializarCrescente(int[] vetor) {
    	for (int i = 0; i < vetor.length; i++) {
    		vetor[i] = i;
    	}
    }
    
    public static void inicializarDecrescente(int[] vetor) {
    	for (int i = 0; i < vetor.length; i++) {
    		vetor[i] = vetor.length - 1 - i;
    	}
    }
    
    public static void exibirVetor(int[] vetor) {
    	System.out.println(Arrays.toString(vetor));
    }
    
    public static void calcularTempoExecução(AlgoritmoOrdenacao algoritmo, int[] vetor) {
    	long tInicio = System.currentTimeMillis();
    	algoritmo.ordenar(vetor);
    	long tFim = System.currentTimeMillis();
		System.out.print((tFim - tInicio) + " ms\n");
    }
	
	public static void main(String[] args) {
		int[] vetorA = new int[TAMANHO_VETOR];
		int[] vetorB = new int[TAMANHO_VETOR];
		int[] vetorC = new int[TAMANHO_VETOR];
		
		// Inicializando os vetores
		
		// Melhor caso:
		inicializarCrescente(vetorA);
		
		// Caso médio
		inicializarCrescente(vetorB);
		embaralha(vetorB);

		// Pior caso:
		inicializarDecrescente(vetorC);
		
		// Algoritmos
		InsertionSort insertion = new InsertionSort();
		SelectionSort selection = new SelectionSort();
		MergeSort merge = new MergeSort();

		// Ordenação
		System.out.println("--- Melhor caso ---");
		
		System.out.print("Merge Sort: ");
		calcularTempoExecução(merge, vetorA.clone());
		
		System.out.print("Insertion Sort: ");
		calcularTempoExecução(insertion, vetorA.clone());
		
		System.out.print("Selection Sort: ");
		calcularTempoExecução(selection, vetorA.clone());
		
		
		System.out.println("\n--- Caso médio ---");
		
		System.out.print("Merge Sort: ");
		calcularTempoExecução(merge, vetorB.clone());
		
		System.out.print("Insertion Sort: ");
		calcularTempoExecução(insertion, vetorB.clone());
		
		System.out.print("Selection Sort: ");
		calcularTempoExecução(selection, vetorB.clone());
		
		
		System.out.println("\n--- Pior Caso ---");
		
		System.out.print("Merge Sort: ");
		calcularTempoExecução(merge, vetorC.clone());
		
		System.out.print("Insertion Sort: ");
		calcularTempoExecução(insertion, vetorC.clone());
		
		System.out.print("Selection Sort: ");
		calcularTempoExecução(selection, vetorC.clone());
	}
}
