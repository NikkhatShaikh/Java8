package java8feature.lambdaexpression;

import java8feature.lambdaexpression.interfacess.LambdaDemoInterface;

public class LambdaDemoClass {
    public static void main(String[] args) {
        LambdaDemoInterface lambdaDemo = n -> n * n;
        System.out.println("Square :: " + lambdaDemo.squareIt(2));

        // note : lambda is provided implementation abstract method of functional Interface
        // LambdaDemoInterface is a functional Interface
    }
}
