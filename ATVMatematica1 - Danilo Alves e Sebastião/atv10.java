package ATVMatematica1;

import java.util.Scanner;

public class atv10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de r: ");
        double r = scanner.nextDouble();

        System.out.print("Digite o valor de h: ");
        double h = scanner.nextDouble();

        double pi = 3.14159;
        double V;

        V = pi * (r * r) * h;

        System.out.println("O Volume do cilindro é aproximadamente: " + V);

        scanner.close();
    }
}
