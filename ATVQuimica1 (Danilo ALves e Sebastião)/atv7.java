package ATVQuimica1;

public class atv7 {
    public static void main(String[] args){
        double v; // Velocidade Final
        double g = 9.8; // Aceleração Gravitavional 
        double h = 20; // altura

        v = Math.sqrt(2 * g * h); // Calculo da Velocidade final

        // Imprime o resultado
        System.out.println("A velocidade final é: " + v + " m/s.");
    }
}
