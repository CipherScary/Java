package ATVVetoreseModulos1;

import java.util.Scanner;

public class atv9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (ehPrimo(numero)) {
            System.out.println("O número é primo.");
        } else {
            System.out.println("O número não é primo.");
        }
        scanner.close();
    }

    private static boolean ehPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
        }
        return true;
    }
}



