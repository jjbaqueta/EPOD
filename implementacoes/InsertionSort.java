import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
    
    // Define um valor constante para o tamanho máximo do vetor
    private static final int TAMANHO_MAXIMO = 10;

    /**
    * Função que implementa o algoritmo Insertion Sort.
    * Ordena um vetor de inteiros em ordem crescente.
    *
    * @param vet - vetor de inteiros
    */
    public static void insertionSort(int[] vet) {
        for (int i = 1; i < vet.length; ++i) {
            int chave = vet[i];
            int j = i - 1;

            // Move os elementos de vet[0 .. i-1] que são maiores que a chave para frente
            while (j >= 0 && vet[j] > chave) {
                vet[j + 1] = vet[j];
                j = j - 1;
            }
            vet[j + 1] = chave;
        }
    }

    public static void main(String[] args) {
        // Cria um vetor de inteiros com tamanho definido
        int[] vet = new int[TAMANHO_MAXIMO];
        
        Random rand = new Random();

        // Preenche o vetor com valores aleatórios entre 0 (inclusive) e TAMANHO_MAXIMO-1
        for (int i = 0; i < TAMANHO_MAXIMO; i++) {
            vet[i] = rand.nextInt(TAMANHO_MAXIMO);
        }

        System.out.println("Vertor não ordenado:");
        System.out.println(Arrays.toString(vet));
        
        // Chama a função para ordenar o vetor
        insertionSort(vet);

        System.out.println("Array ordenado:");
        System.out.println(Arrays.toString(vet));
    }
}
