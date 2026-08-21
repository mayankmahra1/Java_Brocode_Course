public class Vehicles {

     // lets say vehicles have the following attributes
     String model; 
     String colour; 

     // we will need a vehicle constructor 
     Vehicles(String model, String colour){
        this.model = model; 
        this.colour = colour; 
    }

    // we will add one method
    // void which means we are not returning anything
    // no static because there is no main method and class together they are seperate
    // we use static when we are calling from the main method. because the main method is static 
    // then so should the method 
    // note how you use this. in the method also
    // so lets so called the method on an object called vehicle1
    // then imagine vehicle1.colour
    void drive(){
        System.out.println("You drive the " + this.colour + " " + this.model);
    }
}