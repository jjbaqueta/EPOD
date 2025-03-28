/*
 * Exercício (Versão 2 - Remoção direta de objeto):
 * Escreva um programa em Java que utilize um ArrayList para armazenar uma lista de nomes de frutas. 
 * O programa deve realizar as seguintes operações:
 *    1) Adicionar as seguintes frutas à lista: "Maçã", "Banana", "Morango", "Abacaxi" e "Uva";
 *    2) Exibir a lista de frutas na tela;
 *    3) Buscar uma fruta (busca pelo nome da fruta):
 *    - Se a fruta estiver na lista, removê-la e exibir a lista atualizada;
 *    - Se a fruta não estiver, exibir: “O item indicado não está na lista!”.
 */

import java.util.ArrayList;
import java.util.List;

public class FrutasV2 {

    // Função principal
    public static void main(String[] args){
        List<String> frutas = new ArrayList<String>();
        
        // Adicionando os itens à lista
        frutas.add("Maça");
        frutas.add("Banana");
        frutas.add("Morango");
        frutas.add("Abacaxi");
        frutas.add("Uva");

        // Exibe a lista completa 
        System.out.println("Lista completa:");
        System.out.println(frutas);

        // Operações de busca e remoção de item
        if (frutas.remove("Morango")) {
            System.out.println("Lista após a operação de remoção:");
            System.out.println(frutas);
        }
        else {
            System.out.println("O item indicado não está na lista!");
        }
    }
}
