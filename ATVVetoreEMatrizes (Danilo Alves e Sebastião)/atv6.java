package ATVVetoreEMatrizes;

import java.util.Scanner;

public class atv6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite um número
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Verifica se o número é negativo
        if (numero < 0) {
            // Se for negativo, imprime uma mensagem de erro
            System.out.println("Número inválido. Por favor, digite um número não-negativo.");
        } else {
            // Se for não-negativo, calcula o fatorial do número usando a função
            // calcularFatorial
            long resultado = calcularFatorial(numero);
            // Imprime o resultado do fatorial
            System.out.println("Fatorial de " + numero + ": " + resultado);
        }

        scanner.close();
    }

    // Função para calcular o fatorial de um número usando recursão
    public static long calcularFatorial(int numero) {
        // Caso base: se o número é 0 ou 1, retorna 1
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            // Caso recursivo: calcula o fatorial chamando a função para número - 1 e
            // multiplicando pelo número atual
            return numero * calcularFatorial(numero - 1);
        }
    }
}
