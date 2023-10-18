package ATVVetoreseModulos1;

import java.util.Arrays;

public class atv2 {
    public static void main(String[] args) {
        // Array 
        int [] array = {2, 3, 6, 8, 10, 11};
        
        // Função 'somaPares' para calcular a soma dos números pares do array
        int resultado = somaPares(array);

        // Imprime o array fornecido na tela
        System.out.println("Array fornecido: " + Arrays.toString(array));

        // Imprime a soma dos números pares na tela
        System.out.println("Soma dos números pares: " + resultado);
    }

    // Função que calcula a soma dos números pares em um array
    public static int somaPares(int[] array){
        int soma = 0;
        
        // Itera sobre cada número no array
        for (int num : array){
            // Verifica se o número é par (resto da divisão por 2 é 0)
            if (num % 2 == 0){
                // Se for par, adiciona o número à soma
                soma += num;
            }
        }
        
        // Retorna a soma dos números pares
        return soma;
    }
}
