package java8feature;

import java.util.function.Function;

public class AfterJava8 {

    public static void main(String[] args) {
        // first Integer is -> input type ---- second Integer is return Type
        // function is the name of the function
        Function<Integer,Integer> function = i ->i*i;
        System.out.println("Square of 2 :: "+function.apply(2));
        System.out.println("Square of 4 :: "+function.apply(4));
    }

}
