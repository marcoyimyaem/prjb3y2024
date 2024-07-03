package chapter2;

public class ConditionalStatements {
    static boolean getBoolean(){
        return true;
    }
    public static void main(String[] args) {
        int hourOfDay=20;
        int morningGrreetingCount = 0;
        // if-then
        // if(hourOfDay<11){
        //     System.out.println("Good Morning");
        //     morningGrreetingCount++;
        // }

       // if-else
        // if(hourOfDay<11){
        //     System.out.println("Good Morning");
        //     morningGrreetingCount++;
        // }
        // else
        //     System.out.println("Good Afternoon");
        // System.out.println("Welcome to SLTCFI Lab 2");

        //else-if
        if(hourOfDay>18){
            System.out.println("Good Evening");
            morningGrreetingCount++;
        }
        else if(hourOfDay>11)
            System.out.println("Good Afternoon");
        
        else
            System.out.println("Good Morning");
        System.out.println("Welcome to SLTCFI Lab 2");  
        
        // if(getBoolean())
        //     System.out.println("true parin");
        // switch statement
        int option = 4;
        switch (option) {
           
            case 1: System.out.println("you selected option 1");
                    break;
            case 2: System.out.println("you selected option 2");
                    break;
            default:
                    System.out.println("invalid input");
                    break;
            case 3: System.out.println("you selected option 3");
                    break;
            
        }
      final int po = 6;  
    switch(hourOfDay){
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case po: hourOfDay++;
        case 7:
        case 8:
        case 9:
        case 10:
        case 11: System.out.println("Good Morning");
            break;
        }
    System.out.println("end of program");
    }
    
}
