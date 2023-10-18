package AULA6;

import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
import java.util.List;
import java.util.*;

public class atv8 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário a partir do teclado
        Scanner scanner = new Scanner(System.in);
        
        // Cria uma lista de números inteiros e adiciona elementos a ela
        List <Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(2);
        lista.add(8);
        lista.add(1);
        lista.add(9);
        lista.add(3);

        // Imprime a lista original
        System.out.println("Lista original: " + lista);
        
        // Verifica se a lista não é nula e possui mais de um elemento para ordenação
        if (lista != null && lista.size() > 1) {
            ordenarLista(lista); // Chama a função para ordenar a lista
            // Imprime a lista ordenada
            System.out.println("Lista ordenada: " + lista);
        } else {
            // Se a lista está vazia ou tem apenas um elemento, imprime uma mensagem informando que não há necessidade de ordenação
            System.out.println("A lista está vazia ou tem apenas um elemento. Não há necessidade de ordenação.");
        }
    }

    // Função para ordenar uma lista de números inteiros usando o algoritmo Bubble Sort
    public static void ordenarLista(List<Integer> lista) {
        int n = lista.size();
        boolean trocado;

        // Loop do-while para repetir o processo de ordenação até que a lista esteja ordenada
        do {
            trocado = false;
            // Loop for para percorrer a lista e comparar elementos adjacentes
            for (int i = 1; i < n; i++) {
                if (lista.get(i - 1) > lista.get(i)) {
                    // Troca os elementos se estiverem fora de ordem
                    int temp = lista.get(i - 1);
                    lista.set(i - 1, lista.get(i));
                    lista.set(i, temp);
                    trocado = true; // Indica que houve uma troca nesta iteração
                }
            }
            n--; // Reduz o tamanho da lista para ignorar o último elemento, que já está na posição correta
        } while (trocado); // Repete o loop até que nenhuma troca seja feita em uma iteração completa
    }
}



    

