import java.util.Scanner; 


// a scanner is an object which allows us to accept user input in java 
// but in order to use it we need to important from the utilities package 

// util is a package and scanner is a class
// package is lower case class is uppercase 


public class userInput
{
    public static void main(String[] args)
    {
        // to accept user input we create a scanner object 

        Scanner scanner = new Scanner(System.in); 

        // Scanner(name of the class) 
        // scanner(name of object we will be working with)
        // new Scanner(System.in) (creates object we will be working in)
        

        System.out.print("Enter your name: "); // prompt for the usee to enter there name 
        String name = scanner.nextLine(); // doing something with an object so .(); is needed
        // . means access something belonging to this object 
        // paramthesis calls a method 
        // nextline reads a  string of characters inlcuding spaces 
        // next reads a string of characters not including spaces

        System.out.print("Enter your brothers name: ");
        String brotherName = scanner.next();


        System.out.print("Are you a student (Enter true/false): ");
        boolean isStudent = scanner.nextBoolean(); 

        System.out.println("Hello " + name); 
        System.out.println("Hello " + brotherName);
        System.out.println("I see " + isStudent );


        System.out.print("Much money u got ");
        int cash = scanner.nextInt(); 

        System.out.print("whats your fav color ");
        String color = scanner.nextLine(); 

        System.out.println("You got euros to the value of " + cash + " and your fav color is " + color); 
        // when you type in 5 and press enter you a /n appears and that blankspace is entered as the user input for the next line 
        // in this case euro is 5 put that blank space gets passed trhough for fav color 
        // to solve this add a         scanner.nextLine();



        System.out.print("Much mulla u got ");
        int mulla = scanner.nextInt(); 
        scanner.nextLine();

        System.out.print("whats your fav shade ");
        String shade = scanner.nextLine();

        System.out.println("You got mulla to the value of " + mulla + " and your fav color is " + shade); 




        // always good practice to close your scanner object
        scanner.close(); // when we dealing with objects these () will be needed 

    }

}