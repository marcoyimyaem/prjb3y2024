package chapter4;

public class ConstructorLesson {
    int value_x;
    final int F_VALUEX;
    ConstructorLesson(){
        value_x = 10;
        F_VALUEX = 10000;
        System.out.println("generated a default value");
    }
    void ConstructorLesson(){
        value_x = 10000;
    }
    public static void main(String[] args) {
        ConstructorLesson cl1 = new ConstructorLesson();
        cl1.ConstructorLesson();
        System.out.println(cl1.value_x);
    }
}
// Create a a program where user inputs two numbers and 
// perform 4 basic arithmetic operations using 4 methods 
// with return types and print the results.