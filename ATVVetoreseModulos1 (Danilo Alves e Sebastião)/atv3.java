package ATVVetoreseModulos1;

import java.util.Arrays;

public class atv3 {
    public static void main(String[] args){
        int[] array = {4, 7, 2, 1};
        
        // Função 'trocaPosicoes' para trocar os elementos nas posições 1 e 2
        trocaPosicoes(array, 1, 2);

        // Exibe o array após a troca na tela
        System.out.println("Array após a troca: " + Arrays.toString(array));
    }

    // Função que troca os elementos em duas posições do array
    public static void trocaPosicoes(int[] array, int pos1, int pos2) {
        // Armazena o valor do elemento na posição pos1 em uma variável temporária
        int temp = array[pos1]; // temp = 7
        
        // Substitui o valor na posição pos1 pelo valor na posição pos2
        array[pos1] = array[pos2]; // array[1] = 2
        
        // Substitui o valor na posição pos2 pelo valor temporário armazenado
        array[pos2] = temp; // array[2] = 7
    }
}
