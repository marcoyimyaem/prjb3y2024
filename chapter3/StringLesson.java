package chapter3;

public class StringLesson {
    public static void main(String[] args) {
        String Lastname = "Yim"; // for G.C
        Lastname = "Yimyaem";
        Lastname.toUpperCase();
        System.out.println(Lastname);
        System.out.println(Lastname.replace('Y', 'X').replace('y','x'));
        String stringTrim = "\t   \ta b c \n \n ";
        System.out.println(stringTrim.trim());
    } 
}
