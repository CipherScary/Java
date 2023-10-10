package ATVMatematica1;

import java.util.Scanner;
public class atv5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;
        double A;

        System.out.print("Digite o valor de r: ");
        double r = scanner.nextDouble();

        A = pi * (r * r);
        System.out.println("A Area é: " + A);
        scanner.close();
    }
}
