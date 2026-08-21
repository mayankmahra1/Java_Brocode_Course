public class methods {

    public static void main(String[] args) {
        
        // methods = a block of reusable code that is executed when u call it ()
        // methods associate them with ()
        // to call a method you use a set of paranthesis 

        // methods are useful because you can right code once and reuse whenevr u want


        // task sing happy birthday song 3 times 
        // to sing the full song 3 times i would need to write out these print statements an additional 2 more times each 
        // so 12 print statements in total
        // and remember in programming dont repeat yourself if you dont have to

        String name = "Mayank"; 
        int age = 22; 

        System.out.println("Happy birthday to you");
        System.out.println("Happy birthday dear you");
        System.out.println("You are X years old");
        System.out.println("Happy birthday to you");
        System.out.println();

        // to not repeat ourselves we create a method 
        // when passing arguments make sure it matches in data type & order of parameters in the method your calling 
        happyBirtday(name, age);


        // Lets Create a method to square a number 

        double num1 = 3.0; 

       double squaredAge = squareAge(num1);
       System.out.println(squaredAge);
        




        
            }
        


            // to create a method in jave outside of the main method we: 
        
            // a method can return something so type void 
            // we also need a name for the method
            // we need a return type(void) a name for the method thats descriptive (happyBirthday), paranthesis   and curly braces
            // java wants this method to be static 
            // but because we are gonna call this method from the main method which is static this must also be static 

            static void happyBirtday(String name, int age){ // happy birthday method set up to receive the
            //  argument which is of format string

        // methods are unfamiliar (or cannnot find) with any variables declared in other methods
        // to solve this we pass arguments to the method 
        // our method of happybirthday isnt set up to receive arguments
        // if you send any values or vars to a method via arguments you need a matching set of what you would call paramters
        // arguments is what you pass through when u call the function 
        // parameters is what is set up in the actual method paranthesis ie wha the method can accept 
        // to set up parameters you list the data of what u want to reciveve follwoed by a descriptive name whcih does not have to match
        // what is passed through as arguments in terms of name 


        System.out.println("Happy birthday to you");
        System.out.printf("Happy birthday dear %s\n", name);
        System.out.printf("You are %d years old\n", age);
        System.out.println("Happy birthday to you");
    }


            // with a method it also has the capability to return a value 
            // when we are not returning anything we use the keyword void 
            // since we are returning something we omit it 
            // since we are returning a double we 
            static double squareAge(double num1){

                return Math.pow(num1, 2);
            }







}
