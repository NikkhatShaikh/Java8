package java8feature.lambdaexpression;

import java8feature.lambdaexpression.interfacess.FunctionalInterface;

public class FunctionalInterfaceImpl implements FunctionalInterface {
    @Override
    public void print() {
        System.out.println(" I called print() method From FunctionalInterfaceImpl class ");
    }
}
