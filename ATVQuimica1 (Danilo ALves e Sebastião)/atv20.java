package ATVQuimica1;

import java.util.Scanner;

public class atv20 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        // Solicita a configuração eletrônica ao usuário
        System.out.print("Digite a configuração eletrônica do átomo: ");
        String configuracaoEletronica = scanner.nextLine();
        
        // Divide a configuração eletrônica em subníveis usando espaço como delimitador
        String[] subniveis = configuracaoEletronica.split(" ");
        
        int numeroEletrons = 0;
        
        // Itera sobre os subníveis e calcula o número total de elétrons
        for (String subnivel : subniveis) {
            // Remove caracteres não numéricos para obter o número de elétrons no subnível
            int eletronsSubnivel = Integer.parseInt(subnivel.replaceAll("\\D", ""));
            numeroEletrons += eletronsSubnivel;
        }
        
        // Exibe o resultado
        System.out.println("O átomo possui " + numeroEletrons + " elétrons.");
        
        scanner.close();
    }
}

    

