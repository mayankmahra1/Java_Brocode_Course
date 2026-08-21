import java.util.Scanner;


public class userInputArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // empty string of length 3
        // String[] cheeses = new String[3]; 
        int quantity;
        String[] fastFood;



        // before assigning values into an array 
        // the compiler needs to know the size of the array before hand 
        
        
        System.out.print("What number of food do you want: ");
        quantity = scanner.nextInt(); 
        
        // since we are accepting a string and then a integer we have to clear the input buffer 
        scanner.nextLine();



        fastFood = new String[quantity];

        // String[] fastFood = new String[quantity]; // creates an array of empty with length 5(5 elements)

        for(int i = 0; i < fastFood.length; i++){
                System.out.print("Enter a food: ");
                fastFood[i] = scanner.nextLine();
            }

            System.out.println(4
        
            );

        for(String food : fastFood){
            System.out.println(food);
        }

            






        scanner.close();
        
    }
}