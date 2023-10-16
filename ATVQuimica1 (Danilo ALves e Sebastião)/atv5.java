package ATVQuimica1; 

import java.util.Scanner; 

public class atv5 { 
    public static void main(String[] args){ 
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("Digite a quatidade total de eletrons: "); 
        int Totaleletrons = scanner.nextInt(); // Quantidade total de elétrons fornecida pelo usuário
        
        int n = 1; // Variável que representa o número da camada
        int eletronsRestantes = Totaleletrons; // Variável que armazena o número de elétrons restantes
        
        while (eletronsRestantes > 0){ // Loop 
            int capacidadeCamada = 2 * n * n; // Calcula a capacidade da camada atual usando a fórmula 
            int eletronsCamada = Math.min(capacidadeCamada, eletronsRestantes); // Calcula o número de elétrons na camada atual, limitado pela capacidade da camada
            
            System.out.println("Camada " + n + ": " + eletronsCamada + " eletrons"); // Imprime a camada atual e o número de elétrons nela
            
            eletronsRestantes -= eletronsCamada; 
            n++; 
        
        
        }
        scanner.close(); 
    }
}