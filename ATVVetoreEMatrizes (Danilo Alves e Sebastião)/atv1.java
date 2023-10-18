package ATVVetoreEMatrizes;

import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o valor da base maior do trapézio.
        System.out.print("Digite o valor da Área Maior: ");
        int baseMaior = scanner.nextInt();

        // Solicita ao usuário que insira o valor da base menor do trapézio.
        System.out.print("Digite o valor da Área Menor: ");
        int baseMenor = scanner.nextInt();

        // Solicita ao usuário que insira o valor da altura do trapézio.
        System.out.print("Digite o valor da altura: ");
        int altura = scanner.nextInt();

        // Calcula a área do trapézio chamando a função areaDoTrapezio e armazena o
        // resultado em 'resultado'.
        int resultado = areaDoTrapezio(baseMaior, baseMenor, altura);

        // Exibe a área calculada do trapézio.
        System.out.println("Área do Trapézio: " + resultado);

        // Fecha o Scanner para evitar vazamento de recursos.
        scanner.close();
    }

    // Função que calcula a área do trapézio com base nas bases e na altura.
    public static int areaDoTrapezio(int baseMaior, int baseMenor, int altura) {
        return (baseMaior + baseMenor) * altura / 2;
    }
}
