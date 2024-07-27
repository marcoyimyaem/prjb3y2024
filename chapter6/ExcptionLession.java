
package chapter6;

public class ExcptionLession {
    public static void main(String[] args) {
//
//        catch ()
        int a,b;
        Scanner input = new Scanner(System.in);
        while(true){
            try{

                System.out.println("Enter a number: ");
                a = Integer.parseInt(input.next());
                System.out.println("Enter another number: ");
                b = Integer.parseInt(input.next());
                System.out.println(a+b);
                throw new MyMadUpException();

            }
            catch (NumberFormatException e){

//                System.out.println("Enter a valid whole number");
//                try{}
//                catch (){}

            }
            catch (MyMadUpException e){
                System.out.println("MyMadUpException called");
                break;
            }
            finally {
                System.out.println("finally");

            }
        }


    }
}
class MyMadUpException extends RuntimeException{}