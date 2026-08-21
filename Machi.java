public class Machi extends Janvar{
    

    // lets define a unique move method 
    // its good to add this annotation of override so that you and other developers know that this method overides another
    // the machi class does inherit a move method from the janvar class. but if it has its own version of that method within
    // its own class itll use that first 
    // if i spelt the method diffently to what its spelled in the parent class than the override would be red
    // to say you arent overriding anything
    @Override
    void move(){
        System.out.println("This Animal is swimming");
    }

    
}