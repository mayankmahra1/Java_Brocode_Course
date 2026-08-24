public class Che {

    // what sort of attributes do Ches have 
    // lets say model year and a engine object 
    // this will display an error for now because we have not yet created an Engine class therefore it is 
    // impossible to make an engine object 
    String model; 
    int year; 
    Engine engine; 

    // we'll need a constructor
    // now for the engine we are not going to be passing in a engine object, lets say that when we construct a car object 
    // we have to pass in a String for the engine type. is it inline engine or v6 that sorta thing. 
    // now for this.engine we are going to call the constructor for the new engine object and then we can pass in our 
    // engineType. but we stil have to set up the constructor for our engine class. 
    // when constructing a car object we will also be constructing a new engine object 
    // so lets go to our engine class 
    // now for where we have engineType we could replace it with just type. this term is kind of ambiguous tho because 
    // a user is going to think that the type is for the car type rather than the engine type. 
    // so when you pass arguments youre parameters names can be different from the argument names you pass in  
    Che(String model, int year, String engineType){
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType); 
    }

    void start(){
        this.engine.start();
        System.out.println("The " + this.model + " Is running");
    }
}