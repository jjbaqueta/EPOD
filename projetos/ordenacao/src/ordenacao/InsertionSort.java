package ordenacao;

public class InsertionSort implements AlgoritmoOrdenacao{

    /**
    * Função que implementa o algoritmo Insertion Sort.
    * Ordena um vetor de inteiros em ordem crescente.
    *
    * @param vetor - vetor de inteiros
    */
	@Override
	public void ordenar(int[] vetor) {
		for (int i = 1; i < vetor.length; ++i) {
            int chave = vetor[i];
            int j = i - 1;

            // Move os elementos de vet[0 .. i-1] que são maiores que a chave para frente
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = chave;
        }
	}	
}