package java8feature.lambdaexpression;

public class AnonymousLambdaClass {
    public static void main(String[] args) {

        Runnable runnable= ()->{
            for (int i=1;i<=10;i++){
                System.out.println(" child class thread");
            }
        };

        Thread t = new Thread(runnable);
        t.start();

        for (int i=1;i<=10;i++){
            System.out.println("main thread");
        }
    }
}
