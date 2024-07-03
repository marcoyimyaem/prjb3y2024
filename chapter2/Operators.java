package chapter2;

public class Operators {
    public static void main(String[] args) {
        int i = +1;
        System.err.println(++i);
        int j = -i;
        System.out.println(j +" "+i);
        System.out.println(5%3);
        System.out.println(3<<2); //12
        //      8421
        // 0000 0000 
        // 0000 0011 3
        // 0000 1100 12
        System.out.println(1<2);
        System.out.println(1>1);
        System.out.println(1>=1);
        System.out.println(1.00+3);
        short a = 10;
        short b = 3;
    
        System.out.println(a/b);
        short p=3;
        int o=2;
        p+=o;
        boolean z=true;
        boolean x = false;
        System.out.println(z&&x);
        System.out.println(z == !x);
        String name = "Marc";
        System.out.println("Marc"==name);
        
    }
}
