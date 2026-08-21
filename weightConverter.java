import java.util.Scanner;

public class weightConverter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); 
    
        int choice;
        double weight; 
        double newWeight; 
        
        
        System.out.println("Weight Conversion Programme");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");
        System.out.print("Choose an option ");

        choice = scanner.nextInt(); 

        if(choice == 1){
            System.out.print("Enter weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592; 
            System.out.println("The new weight in kgs is: " + newWeight);
        }
        else if(choice == 2){
            System.out.print("Enter weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462; 
            System.out.println("The new weight in lbs is: " + newWeight);
        }
        else{
            System.out.println("Your choice is invalid");
        }

        scanner.close();
    }
}