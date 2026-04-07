import java.util.Arrays;

public class BuscaBinaria {
    
    // Define um valor constante para o tamanho máximo do vetor
    private static final int TAMANHO_MAXIMO = 10;

    /**
     * Função que implementa o algoritmo de busca binária.
     * Requer que o vetor esteja previamente ordenado.
     *
     * @param vetor - vetor de inteiros ordenado
     * @param chave - valor que queremos buscar no vetor
     * @return o índice da chave no vetor, ou -1 se não for encontrada
     */
    public static int buscaBinaria(int[] vetor, int chave) {
        int inicio = 0, fim = vetor.length - 1;
        
        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;
            
            if (vetor[meio] == chave) {
                return meio;
            } 
            
            if (vetor[meio] < chave) {
                inicio = meio + 1;
            }
            else {
                fim = meio - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] vet = new int[TAMANHO_MAXIMO]; // Cria um vetor de inteiros com tamanho definido

        // Inicializa o vetor, onde vet[i] = i + 1
        for (int i = 0; i < TAMANHO_MAXIMO; i++) {
            vet[i] = i + 1;
        }

        // Define a chave de busca como um valor que não está no vetor
        int chave = TAMANHO_MAXIMO + 1;
        
        // Chama a função de busca binária
        int indice = buscaBinaria(vet, chave);
        
        // Verifica o resultado da busca
        if (indice > 0) {
            System.out.println("chave de busca: " + chave +  ", posição da chave: " + indice);
        }
        else {
            System.out.println("a chave de busca não está no vetor");
        }
    }
}
