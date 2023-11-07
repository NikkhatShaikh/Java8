package java8feature.lambdaexpression;

public class LambdaWithThread {
    public static void main(String[] args) {

        Runnable runnable = ()->{
            System.out.println("********Table of 2 *********");

            for (int i =1 ; i<=10 ;i++){
                System.out.println("2 X "+i+ " = "+2*i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }

        };

        Thread t1 = new Thread(runnable);
        t1.setName("First Thread");
        t1.start();
    }

}
