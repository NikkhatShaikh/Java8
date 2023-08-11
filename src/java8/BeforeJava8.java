package java8;

public class BeforeJava8 {

    public static Integer getSquare(int num){
        return num*num;
    }
    public static void main(String[] args) {
        System.out.println("Square of 2 :: "+getSquare(2));
        System.out.println("Square of 4 :: "+getSquare(4));

    }
}

