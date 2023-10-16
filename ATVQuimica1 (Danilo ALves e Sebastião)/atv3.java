package ATVQuimica1;

import java.util.Scanner;

public class atv3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Definindo quatidade de massa
        System.out.print("Digite a massa (g): ");
        int Massa = scanner.nextInt();

        // Definindo quatidade de massa molar
        System.out.print("Digite a massa molar (g/mol): ");
        int MassaMolar = scanner.nextInt();

        // Calculo mol
        int mols = Massa / MassaMolar;

        // Imprime o resultado
        System.out.println("A quantidade de mols é: " + mols);

        scanner.close();
    }
}
