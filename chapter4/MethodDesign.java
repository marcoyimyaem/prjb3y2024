package chapter4;

public class MethodDesign {
   public static void main(String[] args) {
    Dog scoobyDog = new Dog();
    scoobyDog.bark();
    System.out.println(8*scoobyDog.dogEars());
   } 
}

class Dog{
    public void bark(){
        System.out.println("arf");
    }
    private void bark(int x){
        while (x>0) {
            System.out.println("arf");
            x--;
        }
    
        
    }
    int dogEars(){
        return 2;
    }
    void pooping(){}
    public static void main(String[] args) {
        Dog snoop = new Dog();
        snoop.bark(snoop.dogEars());
    }
}
