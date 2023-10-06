package ATVJava;

public class MenorDivisorDeUmNumero {
    public static void main (String[] args) {
        int numero = 12; // declara numero
        int menorDivisor = 1; // declara maior divisor

        for (int i = numero; i>1; i--){ // loop for
            if (numero % i == 0) { // comando if
                menorDivisor = i; 
            }
        }
        System.out.println("O menor divisor é:" + menorDivisor); // imprime o menor divisor
    }
}
