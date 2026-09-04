package ordenacao;

public class MergeSort implements AlgoritmoOrdenacao{
	
	@Override
	public void ordenar(int[] vetor) {
		int[] aux = new int[vetor.length];
		run(vetor, aux, 0, vetor.length - 1);
	}
	
    /**
    * Função que implementa o algoritmo Merge Sort.
    * 
    * @param vet - vetor de inteiros
    * @param aux - vetor auxiliar usado no processo de intercalação
    * @param inicio - índice da primeira posição do vetor vet.
    * @param r - índice da última posição do vetor vet
    */
	private void run(int[] vet, int[] aux, int inicio, int fim) {
        dividir(vet, aux, inicio, fim);
    }

    // Função recursiva que divide o vetor em subproblemas até atingir casos base
    private void dividir(int[] vet, int[] aux, int inicio, int fim) {
        if (fim <= inicio) {
            return;
        }
        int meio = inicio + (fim - inicio) / 2;
        dividir(vet, aux, inicio, meio);
        dividir(vet, aux, meio + 1, fim);
        intercalar(vet, aux, inicio, meio, fim);
    }

    // Função responsável por intercalar (mesclar) duas partes ordenadas do vetor
    private void intercalar(int[] vet, int[] aux, int inicio, int meio, int fim) {
        int i = inicio, j = meio + 1, k;

        for (k = inicio; k <= fim; k++) {
            aux[k] = vet[k];
        }
        for (k = inicio; k <= fim; k++) {
            if (i > meio) {
                vet[k] = aux[j++];
            }
            else if (j > fim) {
                vet[k] = aux[i++];
            }
            else if (aux[j] <= aux[i]) {
                vet[k] = aux[j++];
            }
            else {
                vet[k] = aux[i++];
            }
        }
    }
}
