package ATVJava;

public class SequênciaDeFibonacci {
    public static void main(String[] args){
        int num1 = 1; 
        int num2 = 0;

        System.out.println(num2);  // Imprime o primeiro número 0.
        System.out.println(num1);  // Imprime o segundo número 1.
        
        for(int i = 0; i < 8; i++){  // Loop para gerar os próximos 8 números na sequência de Fibonacci.
            num1 = num1 + num2;  // Calcula o próximo número na sequência somando os dois números anteriores.
            num2 = num1 - num2;  // Atualiza o segundo número para o valor anterior de num1.
            System.out.println(num1);  // Imprime a sequência de Fibonacci.
        }
    }
}
