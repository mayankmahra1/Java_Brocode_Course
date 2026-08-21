import java.util.Scanner; // scanner class util package 

public class ifStatements{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); 

        String name; 

        System.out.print("Enter your name: ");
        name = scanner.nextLine(); 

        if(name.isEmpty()){ // .isEmpty is a built in string method  instead of name == "". // is empty will give a boolean of T or F
            System.out.println("You did not enter a name");
        }
        else{
            System.out.println("Hello " + name);
        }
        
        
        scanner.close();
    }
}