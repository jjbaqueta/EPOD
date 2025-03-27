/* Exercício 1:
 * 
 * Dado dois valores inteiros, m e n (informados pelo usuário), 
 * implemente uma função recursiva que some todos os valores no intervalo de m a n (inclusive). 
 * Assuma que m é sempre menor ou igual a n.
 * Exemplo de entrada e saída:
 * Entrada: m = 1, n = 4       Saída: 1 + 2 + 3 + 4 = 10.
*/

import java.util.Scanner;

public class Exer1 {

    // Função recursiva para somar os valores no intervalo de m a n
    public static int somarIntervalo(int m, int n) {
        if (m == n) {
            return m;
        }
        return n + somarIntervalo(m, n - 1);
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de dados
        System.out.print("Digite o valor de m: ");
        int m = scanner.nextInt();
        System.out.print("Digite o valor de n: ");
        int n = scanner.nextInt();
        
        // Exibe o resultado
        System.out.println(somarIntervalo(m, n));
        scanner.close();
    }
}
