import java.util.Random;

public class cheatSheet {

    public static void main(String[] args) {
        

        String name = "";
        String surname = " ";
    
        System.out.println(name.isEmpty()); // checks whether string has 0 characters
        System.out.println(name.isBlank()); // checks whether string is empty or only has white space

        System.out.println(surname.isEmpty()); // checks whether string has 0 characters
        System.out.println(surname.isBlank()); // checks whether string is empty or only has white space

        System.out.println();

        ////////////////////////////////////////////////////////////////////////////////////////////////////
        
        Random random = new Random(); // similar to we create scanner object but we do not need system.in idk why
        
        int number; 
        int die;
        double decimal;
        boolean isHeads; 

        number = random.nextInt();  // this will generate a random number 
        System.out.println(number); // number is very large its in range of -2bill and +2bill 

        die = random.nextInt(1,7); // gives a random number between 1 and 6. 1st number is inclusive second is exclusive
        System.out.println(die);

        System.out.println();

        ////////////////////////////////////////////////////////////////////////////////////////////////////
        
        System.out.println(Math.pow(3, 2));

       

        
    }
}