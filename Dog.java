public class Dog extends Animal {

    // Dogs and cats are types of animals
    // our animal class will be the parent our dog and cat class will be its children
    // in order for a class to inherit all the attritbutes and methods from another class you must use the extends keyword when 
    // creating the class then specify the parent class 
    // our dog class will now inherit all the atttributes and methods from the animal class


    // each child class can have its unique attributes and methods too 
    // lets say all dogs have 1 life
    int lives = 1;

    // they will also have their unique speak method 
    void speak(){
        System.out.println("The dog goes Woof");
    }

    
}