import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        // Cria um Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário para inserir um número
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        // Verifica se o número é par ou ímpar e imprime o resultado
        if (numero % 2 == 0) {
            System.out.println(numero + " é um número par.");
        } else {
            System.out.println(numero + " é um número ímpar.");
        }
        
        // Fecha o Scanner para evitar vazamento de recursos
        scanner.close();
    }
}


