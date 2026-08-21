import java.util.Scanner;

public class mathClass {

    public static void main(String[] args) {

        
        // if you need the value of pi there is a built in constant of the math class 

        Scanner scanner = new Scanner(System.in);


        System.out.println(Math.PI); // all caps 
        System.out.println(Math.E);

        double result; 
        double result2;
        double result3; 
        double result4;
        double result5; 
        double result6; 
        double result7; 
        double result8; 


        result = Math.pow(2, 3); // to raise 2 to the power of 3 2^3 
        System.out.println(result); 

        result2 = Math.abs(-5); // absolute value function 
        System.out.println(result2); 

        result3 = Math.sqrt(9); // sqrt function 
        System.out.println(result3);

        result4 = Math.round(6.98); // round function rounds to nearest whole integer 
        System.out.println(result4);

        result5 = Math.ceil(9.1); // to always round up we have the Math.ceil method
        System.out.println(result5);

        result6 = Math.floor(8.95); // to round down we have Math.floor method 
        System.out.println(result6);

        result7 = Math.max(1, 9);  // what is max between 1 and 9 using Math.max 
        System.out.println(result7);

        result8 = Math.min(1, 9); // what is min between 1 and 9 using Math.min 
        System.out.println(result8);


        // hypotnuse method 

        double a; 
        double b; 
        double c; 

        System.out.print("Enter length for side A: ");
        a = scanner.nextDouble(); 

        System.out.print("Enter length for side B: ");
        b = scanner.nextDouble(); 

        // c = sqrt(a^2 + b^2)

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Hypotnuse is : " + c);
        



        


        scanner.close();
    }
}