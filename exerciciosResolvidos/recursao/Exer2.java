/* Exercício 2:
 * 
 * Escreva uma função que calcule o fatorial de um número informado pelo usuário (x), 
 * conforme definido na equação abaixo:
 * se x == 0 ou x == 1, retorne 1
 * caso contrário, retorne x * (x - 1)!
*/

import java.util.Scanner;

public class Exer2 {

    // Função recursiva para calcular o fatorial de x
    public static int fatorial(int x) {
        if (x == 0 || x == 1) {
            return 1;
        }
        return x * fatorial(x - 1);
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de dados
        System.out.print("Digite o valor de x: ");
        int x = scanner.nextInt();
        
        // Exibe o resultado
        System.out.println(fatorial(x));
        scanner.close();
    }
}
