package AULA6;

import java.util.Scanner;

public class atv7 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário a partir do teclado
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite uma frase
        System.out.print("Digite uma frase: ");
        
        // Lê a frase fornecida pelo usuário e armazena-a na variável 'frase'
        String frase = scanner.nextLine();

        // Chama a função contarVogais passando a frase como argumento e armazena o resultado em 'numeroDeVogais'
        int numeroDeVogais = contarVogais(frase);

        // Imprime o número de vogais na frase
        System.out.println("Número de vogais: " + numeroDeVogais);
    }

    // Função que conta o número de vogais na frase fornecida
    public static int contarVogais(String frase) {
        int contadorVogais = 0;
        String vogais = "aeiouAEIOU"; // String contendo todas as vogais

        // Loop que percorre cada caractere da frase
        for (int i = 0; i < frase.length(); i++) {
            char caractere = frase.charAt(i); // Obtém o caractere na posição 'i'

            // Verifica se o caractere é uma vogal (se estiver presente na string 'vogais')
            if (vogais.indexOf(caractere) != -1) {
                contadorVogais++; // Incrementa o contador de vogais
            }
        }

        // Retorna o número total de vogais encontradas na frase
        return contadorVogais;
    }
}

    

