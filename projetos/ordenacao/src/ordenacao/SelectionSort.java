package ordenacao;

public class SelectionSort implements AlgoritmoOrdenacao{

    /**
    * Função que implementa o algoritmo Selection Sort.
    * Ordena o vetor em ordem crescente.
    * 
    * @param vetor - vetor de inteiros
    */
	@Override
	public void ordenar(int[] vetor) {
		for (int i = 0; i < vetor.length - 1; i++) {
            int indice = i;
            
            // Busca o menor elemento na parte não ordenada do vetor
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[indice]) {
                    indice = j;
                }
            }
            // Se encontrou um valor menor, faz a troca com a posição atual
            if (vetor[i] > vetor[indice]) {
                int aux = vetor[indice];
                vetor[indice] = vetor[i];
                vetor[i] = aux;
            }
        }
	}

}
