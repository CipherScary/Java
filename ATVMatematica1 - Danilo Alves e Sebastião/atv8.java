package ATVMatematica1;

import java.util.Scanner;

public class atv8 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();

        double V;
        double As;

        As = 6 * (a * a);
        System.out.println("Area superficial do cubo é: " + As);

        V = (a * a * a);

        System.out.println("Volume do cubo é: " + V);


        scanner.close();
    }
    
}
