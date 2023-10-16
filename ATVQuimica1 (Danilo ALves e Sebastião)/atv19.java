package ATVQuimica1;

import java.util.Scanner;

public class atv19 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            // Solicita a configuração eletrônica ao usuário
            System.out.print("Digite a configuração eletrônica do átomo: ");
            String configuracaoEletronica = scanner.nextLine();
            
            // Divide a configuração eletrônica em subníveis usando espaço como delimitador
            String[] subniveis = configuracaoEletronica.split(" ");
            
            // Obtém o último subnível preenchido
            String ultimoSubnivel = subniveis[subniveis.length - 1];
            
            // Exibe o resultado
            System.out.println("O último subnível preenchido é " + ultimoSubnivel + ".");
            
            scanner.close();
        }
    }
  
    
    



