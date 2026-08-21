import java.util.Scanner;

public class logicalOperators {

    public static void main(String[] args) {
        // && = and
        // || = or 
        // ! = Not 

        // logical operators allow us to check or modify more than one condition 

        double temp = 20;
        boolean isSunny = false;

        // && is used to check more than one condition and we can add as many as we like 
        if(temp <= 30 && temp >= 0){
            System.out.println("The weather is good");
        }

        if(temp != 15){
            System.out.println("The tempature is not 15C");
        }

        if (!isSunny) {
            System.out.println("Its not sunny unfortunately");
        }

        if(temp <= 20 || temp == 0){
            System.out.println("yo");
        }

        // mini task
        // username must be between 4 and 12 chars long 
        // username must not conatin spaces


        Scanner scanner = new Scanner(System.in);

        String username; 

        System.out.print("Enter a username: ");
        username = scanner.nextLine();

        if(username.length()>=4 && username.length()<=12 && !username.contains(" "))
            {
                System.out.println(username + " Is a valid username");
            }
            else{
                System.out.println("Invalid username");
            }












        scanner.close();

    }
}