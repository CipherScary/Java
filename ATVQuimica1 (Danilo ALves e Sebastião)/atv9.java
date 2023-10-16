package ATVQuimica1;
public class atv9 {
    public static void main (String[] args) {

        double resistencia;
        double corrente = 2; // Valor da corrente
        double tensao = 12; // Valor da tensão 

        resistencia = tensao / corrente; // Calculo da resistencia

        // Imprime o resultado
        System.out.println("A resistência é: " + resistencia + "ohms");
    }
}
