import java.util.Scanner;

public class Enums {
    // NOTE THE Day JAVA FILE IS APART OF THIS LESSON 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Enums = (Short for Enumerartions) A special kind of class that represents a fixed set of constants 
        // They improve code readability and are easy to maintain 
        // One benefit of enums is that they are more efficient with switches rather than comparing strings 
        // Basically Enum is a speical kind of class where we declare constants 

        // Enum is a speical kind of class like the same way an interface is 


        // we will create a day object by uisng this enum class 
        // rather than using Day day = new Day(1); and passing in the one like this theres a diff approach
        // We will create our day object set it equals to and then access the Day class followed by the dot operator and the
        // constant of our choice. 

        Day day = Day.MONDAY;

        // if we output our day object direclty it outputs the name of the enum constant ie SUNDAY
        System.out.println(day);
        System.out.println();

        // if u would rather get the day number the value thats associated with this enum constant thne u can use that 
        // getter method we created 
        System.out.println(day.getDayNumber());
        System.out.println();


        // This is really going to be helpful when working with switches. Heres an eg 
        // we will acc use an enhanced switch. what are examining
        // we are examiing our day object. If our day matches a case of MONDAY
        // now this isnt a string if it were we would enclose it with quotes
        // using enums in a switch is faster than using strings 

        switch(day){

            case MONDAY, 
                 TUESDAY, 
                 WEDNESDAY, 
                 THURSDAY, 
                 FRIDAY -> System.out.println("Its a weekday");
            // case TUESDAY -> System.out.println("Its a weekday");
            case SATURDAY, 
                 SUNDAY -> System.out.println("Its a weekend");

        }
        System.out.println();






        // we can also add user input
        System.out.print("Enter a day of the week ");
        String response = scanner.nextLine().toUpperCase(); 

        // if we user enters pizza day we get an error 
        // dangerous code so we need a a try and catch block 

        
        try {
                Day day2 = Day.valueOf(response); 

                switch(day2){
                    case MONDAY, 
                        TUESDAY, 
                        WEDNESDAY, 
                        THURSDAY, 
                        FRIDAY -> System.out.println("Its a weekday");
                    // case TUESDAY -> System.out.println("Its a weekday");
                    case SATURDAY, 
                        SUNDAY -> System.out.println("Its a weekend");
        }
       } catch (IllegalArgumentException e) {
        System.out.println("This day does not exist ");
       }


       // Enums are more efficent with switches than strings 
       







        scanner.close();
    }
}