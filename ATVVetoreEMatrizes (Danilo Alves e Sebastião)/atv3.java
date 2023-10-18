package ATVVetoreEMatrizes;

import java.util.Scanner;

public class atv3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do Lado do Quadrado: ");
        int Lado = scanner.nextInt();

        int resultado = Perimetro(Lado);

        System.out.println("Perímetro do quadrado: " + resultado);

        scanner.close();
    }

    public static int Perimetro(int Lado){
    return (4 * Lado); 
    }
}