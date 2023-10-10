package ATVMatematica1;
import java.util.Scanner;
public class atv6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de h: ");
        double h = scanner.nextDouble();

        double A;

        A = (a + b)* h /2;

        System.out.println("Area do trapezio e: " + A);
        scanner.close();
    }
}
