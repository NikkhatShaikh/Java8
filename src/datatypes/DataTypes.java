package datatypes;

public class DataTypes {
    public static void main(String[] args) {

        // 1) primitive - Numeric & non numeric - Numeric 1) Integer 2)decimal (pointing values ex 1.01)
        // NOn_numeric - char , boolean (1 bit - true/false (0/1))

        // 2) Non_primitive - User Defined DataType - ex - Class , InterFace , array , String

        // 1- primitive
        // Numeric
       int  a = 10;
       //float
       float b=2.23f;

       // Non_numeric - 1 ) char - alphabets

        char choice = 'Y';

        // 2) boolean

        boolean isIUserActive = true;

        // Non_primitive

        // String - sequence of character
        String name= "Nikkhat";
        DataTypes obj = new DataTypes();

        System.out.println("Integer value "+a);
        System.out.println("floating value "+b);
        System.out.println(choice);
        System.out.println(isIUserActive);
        System.out.println("My Name Is "+name);

    }
}
