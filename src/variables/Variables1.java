package variables;

// types of variables - 1) - local variables  2)instance variable 3) static variable


public class Variables1 {

    // instance variable  - declared inside the class and outside the method
    int a = 20 ;
    static  int salary  = 25000; // static variable - declared using static keyword - used for memory management

    public static void main(String[] args) {

        // 1-  local variable - its declare inside the method
        String name= "zoya";

        Variables1 obj1 = new Variables1();

        System.out.println(obj1.a);
        System.out.println(salary);
        System.out.println(name);
        System.out.println("name is "  +name +" \n emp_id is " +obj1.a+ " \n  salary is " +salary);

    }
}
