//  a variable is a reusbale container for a value. A variable behaves as if it was the value it contains 

// 2 categories of vars we will discuss

// primitive = simple values stored directly in memory (stack)
// reference = actually hold memory addresses on the stack they point to a location in a differnent area known as a heap 
 
// primitive i give u 10 dollars 
// reference im giving u a iou that im owing u 10 dollars 

// primtive data types = int, double, char, boolean
// reference data types = string array object  

// lower case = primtive and uppercase = refernece 

public class variables
{
    public static void main(String[] args)
    {

        // declare a var than assign it a value 
        int x = 10;  

        int age; // declration
        age = 22; // assign a value 

        System.out.println("Mayank is " + age); // concatanation 

        char grade = 'A'; // single character and in single quotes
        char currency = '£'; 

        System.out.println(grade);


        boolean isStudent = true; // so isstudnet is to check if somones a student 
        // camelcase naming convention 

        boolean isNotStudent = false; 

        // if the isstudent variable is true print outr 
        if(isStudent) 
            {
                System.out.println("HI STUDENT");
            }


        
        // a string is a series of characters 
        String name = "Mayank"; // easy way to declare and assign a var of type string 


        // strings can contain numbers but we treat them more as chars rather than numbers that can be used for arithimetic 


            System.out.println("You are " + name + " " + age + " " + currency); 
            // look at how the cocantantion is peformed and the gaps we require 
            

    }



}