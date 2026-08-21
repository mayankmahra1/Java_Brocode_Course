import java.util.Scanner;

public class compoundInterest {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 

        double principal; 
        double intRate; 
        int timesCompounded; 
        int years; 
        double amount; 

       System.out.print("Enter the principal Amount: ");
       principal = scanner.nextDouble();

       System.out.print("Enter the interest rate (in %): ");
       intRate = scanner.nextDouble() / 100;

       System.out.print("Enter the # of times compounded per year ");
       timesCompounded = scanner.nextInt(); 

       System.out.print("Enter the # of years: ");
       years = scanner.nextInt(); 


       amount = principal * Math.pow(1 + intRate / timesCompounded, timesCompounded * years);

       System.out.printf("The amount after %d year(s) is $%.2f ", years, amount);
      



        



        scanner.close();
    }
}