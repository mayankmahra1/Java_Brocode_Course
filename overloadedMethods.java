public class overloadedMethods {

    public static void main(String[] args) {
        // overloaded methods are methods that share the same name but they have different parameters
        // Siganture = name + parameters
        // A methods name + its parameters will give you a unique method signature
        // each method signature must be unique
        // no two methods can have the same signature
        // But two methods can share the same name 

        // given i only have the add method created but the add method which only accepts doubles lets 
        // see what happnes when i call it and pass in two integers
        System.out.println(add(1, 2));

        // what if i would like to add 3 numbers 
        // and i pass it into the first add method which is all i have created so far 
        // i get an error
        // so lets create an add method with 3 parameters
        // now it uses the 2nd add method i created because the signatures match (name and parameters)
        System.out.println(add(1, 2, 3));
        System.out.println();



    }

    // because we are gonna call this method from the main method which is static this method must also be static
    // no void because we are returning something
    // what we are returning is a double 
    // this method has 2 parameters both of type double
    static double add(double a, double b){

        return a + b; 
    }

    static double add(double a, double b, double c){

        return a + b + c; 
    }

   
}