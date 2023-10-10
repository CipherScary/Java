package ATVMatematica1;

import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler entradas do teclado
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        double c;
        double hipotenusa;

        // Solicita ao usuário que insira o valor de 'a'
        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();

        // Solicita ao usuário que insira o valor de 'b'
        System.out.print("Digite o valor de b: ");
        double b = scanner.nextDouble();

        // Calcula o quadrado da hipotenusa usando o teorema de Pitágoras
        c = (a * a) + b * b;

        // Calcula a hipotenusa tomando a raiz quadrada do valor calculado acima
        hipotenusa = Math.sqrt(c);

        // Imprime o valor da hipotenusa
        System.out.println("A Hipotenusa é: " + hipotenusa);

        // Fecha o objeto Scanner para liberar recursos
        scanner.close();
    }
}
