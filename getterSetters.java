public class getterSetters {
// NOTE THE VOITURE JAVA FILE IS APART OF THIS LESSON 

    public static void main(String[] args) {
        // Getter and setter methods help protect object data and they add rules for accessing and modifying them 
        // Getters = methods that make a field READABLE
        // Setters = methods that make a field WRITEABLE

        // Lets create a new class of voiture(car) 

        // and lets create a car object 
        // with this car object its attributes are publically accessible, meaning we can view and change them easily
        Voiture voiture1 = new Voiture("Pulsar", "Wine", 10000);
    //  System.out.println(voiture1.model + " " + voiture1.colour + " " + voiture1.price);


        // to demonstrae lets say the model of our voiture is now a BMW 
        // we dont want the model of our voiture to magically become a BMW, once we assign its model to be pulsar
        // we dont want it to change 
    //  voiture1.model = "BMW"; 
    //  System.out.println(voiture1.model + " " + voiture1.colour + " " + voiture1.price);

        // what we can do when declaring these attrivutes is add this access modifier of private preceding the datatype 
        // so lets do that in the class
        // we create a new attribute of type string called owner and we preced the datatype with the private keywor
        // now anytime we try access the owner attrivtur we get an error 
        // since owner is private we cant usually access outside of the voiture class 
        // but there is a way around that and that is by using getters and setters 
        // System.out.println(voiture1.owner);


        // Getter methods make a field readbale 
        // and setter methods make a field writeable 
        // get to read and set to write 

        // well set the getter methods first 
        // now we are going to change all attributes to private and get rid of the owner attribute
        // i would like the voitures model colour and price

        // the above print statements dont work 
        // rather than accessing these attributes directly because we cannot. we are going to call the getter mehtods on the object
        // we can now read the attributs we could not earleir 
        // another thing we can do with our getter methods is add logic
        // so for the get price method lets instead return a string. we will return a unit of currrency + price
        // getter methods make a field readable and you can add additional logic when retrieving one of these
        // attributes like how we did with the €  
        System.out.println(voiture1.getModel() + " " + voiture1.getColour() + " " + voiture1.getPrice());
        System.out.println();


        // now for setter methods. Setter methods make a field writable. lets go back to our voiture class
        // i cant change these the normal way
        // voiture1.colour = "red"; 
        // voiture1.price = 10500; 
        // because the colour and price attributes are still private 
        // instead we are going to call these setter methods
        voiture1.setColour("Red");
        voiture1.setPrice(10500); 
        System.out.println(voiture1.getModel() + " " + voiture1.getColour() + " " + voiture1.getPrice());
        System.out.println();


        // if you dont want an attribute to be writable at all. private final String model; 
        // now you cant change it all. if you try create a setter method in the class to change it itll display an error 
    

        // now lets look at adding logic within a setter method
        // lets test the logic 
        voiture1.setColour("Aqua");
        voiture1.setPrice(-100); 
        System.out.println(voiture1.getModel() + " " + voiture1.getColour() + " " + voiture1.getPrice());


        // depending on your objects attrivutes you may want some to be readbale, some to be writeable or both 

        


    
        
        
        
    }
}