package java8feature.lambdaexpression;

import java8feature.lambdaexpression.interfacess.Left;
import java8feature.lambdaexpression.interfacess.Right;

public class DefaultMethodTest implements Left, Right {

    @Override
    public void m1() {
//        Left.super.m1();
//        Right.super.m1();
        System.out.println("own M1 method");
    }

    public static void main(String[] args) {
        DefaultMethodTest test= new DefaultMethodTest();
        test.m1();

    }


}
