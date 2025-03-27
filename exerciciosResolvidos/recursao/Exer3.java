/* Exercício 3:
 * 
 * Escreva uma função recursiva para inverter um vetor V[0 .. b], 
 * onde b > 0 e b representa a última posição do vetor. 
 * A função deve modificar o vetor de modo que o primeiro elemento se torne o último, 
 * o segundo se torne o penúltimo, e assim por diante.
*/

public class Exer3 {

    // Função recursiva para inverter o vetor de entrada (v)
    public static void inverterVetor(int[] v, int a, int b) {
        if (a < b) {
            int aux = v[a];
            v[a] = v[b];
            v[b] = aux;        
            inverterVetor(v, a + 1, b - 1);
        }
    }

    public static void main (String[] args) {
        // Declaração e inicialização do vetor
        int[] vetor = {1, 2, 3, 4, 5};
        
        inverterVetor(vetor, 0, vetor.length - 1);
        for (int i : vetor) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
