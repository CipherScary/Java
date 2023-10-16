package ATVQuimica1;

import java.util.Scanner; // Importa a classe Scanner do pacote java.util para entrada de dados do usuário

public class atv13 { // Declaração da classe chamada atv13
    public static void main(String[] args) { // Método principal do programa
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados
        
        System.out.print("Digite o comprimento da aresta do cubo em cm: "); // Exibe uma mensagem solicitando o comprimento da aresta ao usuário
        double aresta = scanner.nextDouble(); // Lê o comprimento da aresta fornecido pelo usuário e armazena na variável 'aresta'
        
        double volume = Math.pow(aresta, 3); // Calcula o volume do cubo usando a fórmula: Volume = Aresta^3
        
        System.out.println("O volume do cubo é " + volume + " cm³."); // Exibe o resultado do volume calculado
        
        scanner.close(); // Fecha o objeto Scanner para evitar vazamento de recursos
    }
}


