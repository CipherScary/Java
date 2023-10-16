package ATVQuimica1;

import java.util.Scanner; // Importa a classe Scanner do pacote java.util para entrada de dados do usuário

public class atv14 { // Declaração da classe chamada atv14
    public static void main(String[] args) { // Método principal do programa
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados
        
        // Solicita o raio ao usuário
        System.out.print("Digite o raio da esfera em cm: "); // Exibe uma mensagem solicitando o raio da esfera ao usuário
        double raio = scanner.nextDouble(); // Lê o raio fornecido pelo usuário e armazena na variável 'raio'
        
        double area = 4 * Math.PI * Math.pow(raio, 2); // Calcula a área da superfície da esfera usando a fórmula: Área = 4 * π * raio^2
        
        System.out.printf("A área da superfície da esfera é aproximadamente %.2f cm².%n", area); // Exibe o resultado da área calculada
        
        scanner.close(); // Fecha o objeto Scanner para evitar vazamento de recursos
    }
}


    
