package ATVMatematica2;

public class atv3 {
    public static void main(String[] args) {

        // Definindo o volume do cone
        double volume = 94;

        // Definindo a altura do cone
        double altura = 9; 
        double pi = 3.14;

        // para calcular o raio da base do cone (r)
        double raio = Math.sqrt((3 * volume) / (pi * altura));

        // Imprime o resultado
        System.out.println("Raio da base do cone: " + raio);
    }
}
