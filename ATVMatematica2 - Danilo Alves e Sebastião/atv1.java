package ATVMatematica2;

public class atv1 {
    public static void main(String[] args) {
        // Definindo o volume e a altura do cilindro
        double volume = 785;
        double altura = 13; 
        double pi = 3.14;

        // Calculo do raio da base do cilindro
        double raio = Math.sqrt(volume / (pi * altura));

        // Imprime os resultados
        System.out.println("Altura do cilindro: " + altura);
        System.out.println("Raio da base do cilindro: " + raio);
    }
}
