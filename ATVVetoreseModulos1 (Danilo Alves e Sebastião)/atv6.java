package ATVVetoreseModulos1;

import java.util.Set;
import java.util.HashSet;

public class atv6 {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 2, 1, 4, 5, 3};
        Set <Integer> set = new HashSet<>();
        for (int a: array){
            set.add(a);
        }
        System.out.println(set);
    }
}