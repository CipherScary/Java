package ATVMatematica1;

import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler entradas do teclado
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o valor de 'a'
        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();

        // Solicita ao usuário que insira o valor de 'b'
        System.out.print("Digite o valor de b: ");
        double b = scanner.nextDouble();

        // Solicita ao usuário que insira o valor de 'c'
        System.out.print("Digite o valor de c: ");
        double c = scanner.nextDouble();

        // Calcula o discriminante (delta) da equação quadrática
        double delta = b * b - 4 * (a * c);

        // Verifica se delta é menor que zero, o que significa que não há raízes reais
        if (delta < 0) {
            // Calcula a única raiz real (x) e a imprime
            double x = -b / (2 * a);
            System.out.println("A equação não possui raízes reais. A raiz real é: " + x);
        } else {
            // Calcula as duas raízes reais (x1 e x2) e as imprime
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("A equação possui duas raízes reais: " + x1 + " e " + x2);
        }

        // Fecha o objeto Scanner para liberar recursos
        scanner.close();
    }
}
 