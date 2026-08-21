public class Interfaces {
    // NOTE THE Prey, Predator, Rabbit fish and hawk FILE IS APART OF THIS LESSON 

    public static void main(String[] args) {
        // Interface is very similar to an abstract class in fact theres a lot of overlap where you could use each one 
        // But theres a few key differences
        // An interface is a blueprint for a class that specifies a set of abstract methods that implementing classes must define 
        // With Interfaces we can support multiple inheritance like behaviour 
        // Normally with an inheritance a class can only have a single parent but using interfaces a class can have 
        // multiple parents 
        

        // so in this demo lets create two interfaces 
        // and also create some classes 

        // lets create a rabbit object and test our flee method 
        Rabbit rabbit = new Rabbit(); 
        rabbit.flee();
        System.out.println();

        // lets do the same for for hawk
        Hawk hawk = new Hawk(); 
        hawk.hunt();

        // its important to now that rabbits dont have a hunt method and hawks dont have a flee method 
        // These moves us on to the key differnce between Interfaces and abstract classes is that you can implement
        // more than one interface. so we are going to do that in the fish class

        // now that thats done lets create a fish object and test our methods
        Fish fish = new Fish(); 
        fish.flee();
        fish.hunt();

        // Key differnece between interfaces and abstract classes. when you use interfaces the classes can inherit more than one 
        // interface 
        // normally with inheritance you can only have one parent but this is a way around that using interfaces 





    }
}