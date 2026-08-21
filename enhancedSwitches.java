public class enhancedSwitches {

    public static void main(String[] args) {
        
        // Enhanced switch = A relpacement to many else if statements in java 

        // Heres an example where we use many else if statements 
        // this code does work but it could be more efficient
        // we have a lot of redundancies 
        // we are using a lot of else if statements that are basically doing the same thing 

        String day = "Sunday"; 

        if (day.equals("Monday")) {
            System.out.println("Its a weekday");
        }
        else if (day.equals("Tuesday")) {
            System.out.println("Its a weekday");
        }
        else if (day.equals("Wednesday")) {
            System.out.println("Its a weekday");
        }
        else if (day.equals("Thursday")) {
            System.out.println("Its a weekday");
        }
        else if (day.equals("Friday")) {
            System.out.println("Its a weekday");
        }
        else if (day.equals("Saturday")) {
            System.out.println("Its a weekend");
        }
        else if (day.equals("Sunday")) {
            System.out.println("Its a weekend");
        }
        else{
            System.out.println("Its not a day");
        }
        System.out.println();



        // Enhanced Switch 
        // similar setup to an if statement
        // within the set of parenthesis we are going to examine a value or variable
        // we will examine this value against any matching cases
        // the first case will be a string called monday
        // if day is equal to monday 
        // then we use the arrow operator which means do something 
        switch(day){
            case "Monday" -> System.out.println("Its a weekday");
            case "Tuesday" -> System.out.println("Its a weekday");
            case "Wednesday" -> System.out.println("Its a weekday");
            case "Thursday" -> System.out.println("Its a weekday");
            case "Friday" -> System.out.println("Its a weekday");
            case "Saturday" -> System.out.println("Its a weekend");
            case "Sunday" -> System.out.println("Its a weekend");
            default -> System.out.println("Not a day");
        }
        System.out.println();

       // we can improve the switch even futher
       // we have two or more cases doing the same thing
       // 5 cases print the same the Its a weekday
       // we can consolodate some of these cases 

    switch(day){
        case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("Its a weekday");
        case "Saturday", "Sunday" -> System.out.println("Its a weekend");
        default -> System.out.println("Not a day");
    }
    



        

      
    }
}