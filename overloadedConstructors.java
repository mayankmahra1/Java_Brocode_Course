public class overloadedConstructors {
    // NOTE THE USERS FILE IS APART OF THIS LESSON 

    public static void main(String[] args) {
        
        // overloaded constructors allow a class to have multiple constructors with different parameter lists
        // much like overloaded methods
        // they enable an object to be initialized in various ways 
        // these are great in scenarious where some fields are optional when creating an object 

        // lets create a user class 
        
        // create our first user object
        // in order to create our first user object we need to pass in a String
        // because we did not have the ability to pass arguments our user object takes the default values in the constructor 
        Users user1 = new Users("Mayank"); 
        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);
        System.out.println();

        // lets create a second user object where we pass two arguments
        // see how we create different objects given the arguments
        Users user2 = new Users("Mebin", "Mebinmango@gmail.com");
        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);
        System.out.println();

        // now lets create a third user object where we pass 3 arguments
        Users user3 = new Users("Abdul", "Abdul_Hadi_Khan@maynooth.ie", 23); 
        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);
        System.out.println();

        // now lets create a fourth user object where we pass no arguments
        Users user4 = new Users(); 
        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);
        





    }
}