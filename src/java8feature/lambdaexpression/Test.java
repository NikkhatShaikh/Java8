package java8feature.lambdaexpression;

import java8feature.lambdaexpression.interfacess.InterfaceTest;

public class Test implements InterfaceTest {
    @Override
    public void m1() {
        System.out.println("m1() implemented inside test class");
    }

    @Override
    public void m2() {
        System.out.println("m2() implemented inside test class");
    }

    @Override
    public void m3() {
        System.out.println("m3 implemented inside test class if required");
    }


    public static void main(String[] args) {
        Test test = new Test();
        test.m1();
        test.m2();
        test.m3();
    }
}
