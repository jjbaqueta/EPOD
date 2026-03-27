import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    
    // Define um valor constante para o tamanho máximo do vetor
    private static final int TAMANHO_MAXIMO = 10;

    // Função responsável por intercalar (mesclar) duas partes ordenadas do vetor
    private static void intercalar(int[] vet, int[] aux, int inicio, int meio, int fim) {
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

    // Função recursiva que divide o vetor em subproblemas até atingir casos base
    private static void dividir(int[] vet, int[] aux, int inicio, int fim) {
        if (fim <= inicio) {
            return;
        }
        int meio = inicio + (fim - inicio) / 2;
        dividir(vet, aux, inicio, meio);
        dividir(vet, aux, meio + 1, fim);
        intercalar(vet, aux, inicio, meio, fim);
    }

    /**
    * Função que implementa o algoritmo Merge Sort.
    * 
    * @param vet - vetor de inteiros
    * @param aux - vetor auxiliar usado no processo de intercalação
    * @param inicio - índice da primeira posição do vetor vet.
    * @param r - índice da última posição do vetor vet
    */
    public static void mergeSort(int[] vet, int[] aux, int inicio, int fim) {
        dividir(vet, aux, inicio, fim);
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] vet = new int[TAMANHO_MAXIMO]; // Cria um vetor de inteiros com tamanho definido
        int[] aux = new int[TAMANHO_MAXIMO]; // Cria uma cópia do vetor de entrada
        
        // Preenche o vetor com valores aleatórios entre 0 (inclusive) e TAMANHO_MAXIMO-1
        for (int i = 0; i < TAMANHO_MAXIMO; i++) {
            vet[i] = rand.nextInt(TAMANHO_MAXIMO);
        }
        
        System.out.println("Vetor não ordenado: " + Arrays.toString(vet));
        
        // Chama a função para ordenar o vetor
        mergeSort(vet, aux, 0, TAMANHO_MAXIMO - 1);
        
        System.out.println("Vetor ordenado: " + Arrays.toString(vet));
    }
}
