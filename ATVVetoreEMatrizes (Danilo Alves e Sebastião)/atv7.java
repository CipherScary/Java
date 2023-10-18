package ATVVetoreEMatrizes;

import java.util.Scanner;

public class atv7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite o raio da esfera
        System.out.print("Digite o raio da esfera: ");
        double raio = scanner.nextDouble();

        // Verifica se o raio é negativo
        if (raio < 0) {
            // Se for negativo, imprime uma mensagem de erro
            System.out.println("Raio inválido. Por favor, digite um valor não-negativo.");
        } else {
            // Se for não-negativo, calcula o volume da esfera usando a função
            // calcularVolumeEsfera
            double volume = calcularVolumeEsfera(raio);
            // Imprime o resultado do volume com três casas decimais
            System.out.printf("Volume da esfera: %.3f\n", volume);
        }

        scanner.close();
    }

    // Função para calcular o volume de uma esfera com base no raio
    public static double calcularVolumeEsfera(double raio) {
        double pi = Math.PI; // Valor de pi
        // Fórmula para calcular o volume da esfera: (4/3) * pi * raio^3
        double volume = (4.0 / 3.0) * pi * Math.pow(raio, 3);
        return volume; // Retorna o volume calculado
    }
}
