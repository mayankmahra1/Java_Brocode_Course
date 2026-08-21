public class Users {

    // lets say users have 3 attributes 
    // lets say when we create a user object in the main java file these three fields are optional 
    // if these three attributes are optional we may or may not receive them when we construct a user object

    String username; 
    String email; 
    int age; 


    // lets create a constructor if somebody were to create a user object with just a user name 
    // remember to create a constructor Users(){}
    // this. here think of it as user1.username 
    // we can also set up our default values for our other attributes
    Users(String username){
        this.username = username; 
        this.email = "Not Provided"; 
        this.age = 0;
    }

    // now lets create a constrcutor if somebody were to create a user object with a username and a email
    // similary to overloaded methods the signature(method name and parameters) cannot be the same
    // now our email attribute equals the email we receive
    // now when we create a user object in the main java file we can use either of these constructors depending on 
    // the arguments we pass in 
    Users(String username, String email){
        this.username = username; 
        this.email = email; 
        this.age = 0; 
    }

    // now lets create a third user 
    // this time we will have a parameters for all three attributes
    // user1.username = username(parameters in constructor)
    Users(String username, String email, int age){
        this.username = username;
        this.email = email; 
        this.age = age; 
    }

    // how about we set up a constructor that accepts no arguments
    // this will be kind of an anonymous profile 
    Users(){
        this.username = "John Doe";
        this.email = "Not Provided"; 
        this.age = 0;
    }

}