package chapter1;

public class ConstructorLesson {
    { System.out.println("Feather2000");}
    public static void main(String[] args) {
        ConstructorLesson cn = new ConstructorLesson();
        { System.out.println("Snow");}
        Chick chooks = new Chick();
        System.out.println(chooks.name);
        Chick andoks = new Chick("andoks");
        System.out.println(andoks.name);
        Chick tamtam;
        Chick diwata = chooks;
        chooks.Chick();
        chooks.name = "chooks";
        System.out.println(chooks.name);
        Namer n1 = new Namer();
        System.out.println(n1.full);
        n1.first = "Marco";
        // n1.full = n1.first + n1.last;
        System.out.println(n1.full); //?  answer: TheodoreMoose
        
    }
    { System.out.println("Feather");}
}

class Chick{
    String name = "no name";
    public  Chick(){
        name = "no name";
        System.out.println("a new chick has hatched");
    }
    public Chick(String fname){
        name = fname;
    }
    public void Chick(){
        System.out.println("Void chick");
    }
}
class Namer{
    String first;
    String last;
    String full;
    {
        first = "Theodore";
        last = "Moose";
        full = first + last;
    }
}