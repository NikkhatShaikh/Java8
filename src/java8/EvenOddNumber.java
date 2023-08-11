package java8;

import java.util.function.Predicate;

public class EvenOddNumber {

    public static void main(String[] args) {

        Predicate<Integer> even= i-> i%2==0;
        System.out.println("4 is even : "+even.test(4));
        System.out.println("5 is even : "+even.test(5));
    }
}
