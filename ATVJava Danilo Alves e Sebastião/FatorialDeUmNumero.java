package ATVJava;

public class FatorialDeUmNumero { 
    public static void main(String[] args){
        int fat = 1;  // declara uma variavel
        int valor = 5;  // declara numero
            for(int i = 2;i <= valor;i++){  // loop for
                fat *= i;
            }System.out.println("O fatorial de " + valor + " é igual a " + fat );  // imprime o fatorial
    }
}
