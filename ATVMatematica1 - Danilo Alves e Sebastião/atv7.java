package ATVMatematica1;

import java.util.Scanner;

public class atv7 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14159;
        double Volume;

        System.out.print("Digite o valor de r: ");
        double r = scanner.nextDouble();

        Volume = 4 * pi * (r * r * r) / 3;

        System.out.println("O Volume da Esfera é aproximadamente: " + Volume);
        scanner.close();
    }
}
