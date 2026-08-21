import java.util.Scanner;

public class whileLoops {

    public static void main(String[] args) {
        
        // while loop = repeat some code forver while some condition remains true 
        
        Scanner scanner = new Scanner(System.in); 

        String name = "";
        String name2 = "";

        if(name.isEmpty()){
            System.out.print("Enter your name ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);

        // this works but if we just press enter it says hello blank 


        // to prevent people from doing this ie skipping prompts we can use a while loop 
        // this forces the prompt to keep appearing till a user enters his or her name
        
        while (name2.isEmpty()) {
            System.out.print("Enter your Name ");
            name2 = scanner.nextLine();
            
        }



        scanner.close();
    }
}