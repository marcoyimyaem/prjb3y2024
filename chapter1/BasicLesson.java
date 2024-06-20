 package chapter1;
 public class BasicLesson{

 }
 class Main{
    //public static void main(String[] args) {}
    //static public void main(String[] args) {}
    //public static void main(String[] marc) {}
    //psvm
    public static void main(String[] args) {
        Client c1 = new Client();
        System.out.println("Hello Worldz");
    }
   

}
/*
 * this
 * is
 * a 
 * multiline
 * comment
 */
/**
 * Client object lorem ipsum...
 * @author Marco Yimyaem
 * @param not aplicable
 */
 class Client{
    String Lname; // clients last name
    String Fname; // clients first name
    String Address;
    int idNum;
    String accType;
    
}
class Transactions{
    // DateTime transDate;
    String transType;
    int amount;
    int idNum;
}