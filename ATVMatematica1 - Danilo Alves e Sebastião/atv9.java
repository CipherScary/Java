package ATVMatematica1;
import java.util.Scanner;
public class atv9 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de l: ");
        double l = scanner.nextDouble();

        System.out.print("Digite o valor de h: ");
        double h = scanner.nextDouble();
        
        double V;
        double Ab; 

        Ab = (l * l);
        V = Ab * h  / 3;
        System.out.println("o volume da piramide é: " + V );


        scanner.close();
    } 
    
}
