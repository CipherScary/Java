import java.util.Scanner;

public class CalculadoraDeAreaDeRetangulo {
    public static void main(String[] args) {
        // Cria um Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário para inserir a base do retângulo12
        System.out.print("Digite a base do retângulo: ");
        double base = scanner.nextDouble();
        
        // Solicita ao usuário para inserir a altura do retângulo
        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();
        
        // Calcula a área do retângulo
        double area = base * altura;
        
        // Imprime o resultado
        System.out.println("A área do retângulo é: " + area);
        
        // Fecha o Scanner para evitar vazamento de recursos
        scanner.close();
    }
}



