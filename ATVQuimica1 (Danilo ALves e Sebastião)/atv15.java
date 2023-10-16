package ATVQuimica1;

import java.util.Scanner; // Importa a classe Scanner do pacote java.util para entrada de dados do usuário

public class atv15 { // Declaração da classe chamada atv15
    public static void main(String[] args) { // Método principal do programa
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados
        
        System.out.print("Digite um número real não negativo: "); // Exibe uma mensagem solicitando um número real não negativo
        double numero = scanner.nextDouble(); // Lê o número fornecido pelo usuário
        
        if (numero >= 0) { // Verifica se o número é não negativo
            double raizQuadrada = Math.sqrt(numero); // Calcula a raiz quadrada usando a função Math.sqrt()
            System.out.printf("A raiz quadrada de %.2f é %.1f.%n", numero, raizQuadrada); // Exibe o resultado formatado
            
        } else { // Se o número for negativo
            System.out.println("Número inválido. Por favor, digite um número real não negativo."); // Exibe uma mensagem de erro
        }
        
        scanner.close(); // Fecha o objeto Scanner para evitar vazamento de recursos
    }
}

    

