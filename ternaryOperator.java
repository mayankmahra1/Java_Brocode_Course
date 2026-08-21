public class ternaryOperator {

    public static void main(String[] args) {

        // in java the ternary operator is a question mark, followed by one or 2 possible values
        // ? = returns 1 of 2 values if a condition is true 

        // formula ->  variable = (condition) ? ifTrue : ifFalse        
        // its a simpler version to an if else statement 

        int score = 60; 
        String passOrFail = (score >= 40) ? "PASS" : "FAIL"; 
        System.out.println(passOrFail);

        int age = 17; 
        String isAdult = (age >= 18) ? "Adult present" : "Minor present"; 
        System.out.println(isAdult);

        int hours = 13; 
        String timeOfDay = (hours < 12) ? "A.M." : "P.M.";
        System.out.println(timeOfDay);

        


    }
}