package ATVQuimica1;

import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo quatidade de carbonos
        System.out.print("Digite quantos carbonos sua cadeia tem: ");
        int nota = scanner.nextInt();

        // Função if 
        if (nota >= 6) {
            System.out.println("A cadeia possui 4 carbonos secundários e 1 carbono terciário.");
        } else if (nota >= 5) {
            System.out.println("A cadeia possui 2 carbonos secundários e 3 carbonos terciário");
        } else if (nota >= 4) {
            System.out.println("A cadeia possui 2 carbonos secundários e 2 carbonos terciário");
        } else if (nota >= 3) {
            System.out.println("Todos os carbonos secundários.");
        } else if (nota >= 2) {
            System.out.println("não há carbonos secundários ou terciários.");
        } 
        scanner.close();
    }
}
