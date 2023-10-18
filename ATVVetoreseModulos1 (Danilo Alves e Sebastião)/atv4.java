package ATVVetoreseModulos1;

import java.util.Scanner;

public class atv4 {
    // Função para calcular a soma dos dígitos
    public static int somaDigitos(int numeros) {
        int soma = 0;
        while (numeros > 0) {
            int  numero = numeros % 10;  // Consegue o último dígito
            soma += numero;
            numeros /= 10;  // Remove o último dígito
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numeros = scanner.nextInt();

        int resultado = somaDigitos(numeros);

        // Imprime o resultado
        System.out.println("Soma dos dígitos: " + resultado);

        scanner.close();
    }
}
