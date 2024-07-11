package chapter3;
import java.util.*;
public class ArrayLesson {
    public static void main(String... args) {
        int[] numbers2 = new int[]{42,55,99};
        System.out.println(numbers2[2]);
        String[] birds = new String[6];
        System.out.println(birds.length);
        int[] numbers3 = {42,55,99,11,54,66,78,36,45,11,7005,225,2255,2,4,5};
        Arrays.sort(numbers3);
        for (int i : numbers3) {

            System.out.print(i+",");
        }
        System.out.println("Sort for Strings");
        String[] numStrings = {"42","55","99","11","54","66","78","36","45","11","7005","225","2255","2","4","5"};
        Arrays.sort(numStrings);
        for (String string : numStrings) {
                System.out.print(string+",");
            
        }
        System.out.println();
     
    int[] numbars = {2,4,6,8,99};
    System.out.println(Arrays.binarySearch(numbars, 100));
    }
}
