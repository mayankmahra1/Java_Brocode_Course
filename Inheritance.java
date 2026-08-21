// NOTE THE Organism, PLANT, ANIMAL, DOG & CAT JAVA FILE IS APART OF THIS LESSON 


public class Inheritance {
    // Inheritance is where one class inherits the attributes and methods from another
    // much like how a child can inherit traits from a parent 

    public static void main(String[] args) {

        // lets test to see whether the dog and cat class actually inherited from the animal class even though they have nothing in them
        // at the moment 
        // Although cat and dog do not have anything in them they are the childs of the parent class Animal therefore they 
        // inherit the attributes and methods of the animal class
        // we are following the dry principal dont repeat yoursefl
        // imgaine there was no inheritance and we made seperate classes for each type of animal
        // lets say we made a mistake then we would have to change each class but here we can just modify the parent class
        Dog dog1 = new Dog(); 
        dog1.eat();
        System.out.println(dog1.isAlive);
        System.out.println();

        Cat cat1 = new Cat(); 
        cat1.eat(); 
        System.out.println(cat1.isAlive);
        System.out.println();

        // now that weve made changes to our dog and cat class lets output them
        System.out.println(dog1.lives);
        dog1.speak();
        System.out.println();

        System.out.println(cat1.lives);
        cat1.speak();
        System.out.println();

        // there is also the concept of multilevel inheritance 
        // we'll create a new class which serves as grandparent so instead of child <- parent 
        // we now have child <- parent <- grandparent 
        // the child class will inherit from the parent and the parent class will inherit from the grand parent
        // child class being cat and dog, parent class being animal and grandparent class being organism
        // we now have to add our extends keyword to our Animals class
        

        // Now Animal inherits from organism and dog and cat inherits from animal 
        // In the eyes of the dog and cat class organism is a grandparent 
        Dog dog2 = new Dog(); 
        Cat cat2 = new Cat(); 

        System.out.println(dog2.isAlive);
        System.out.println(cat2.isAlive);
        System.out.println();

        // lets take this a step further and create a class of plant 
        // plants are going to inherit from the organism class because plants are a type of organism but they are
        // not related to animals
        // it should have  a isalive attribute which it inherits from the organism class and also a photosynthesize method it 
        // contains within its own class
        Plant plant1 = new Plant(); 
        System.out.println(plant1.isAlive);
        plant1.photosynthesize();


        // we have a whole family tree
        // dog and cats inherit from animal
        // animal inherits from organism
        // plant inherits from organism 
        // but animals and plants are not related 
        // they are siblings but they are not the same 

        
    }


}
