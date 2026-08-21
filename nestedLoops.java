import java.util.Scanner;

public class nestedLoops {

    public static void main(String[] args) {
        
        // nested loop = a loop inside another loop 
        // nested loops are often used with matrices or DS&A 

        // lets say i want to print nums 1-9. 
        // pretty easy with a for loop 
        for(int i = 0; i <= 9; i++){
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("");

    
        // now lets say i want to do that three times. so 1-9 1-9 1-9 
        // i could do 3 for loops 
        // but this a lot of repeating code and in programming your taught dont repeat yourself if you dont have to 

        // instead we can do this using to for loops or nested loops 


        // if we have a loop inside of a loop we cant declare the same index twice. and using it between both loops can get 
        // confusing therefore better to have two seperate loops 
        for(int i = 0; i < 3; i++){

            for(int j = 0; j <= 9; j++){
                System.out.print(j + " ");
            }

            System.out.println("");

        }

        // mini project 
        // we are going to create a matrix of a given symbol the user types in. the user will also set the rows and columns for
        // the matrix 

        Scanner scanner = new Scanner(System.in);

        int rows; 
        int cols; 
        char symbol; 

        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter the number of cols ");
        cols = scanner.nextInt(); 

        System.out.print("Enter a symbol ");
        symbol = scanner.next().charAt(0); 



        for(int i = 1; i <= rows; i++){
            for(int j = 1; j<= cols; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }



        

        scanner.close();


    }
}