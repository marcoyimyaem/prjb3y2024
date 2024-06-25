package chapter1;

public class GarbageCollection {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box();
        Box b3 = b1;
        b1 = null;
        b1 = new Box();
        b2 = b3;
        b3 = null;
        int x = 1;
        System.gc();
    }
}
