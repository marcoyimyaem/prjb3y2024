package chapter1;
import java.util.*;
public class PrimitiveLesson {
    int q;
    boolean w;
    Box bx;
    public static void main(String[] args) {
        System.out.println(Byte.MAX_VALUE);
        long LongSample = 9L;
        Box box1 = new Box();
        // int class = 21; //java reserved word
        int i =0;
        System.out.println(i);
        PrimitiveLesson pl = new PrimitiveLesson();
        
        // System.out.println(new PrimitiveLesson().sumOfTwoNumbers());
        System.out.println(pl.sumOfTwoNumbers());
    }
    public int sumOfTwoNumbers(){
        int a = 10;
        int b=1;
        return a+b;
    }
}

class Box{
   
}

class Dice{
    int value;
    static void sum(int... vals){
        int total=0;
        for(int val:vals){
            total+=val;
        }
        System.out.println(total);
    }
    int getValue(){
        return value;
    }
    public static void main(String[] args) {
        Random r = new Random();
        
        Dice d1 = new Dice();
        d1.value = r.nextInt(5)+1;
        Dice d2 = new Dice();
        d2.value = r.nextInt(5)+1;
        Dice d3 = new Dice();
        d3.value = r.nextInt(5)+1;
        sum(d1.value,d2.value,d3.value);
    }
}

class Tree{
    int numberOfFruit;
    int numOfLeaves;
}
