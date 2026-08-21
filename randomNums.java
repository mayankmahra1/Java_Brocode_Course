import java.util.Random; // to work with random nums we need to import random class 

public class randomNums {

    public static void main(String[] args) {

        Random random = new Random(); // similar to we create scanner object but we do not need system.in idk why
        
        int number; 
        int die;
        double decimal;
        boolean isHeads; 

        number = random.nextInt();  // this will generate a random number 
        System.out.println(number); // number is very large its in range of -2bill and +2bill 

        die = random.nextInt(1,7); // gives a random number between 1 and 6. 1st number is inclusive second is exclusive
        System.out.println(die);

        decimal = random.nextDouble(); // a random number between 0 and 1 
        System.out.println(decimal);

        isHeads = random.nextBoolean();
        System.out.println(isHeads);




 

    }
}