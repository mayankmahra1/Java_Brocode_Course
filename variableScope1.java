public class variableScope1 {
    
    // a class variable is delcared inside of a class but not within any methods 

    static int x = 3; // Class scope 
    // java will chose local over scope if vars have the same name 



    public static void main(String[] args) {
        // variable scope = is where a variable can be accessed 

        // 2 levels we will discuss in this lession 
        // local and class 


        // starting with local 

        // inside a method if you delcare a var it has what is called local scope 
        // if x was declared outside of the main method its not recognised thast why if we create anotehr method we have to 
        // pass it as an argument 


        int x = 1;         // a local scope to the mani method 
        System.out.println(x);

        doSomething();


    }

    // inside this method i can also declare a variable called x 
    static void doSomething(){
        int x = 2; // local scope to doSomething method 
        System.out.println(2);

    }
}