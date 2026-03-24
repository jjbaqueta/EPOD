import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

    // Define um valor constante para o tamanho máximo do vetor
    private static final int TAMANHO_MAXIMO = 10;

    /**
    * Função que implementa o algoritmo Selection Sort.
    * Ordena o vetor em ordem crescente.
    * 
    * @param vet - vetor de inteiros
    */
    public static void selectionSort(int[] vet) {
        for (int i = 0; i < vet.length - 1; i++) {
            int indice = i;
            
            // Busca o menor elemento na parte não ordenada do vetor
            for (int j = i + 1; j < vet.length; j++) {
                if (vet[j] < vet[indice]) {
                    indice = j;
                }
            }
            // Se encontrou um valor menor, faz a troca com a posição atual
            if (vet[i] > vet[indice]) {
                int aux = vet[indice];
                vet[indice] = vet[i];
                vet[i] = aux;
            }
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
        selectionSort(vet);

        System.out.println("Vetor ordenado:");
        System.out.println(Arrays.toString(vet));
    }
}
