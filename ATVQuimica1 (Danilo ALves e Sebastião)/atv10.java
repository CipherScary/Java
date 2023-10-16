package ATVQuimica1;

public class atv10 {
    public static void main (String[] args){
        double potencia;
        double resistencia = 8; // Valor da resistencia
        double tensao = 24; // Valor tensão

        potencia = (tensao * tensao) / resistencia; // Calculo da potencia

        // Imprime o resultado
        System.out.println("A potência dissipada é: " + potencia + "W");
    }
}
