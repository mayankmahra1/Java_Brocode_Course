public interface Prey {
    // instead of public class we use public interface

    
    // lets declare some methods but not define them as of yet
    // if a class inherits from the prey interface they will have to finish defining a method of flee
    // if your considered a prey you need a flee method to run away
    void flee(); 
}