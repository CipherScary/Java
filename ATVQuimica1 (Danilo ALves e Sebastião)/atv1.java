package ATVQuimica1;

import java.util.Scanner;

public class atv1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Definindo quatidade de carbonos
        System.out.print("Digite quantos carbonos sua cadeia tem: ");
        int carbono = scanner.nextInt();

        // Calculo para saber a quantidade de hidrogenio
        int hidrogenio = 2 * carbono + 2;

        // Imprime o resultado
        System.out.println("A cadeia possui: " + hidrogenio + " hidrogenios");

        scanner.close();
    }
}
