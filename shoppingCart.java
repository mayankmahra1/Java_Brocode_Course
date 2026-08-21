import java.util.Scanner;  // util is package and scanner is the class 

public class shoppingCart
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // from scanner class we create a scanner obj 

        System.out.print("What item would you like to buy?: ");
        String item = scanner.nextLine(); 

        System.out.print("What is the price for each?: ");
        double price = scanner.nextDouble();
        
        System.out.print("How many would you like?: ");
        int quantity = scanner.nextInt(); 

        System.out.println("\nYou have bought 3 " + item + "/s");
        System.out.println("Your total is " + price*quantity);

        scanner.close(); // we are calling a method on a object so we use round paranthesis 
    }
}

// It would be better practice to declare all variables at the top 