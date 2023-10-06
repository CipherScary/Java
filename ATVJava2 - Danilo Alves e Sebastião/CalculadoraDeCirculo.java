import java.util.Scanner;

public class CalculadoraDeCirculo {
    public static void main(String[] args) {
        // Cria um Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário para inserir o raio do círculo
        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();
        
        // Calcula a área do círculo
        double area = Math.PI * raio * raio;
        
        // Calcula o perímetro do círculo (também conhecido como circunferência)
        double perimetro = 2 * Math.PI * raio;
        
        // Imprime a área e o perímetro do círculo
        System.out.println("A área do círculo é: " + area);
        System.out.println("O perímetro do círculo é: " + perimetro);
        
        // Fecha o Scanner para evitar vazamento de recursos
        scanner.close();
    }
}
    

