package ATVVetoreseModulos1;

import java.util.Scanner;

public class atv1 {
    // Função que realiza a multiplicação de dois números inteiros
    public static int multiplicacao(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Peda ao usuário que digite o primeiro número
        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();

        // Pede ao usuário que digite o segundo número
        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();

        // Chama a função 'multiplicacao' para calcular o resultado
        int resultado = multiplicacao(a, b);

        // Imprime o resultado da multiplicação
        System.out.println("Resultado: " + resultado);

        
        scanner.close();
    }
}
