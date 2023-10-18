package AULA6;

import java.util.Scanner;

public class atv10 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in); 

        // Solicita ao usuário que digite as notas separadas por espaços
        System.out.print("Digite as notas separadas por espaços: ");

        // Lê a entrada do usuário como uma string
        String entrada = scanner.nextLine();

        // Divide a string de entrada em partes usando espaços como delimitadores e armazena em um array de strings
        String[] notasArray = entrada.split(" ");

        double soma = 0.0; // Variável para armazenar a soma das notas
        int quantidadeDeNotas = 0; // Variável para contar a quantidade de notas fornecidas

        // Loop para percorrer o array de strings e calcular a soma das notas e contar a quantidade de notas
        for (String notaStr : notasArray) {
            try {
                // Converte a string para double e adiciona à soma
                double nota = Double.parseDouble(notaStr);
                soma += nota;
                quantidadeDeNotas++;
            } catch (NumberFormatException e) {
                // Se a conversão falhar, imprime uma mensagem de erro e sai do programa
                System.out.println("Erro: Entrada inválida. Certifique-se de inserir números válidos.");
                return;
            }
        }

        // Verifica se pelo menos uma nota foi inserida
        if (quantidadeDeNotas > 0) {
            // Calcula a média dividindo a soma pelo número de notas
            double media = soma / quantidadeDeNotas;

            // Imprime a média das notas
            System.out.println("Média das notas: " + media);
        } else {
            // Se nenhuma nota foi inserida, imprime uma mensagem de erro
            System.out.println("Erro: Nenhuma nota válida foi inserida.");
        }
    }
}

    
