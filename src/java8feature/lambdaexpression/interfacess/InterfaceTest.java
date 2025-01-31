package java8feature.lambdaexpression.interfacess;

public interface InterfaceTest {


    public abstract void m1();
    public abstract void m2();

    default void m3() {
        System.out.println("Default Method");
    }


}
