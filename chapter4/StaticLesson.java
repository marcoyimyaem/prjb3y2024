package chapter4;

public class StaticLesson {
    static int x = 1;
    int y = 21;
    static String devMsg(){
        return "Hello from devs";
    }
    public static void main(String[] args) {
        StaticLesson sl = new StaticLesson();
        System.out.println(devMsg());
        System.out.println(x);
        System.out.println(++sl.x);
        System.out.println(x);
        System.out.println(++StaticLesson.x);
        System.out.println(x);
        sl = null;
        System.out.println(sl.x);
        Game game1 = new Game();
        Game game2 = new Game();
        Game game3 = new Game();
        Game game4 = new Game();
        Game game5 = new Game();
        game1.getScore1();
        // System.out.println(sl.y);
        System.out.println("end of prog");
    }
}

class Game{
    int set;
    int score1,score2;
    void getScore1(){

    }
    void getScore2(){
        
    }
    public static void main(String[] args) {
         System.out.println(StaticLesson.devMsg());
    }
}
