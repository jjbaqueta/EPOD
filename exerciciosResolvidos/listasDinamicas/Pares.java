/*
 * Escreva um programa em Java que conte o total de números pares em duas listas diferentes: 
 * uma lista deve ser implementada como um ArrayList e a outra como uma LinkedList. 
 * Realize as seguintes operações:
 *    1) Inicialize o ArrayList com os seguintes números inteiros: 1, 1, 3, 5, 5.
 *    2) Inicialize o LinkedList com os seguintes números inteiros: 5, 6, 8, 9, 10.
 *    3) Implemente um método chamado contaPares, que recebe uma lista de números inteiros e retorna a contagem de números pares na lista.
 *    4) Exibir o total de números pares encontrados nas duas listas.
 */

import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Pares {

    public static int contaPares(List<Integer> lista){
        int pares = 0;
        for (Integer numero : lista) {
            if (numero % 2 == 0) {
                pares++;
            }
        }
        return pares;
    }

    // Função principal
    public static void main(String[] args){

        // Inicializando as listas.
        List<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1, 1, 3, 5, 5));
        List<Integer> linkedList = new LinkedList<Integer>(Arrays.asList(5, 6, 8, 9, 10));

        // Contando os números pares do arrayList: 
        int contador = contaPares(arrayList);

        // Contando os números pares do linkedList: 
        contador += contaPares(linkedList);

        // Exibe a contagem
        System.out.println("Total de números pares: " + contador);
    }
}
