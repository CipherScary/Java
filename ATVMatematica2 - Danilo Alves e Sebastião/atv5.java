package ATVMatematica2;

public class atv5 {
    public static void main (String[] args){

        // Definindo o volume do cubo
        double volume = 512;
        double L;

        // calculo da aresta
        L =  Math.cbrt(volume);

        // Imprime o resultado
        System.out.println("O comprimento de uma aresta do cubo é: " + L);
    }
}
