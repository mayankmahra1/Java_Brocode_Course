import java.util.Scanner;

public class searchAnArray {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // integer linear search
        // linear search is it what it is called in DS&A 
        // which is were you use a for loop to iterate through an array 

        int[] numbers = {1, 9, 2, 8, 3, 5, 4};
        int target = 10; 
        boolean isFoundInt = false;

        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] == target) {
                System.out.println("Element found at index: " + i);
                isFoundInt = true;
                break; // if we find the target break out of the loop 
            }
        }

        if (!isFoundInt) {
            System.out.println("Target not found");
        }

        System.out.println();




        // string array linear search 

        String goal;
        boolean isFoundString = false; 
        String[] fruits = {"Banana", "Pears", "Mangoes", "Apples", "Oranges"}; 


        System.out.print("Enter the element you would like to search for: ");
        goal = scanner.nextLine(); 

  


        for(int i = 0; i < fruits.length; i++){
            if(fruits[i].equalsIgnoreCase(goal)){ // .equalsIgnoreCase() for strings. // cannot use == because youd be comparing memiry addresses 
                System.out.println("Element found at index " + i);
                isFoundString = true; 
                break; 
            }
        }

        if(!isFoundString){
            System.out.println("Goal not found");
        }







        scanner.close();
    }
}