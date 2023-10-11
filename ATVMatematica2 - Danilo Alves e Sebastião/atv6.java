package ATVMatematica2;

public class atv6 {
    public static void main(String[] args){
        double pi = 3.14159;
        double perimetroR;
        double perimetroC;
        double comprimento = 20;
        double largura = 10;
        double AreaCirculo;

        perimetroR = 2 * comprimento + 2 * largura;
        perimetroC = 60;

        double r = 60 / (2 * pi);

        AreaCirculo = pi * (r * r);

        System.out.println("A área do círculo cujo perímetro é igual ao perímetro do retângulo é aproximadamente: " + AreaCirculo);
    }
}