import java.util.Scanner;

public class bankingProgramme {

    public static void main(String[] args) {
        
        // declare vars
        double balance = 1000; 
        int userChoice;
        double amount; 

        Scanner scanner = new Scanner(System.in);

        // boot up programme 
        System.out.println("*****************");
        System.out.println("BANKING PROGRAMME");
        System.out.println("*****************");



        // display choices 
        displayMenu();

        // get and process user choice 

        System.out.print("Enter your choice (1-4): ");
        userChoice = scanner.nextInt(); 
        

        while(userChoice != 4){
            System.out.println();
            if (userChoice == 1) {
                showBalance(balance); 
            }
            else if(userChoice == 2){
                System.out.print("How much would you like to deposit $");
                amount = scanner.nextDouble(); 

                balance = deposit(balance, amount); 
        
            }
            else if(userChoice == 3){
                System.out.print("How much would you like to withdraw $");
                amount = scanner.nextDouble(); 

                double tempHolder = withdraw(balance, amount);

                if (tempHolder == -1) {
                    System.out.println("Insufficent funds... Returning to menu Try Again");
                }        
                else{
                    balance = tempHolder;
                }
 
            }
            else if (userChoice == 4) {
                break;
            }
            else{
                System.out.println("Invalid selection, try again; ");
            }

            System.out.println();
            System.out.println("Perfom another action or press 4 to exit");
            displayMenu();
            System.out.print("Enter your choice (1-4): ");
            userChoice = scanner.nextInt();
        }

        // exit message 
        System.out.println("Thank you for using our programme!");


        scanner.close();
    }


    // displayMenu method 
    static void displayMenu()
    {
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("*****************");
        
    }


    // showBalance method 
    static void showBalance(double balance){
        System.out.printf("Your balance is $%.2f\n", balance);
    } 

    // deposit method 
    static double deposit(double balance, double amount){
        
            System.out.printf("You have succesfully deposited $%.2f\n", amount);
            balance += amount; 
            System.out.printf("Your new balance is $%.2f\n", balance);

            return balance; 
        
    }
    


    // withdraw method 
    static double withdraw(double balance, double amount){
        
        if (amount <= balance) {
            System.out.printf("You have succesfully withdrew $%.2f\n", amount);
            balance -= amount; 
            System.out.printf("Your new balance is $%.2f\n", balance);

            return balance; 
        }
                return -1;

               
        
        
        }
}