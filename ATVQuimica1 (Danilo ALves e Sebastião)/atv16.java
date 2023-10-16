package ATVQuimica1;

import java.util.Scanner;

public class atv16 { 
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        // Solicita o número ao usuário,
        System.out.print("Digite um número real: ");
        double numero = scanner.nextDouble();
        
        // Calcula o valor absoluto usando Math.abs()
        double valorAbsoluto = Math.abs(numero);
        
        // Exibe o resultado
        System.out.printf("O valor absoluto de %.2f é %.2f.%n", numero, valorAbsoluto);
        
        scanner.close();
    }
}


    

