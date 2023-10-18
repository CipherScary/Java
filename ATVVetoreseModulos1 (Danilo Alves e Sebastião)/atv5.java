package ATVVetoreseModulos1;

import java.util.Scanner;

public class atv5 {

    // Função para inverter uma string
    public static String inverterString(String str) {
        // Cria um objeto StringBuilder com a string fornecida e a inverte
        StringBuilder reversed = new StringBuilder(str).reverse();
        // Retorna a versão invertida da string
        return reversed.toString();
    }

    // Função para verificar se a palavra é um palíndromo
    public static boolean ehPalindromo(String palavra) {
        // Converte a palavra para letras minúsculas e verifica se é igual à sua versão invertida
        return palavra.toLowerCase().equals(inverterString(palavra).toLowerCase());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pede ao usuário que digite uma palavra para verificar se é um palíndromo
        System.out.println("Digite uma palavra para verificar se é um palíndromo: ");
        String palavra = scanner.nextLine();

        // Função 'ehPalindromo' para verificar se a palavra é um palíndromo
        if (ehPalindromo(palavra)) {
            System.out.println(palavra + " é um palíndromo.");
        } else {
            System.out.println(palavra + " não é um palíndromo.");
        }

   
        scanner.close();
    }
}
