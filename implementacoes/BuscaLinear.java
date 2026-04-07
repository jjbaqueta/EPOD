import java.util.Arrays;

public class BuscaLinear {
    
    // Define um valor constante para o tamanho máximo do vetor
    private static final int TAMANHO_MAXIMO = 10;

    /**
     * Função que implementa o algoritmo de busca linear.
     * Não exige que o vetor esteja ordenado.
     * Percorre o vetor do início ao fim procurando a chave.
     *
     * @param vetor - vetor de inteiros onde será feita a busca
     * @param chave - valor que queremos encontrar no vetor
     * @return o índice onde a chave foi encontrada, ou -1 se não estiver no vetor
     */
    public static int buscaLinear(int[] vetor, int chave) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == chave) {
                return i;
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
        
        // Chama a função de busca linear
        int indice = buscaLinear(vet, chave);
        
        // Verifica o resultado da busca
        if (indice > 0) {
            System.out.println("chave de busca: " + chave +  ", posição da chave: " + indice);
        }
        else {
            System.out.println("a chave de busca não está no vetor");
        }
    }
}
