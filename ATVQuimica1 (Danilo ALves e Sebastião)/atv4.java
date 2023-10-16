package ATVQuimica1;

import java.util.Scanner;

public class atv4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quatidade de Mols: ");
        int Mols = scanner.nextInt();

        System.out.print("Digite a Massa Molar ");
        int MassaMolar = scanner.nextInt();

        int Massa = Mols * MassaMolar;
        System.out.println("A massa é: " + Massa + " g");

        scanner.close();
    }
}
