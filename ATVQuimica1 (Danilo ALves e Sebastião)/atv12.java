package ATVQuimica1;

import java.util.Scanner; // Importa a classe Scanner do pacote java.util para entrada de dados do usuário

public class atv12 { // Declaração da classe chamada atv12
    public static void main(String[] args) { // Método principal do programa
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados
        
        System.out.print("Digite a massa do objeto em kg: "); // Exibe uma mensagem solicitando a massa do objeto ao usuário
        double massa = scanner.nextDouble(); // Lê a massa fornecida pelo usuário e armazena na variável 'massa'
        
        System.out.print("Digite a aceleração gravitacional do planeta em m/s²: "); // Exibe uma mensagem solicitando a aceleração ao usuário
        double aceleracao = scanner.nextDouble(); // Lê a aceleração fornecida pelo usuário e armazena na variável 'aceleracao'
     
        double peso = massa * aceleracao; // Calcula o peso usando a fórmula: Peso = Massa × Aceleração
        
        System.out.println("O peso do objeto é " + peso + " N."); // Exibe o resultado do peso calculado
        
        scanner.close(); // Fecha o objeto Scanner para evitar vazamento de recursos
    }
}


