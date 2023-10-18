package ATVVetoreEMatrizes;

import java.util.Scanner;

public class atv5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite um número
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Verifica se o número é divisível por 4 e por 7
        if (verificarDivisibilidade(numero, 4) && verificarDivisibilidade(numero, 7)) {
            System.out.println("O número é divisível por 4 e 7.");
        } else {
            System.out.println("O número não é divisível por 4 e 7.");
        }

        scanner.close();
    }

    // Função para verificar se um número é divisível por outro número
    public static boolean verificarDivisibilidade(int numero, int divisor) {
        // Verifica se o número é divisível pelo divisor
        if (numero % divisor == 0) {
            return true; // Se for divisível, retorna verdadeiro
        } else {
            return false; // Se não for divisível, retorna falso
        }
    }
}
