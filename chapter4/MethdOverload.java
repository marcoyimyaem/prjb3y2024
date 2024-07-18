package chapter4;

public class MethdOverload {
    void MethdOverload(){

    }
    MethdOverload(){}
    public void fly(int numMiles) { System.out.println("int"); }
    public void fly(short numFeet) { System.out.println("short"); }
    public boolean fly() { return false; }
    int fly(int height, int speed){ return height;}
    void fly(int numMiles, short numFeet) { }
    public void fly(short numFeet, int numMiles) throws Exception { }
    public void fly(String s) {
        System.out.println("string ");
        }
    public void fly(Object o) {
        System.out.println("object ");
        }
    public void fly(int... x){ System.out.println("varargs");}
    public static void main(String[] args) {
        MethdOverload mo1 = new MethdOverload();
        System.out.println(mo1.fly());
        mo1.fly(3);
        mo1.fly(10,90);
        mo1.fly((short)3);
        mo1.fly("try");
        mo1.fly(new Grass());
    }
}
class Grass{

}