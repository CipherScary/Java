package ATVJava;

public class LogaritmoNaBase10 {
    public static void main(String[] args){
        double a = 1000;
        double b = 145.256;
        double c = -6.04;
        double d = 1.0 / 0;
        double e = 0;
  
        // A power of 10 as input
        System.out.println(Math.log10(a));
  
        // positive double value as argument,
        // output double value
        System.out.println(Math.log10(b));
  
        // negative integer as argument,
        // output NAN
        System.out.println(Math.log10(c));
  
        // positive infinity as argument,
        // output Infinity
        System.out.println(Math.log10(d));
  
        // positive zero as argument,
        // output -Infinity
        System.out.println(Math.log10(e));
    }
}