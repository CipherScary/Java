package ATVMatematica2;


public class atv2 {
    public static void main(String[] args) {
       
        // Solicita ao usuário a entrada da área da superfície
        double area = 154;
        double pi = 3.14;

        // calculo do raio da esfera (r)
        double raio = Math.sqrt(area / (4 * pi));

        // Imprime o resultado
        System.out.println("Raio da esfera: " + raio);
    }
}
