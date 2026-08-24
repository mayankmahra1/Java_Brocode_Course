import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {

    public static void main(String[] args) {
        // Exception = is an event that interrupts the normal flow of a programme 
        // These exceptions pop up if you do something like divide by zero, file not found, mismatch input type 
        // these sort of events interrupt your programme and they are called exceptions 
        // theres a way we can handle them and thats by using a few blocks of code 
        // try{} block{} and optionally finally{}
        // any code thats consdered or it might interrupt your programme, surround it with a try{} block 
        
        // lets say i want to take a number and divide it by zero. Mathematically speaking you can't divide by zero
        // that causes an exception more specfically an arithmetic exception 
        // this code is dangerous its interrupting our programme by causing an exception 
        // but we can gracefully handle this exception so that it does not interrupt the normal flow of our programme 
        // System.out.println(1 / 0);


        // so any dangerous code we are going to suuroudn with a try block 
        // however if we have a try block we also need a catch block. we will catch any exceptions 
        // but we are going to list the specific type of excpetion we are going to catch 
        // and in this case lets catch that one excpetion the ArithmeticException
        // this is the type we are setting up the parameter here. ArithmeticException is the type 
        // we will give this excpetion a name of e as a nickname
        // if we enoucnter this excpetion we can take a differnt course of action rather than interrupt the programme 
        // now if we run this again it doesnt interrupt our programme. We catch the exception and output this code instead
        // any code thats dangerous and might casue an exception you can surround with a try block 
        // you can add more than one catch block. to catch and handle specific exceptions 

        Scanner scanner = new Scanner(System.in); 

        try{
            System.out.println(1 / 0);
        }
        catch(ArithmeticException e){ 
            System.out.println("You cannot divide by 0!!!");
        }   
        System.out.println();


        // anytime you accept userinput its almost always dangerous code because a user can type in anything 
        // if we enter no then we get a InputMismatchException. java was expecting an integr but we typed a string instead
        // we can handle these exceptions too 
        // the InputMismatchException we do have to import but we can gice it the same nickname e
        // you can catch an handle more than one excpetion
        // there is a catch all excpetion you could add
        // you could catch all exception
        // then theres the finally block. this will always execute whether theres an exception or not 
        // this is where you might clean up any resources like closing a scanner 
        // because if we encounter a exception we might not close our scanner
        // or to close a file 
        try{
            System.out.print("Enter a number : ");
            int number = scanner.nextInt(); 
            System.out.println(number);
        }
        catch(InputMismatchException e){ 
            System.out.println("That was not a number");
        }
        catch(ArithmeticException e){ 
            System.out.println("You cannot divide by 0!!!");
        }
        finally{
            scanner.close();
        }


        // you could catch all exception
        // but its better to let the user know what specifically went wrong
        // but i named my class Exception so it aint gonna work rn
        // it acts a safety net and is best to be used at the end after checking for all exceptions 
/*        
        try{
            System.out.print("Enter a number : ");
            int number = scanner.nextInt(); 
            System.out.println(number);
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        } */ 


        // theres also try with resources where we create our scanner object within the try block 
        // and the java automatically cloes those resourfes 

   


     
    



    }
}