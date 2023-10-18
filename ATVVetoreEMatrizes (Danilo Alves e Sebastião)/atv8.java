package ATVVetoreEMatrizes;

import java.util.Scanner;
import java.util.stream.IntStream;

public class atv8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite um número
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Verifica se o número é perfeito
        if (verificarNumeroPerfeito(numero)) {
            System.out.println("O número é perfeito.");
        } else {
            System.out.println("O número não é perfeito.");
        }

        scanner.close();
    }

    // Função para verificar se um número é perfeito
    public static boolean verificarNumeroPerfeito(int numero) {
        // Calcula a soma dos divisores próprios (excluindo o próprio número)
        int somaDivisores = IntStream.range(1, numero)
                .filter(i -> numero % i == 0)
                .sum();

        // Verifica se a soma dos divisores é igual ao número original
        return somaDivisores == numero;
    }
}
